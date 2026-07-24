import React, { useState } from 'react';
import { useNavigate, Link } from 'react-router-dom';
import api from './api';

function Register() {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [error, setError] = useState('');
    const navigate = useNavigate();

    const handleRegister = async (e) => {
        e.preventDefault();
        try {
            await api.post('/auth/register', { username, password });
            navigate('/login');
        } catch (err) {
            setError('Registration failed or username exists');
        }
    };

    return (
        <div className="auth-view">
            <div className="auth-card">
                <h1>Create Account</h1>
                <p>Register a new administrator account</p>
                <form onSubmit={handleRegister}>
                    <div className="input-group">
                        <label>Username</label>
                        <input type="text" value={username} onChange={e => setUsername(e.target.value)} required />
                    </div>
                    <div className="input-group">
                        <label>Password</label>
                        <input type="password" value={password} onChange={e => setPassword(e.target.value)} required />
                    </div>
                    {error && <p className="error-msg">{error}</p>}
                    <button type="submit" className="btn primary-btn">Register</button>
                    <p className="switch-auth">Already have an account? <Link to="/login">Login here</Link></p>
                </form>
            </div>
        </div>
    );
}

export default Register;
