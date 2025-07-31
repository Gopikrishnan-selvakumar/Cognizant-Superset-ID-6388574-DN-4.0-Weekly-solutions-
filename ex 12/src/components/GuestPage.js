// src/components/GuestPage.js
import React from 'react';

const GuestPage = () => {
    return (
        <div style={{ textAlign: 'center' }}>
            <h2>Welcome Guest!</h2>
            <p>Flight Details:</p>
            <ul style={{ listStyleType: 'none' }}>
                <li>Flight: AI202</li>
                <li>From: Chennai</li>
                <li>To: Delhi</li>
                <li>Time: 10:00 AM</li>
            </ul>
            <p>Please Login to book your ticket!</p>
        </div>
    );
};

export default GuestPage;
