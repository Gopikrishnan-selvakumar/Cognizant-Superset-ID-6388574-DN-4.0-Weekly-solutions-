// src/components/UserPage.js
import React from 'react';

const UserPage = () => {
    return (
        <div style={{ textAlign: 'center' }}>
            <h2>Welcome Back, User!</h2>
            <p>Book Your Ticket Now ✈️</p>
            <form>
                <label>Passenger Name: </label>
                <input type="text" placeholder="Enter Name" /><br /><br />
                <label>Flight: AI202</label><br /><br />
                <button type="submit">Book Ticket</button>
            </form>
        </div>
    );
};

export default UserPage;
