import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore(props) {
    const name = "John Doe";
    const school = "Greenwood High";
    const total = 450;
    const goal = 500;

    const average = ((total / goal) * 100).toFixed(2);

    return (
        <div className="score-container">
            <h2>Student Score Summary</h2>
            <p><strong>Name:</strong> {name}</p>
            <p><strong>School:</strong> {school}</p>
            <p><strong>Total Marks:</strong> {total}</p>
            <p><strong>Goal:</strong> {goal}</p>
            <p><strong>Average Score:</strong> {average}%</p>
        </div>
    );
}

export default CalculateScore;
