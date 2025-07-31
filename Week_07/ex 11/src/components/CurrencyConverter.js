// src/components/CurrencyConverter.js
import React, { useState } from 'react';

const CurrencyConverter = () => {
    const [rupees, setRupees] = useState('');
    const [euro, setEuro] = useState(null);

    const handleSubmit = (event) => {
        event.preventDefault();
        const converted = parseFloat(rupees) / 90; // Assume 1 Euro = 90 INR
        setEuro(converted.toFixed(2));
    };

    return (
        <div style={{ textAlign: 'center', marginTop: '30px' }}>
            <h2>Currency Converter</h2>
            <form onSubmit={handleSubmit}>
                <input
                    type="number"
                    value={rupees}
                    onChange={(e) => setRupees(e.target.value)}
                    placeholder="Enter Rupees"
                />{' '}
                <button type="submit">Convert</button>
            </form>
            {euro && (
                <p>€ {euro} Euro</p>
            )}
        </div>
    );
};

export default CurrencyConverter;
