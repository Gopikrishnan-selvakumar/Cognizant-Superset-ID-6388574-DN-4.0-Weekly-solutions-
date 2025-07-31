// src/components/OfficeList.js
import React from 'react';

const OfficeList = () => {
    const heading = "Office Space Rental";

    const officeImage = "https://via.placeholder.com/300x200?text=Office+Image";

    // List of Office objects
    const offices = [
        { name: "Tech Park", rent: 50000, address: "Chennai" },
        { name: "Startup Hub", rent: 75000, address: "Bangalore" },
        { name: "Innovation Center", rent: 60000, address: "Hyderabad" },
        { name: "Eco Tower", rent: 45000, address: "Mumbai" },
    ];

    return (
        <div style={{ textAlign: 'center' }}>
            <h1>{heading}</h1>

            <img src={officeImage} alt="Office" style={{ width: '300px', height: '200px' }} />

            <h2>Available Offices:</h2>
            <ul style={{ listStyleType: 'none', padding: 0 }}>
                {offices.map((office, index) => (
                    <li key={index} style={{ marginBottom: '15px' }}>
                        <strong>Name:</strong> {office.name} <br />
                        <strong>Address:</strong> {office.address} <br />
                        <strong style={{
                            color: office.rent < 60000 ? 'red' : 'green'
                        }}>
                            Rent: ₹{office.rent}
                        </strong>
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default OfficeList;
