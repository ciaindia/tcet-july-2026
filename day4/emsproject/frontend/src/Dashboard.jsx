import React, { useState, useEffect } from 'react';
import { useNavigate } from 'react-router-dom';
import api from './api';

function Dashboard() {
    const [employees, setEmployees] = useState([]);
    const [showModal, setShowModal] = useState(false);
    const [formData, setFormData] = useState({ id: '', name: '', department: '', salary: '' });
    const navigate = useNavigate();

    useEffect(() => {
        fetchEmployees();
    }, []);

    const fetchEmployees = async () => {
        try {
            const res = await api.get('/employees');
            setEmployees(res.data);
        } catch (err) {
            if (err.response?.status === 401 || err.response?.status === 403) {
                handleLogout();
            }
        }
    };

    const handleLogout = () => {
        localStorage.removeItem('jwtToken');
        navigate('/login');
    };

    const handleDelete = async (id) => {
        if (!window.confirm('Are you sure you want to delete this employee?')) return;
        await api.delete(`/employees/${id}`);
        fetchEmployees();
    };

    const handleEdit = (emp) => {
        setFormData(emp);
        setShowModal(true);
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        const payload = { ...formData, salary: parseInt(formData.salary) };
        if (formData.id) {
            await api.put(`/employees/${formData.id}`, payload);
        } else {
            await api.post('/employees', payload);
        }
        setShowModal(false);
        setFormData({ id: '', name: '', department: '', salary: '' });
        fetchEmployees();
    };

    return (
        <div className="dashboard-view">
            <header className="navbar">
                <div className="brand">Employee EMS</div>
                <button onClick={handleLogout} className="btn secondary-btn">Logout</button>
            </header>
            <main className="dashboard-content">
                <div className="dashboard-header">
                    <h2>Employee Directory</h2>
                    <button onClick={() => { setFormData({ id: '', name: '', department: '', salary: '' }); setShowModal(true); }} className="btn primary-btn">+ Add Employee</button>
                </div>
                <div className="table-container">
                    <table>
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Name</th>
                                <th>Department</th>
                                <th>Salary</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            {employees.map(emp => (
                                <tr key={emp.id}>
                                    <td>{emp.id}</td>
                                    <td>{emp.name}</td>
                                    <td>{emp.department}</td>
                                    <td>₹{emp.salary.toLocaleString('en-IN')}</td>
                                    <td>
                                        <button className="action-btn edit-btn" onClick={() => handleEdit(emp)}>Edit</button>
                                        <button className="action-btn delete-btn" onClick={() => handleDelete(emp.id)}>Delete</button>
                                    </td>
                                </tr>
                            ))}
                        </tbody>
                    </table>
                </div>
            </main>

            {showModal && (
                <div className="modal active">
                    <div className="modal-content">
                        <h3>{formData.id ? 'Edit Employee' : 'Add Employee'}</h3>
                        <form onSubmit={handleSubmit}>
                            <div className="input-group">
                                <label>Name</label>
                                <input type="text" value={formData.name} onChange={e => setFormData({...formData, name: e.target.value})} required />
                            </div>
                            <div className="input-group">
                                <label>Department</label>
                                <input type="text" value={formData.department} onChange={e => setFormData({...formData, department: e.target.value})} required />
                            </div>
                            <div className="input-group">
                                <label>Salary</label>
                                <input type="number" value={formData.salary} onChange={e => setFormData({...formData, salary: e.target.value})} required />
                            </div>
                            <div className="modal-actions">
                                <button type="button" onClick={() => setShowModal(false)} className="btn secondary-btn">Cancel</button>
                                <button type="submit" className="btn primary-btn">Save</button>
                            </div>
                        </form>
                    </div>
                </div>
            )}
        </div>
    );
}

export default Dashboard;
