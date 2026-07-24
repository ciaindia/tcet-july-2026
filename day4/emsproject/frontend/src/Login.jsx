import React, { useState } from 'react';
import { useNavigate, Link } from 'react-router-dom';
import api from './api';

function Login() {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [error, setError] = useState('');
    const navigate = useNavigate();

    const handleLogin = async (e) => {
        e.preventDefault();
        try {
            const response = await api.post('/auth/login', { username, password });
            localStorage.setItem('jwtToken', response.data.jwtToken);
            navigate('/dashboard');
        } catch (err) {
            setError('Invalid credentials');
        }
    };

    return (
        <div className="auth-view">
            <div className="auth-card">
                <h1>Welcome Back</h1>
                <p>Sign in to manage your employees</p>
                <form onSubmit={handleLogin}>
                    <div className="input-group">
                        <label>Username</label>
                        <input type="text" value={username} onChange={e => setUsername(e.target.value)} required />
                    </div>
                    <div className="input-group">
                        <label>Password</label>
                        <input type="password" value={password} onChange={e => setPassword(e.target.value)} required />
                    </div>
                    {error && <p className="error-msg">{error}</p>}
                    <button type="submit" className="btn primary-btn">Login</button>
                    <p className="switch-auth">Don't have an account? <Link to="/register">Register here</Link></p>
                </form>
            </div>
        </div>
    );
}

export default Login;
