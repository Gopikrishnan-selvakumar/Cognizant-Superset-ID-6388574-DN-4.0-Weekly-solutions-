// src/components/ListOfPlayers.js
import React from 'react';

const ListOfPlayers = () => {
    const players = [
        { name: "Virat Kohli", score: 85 },
        { name: "Rohit Sharma", score: 90 },
        { name: "KL Rahul", score: 65 },
        { name: "Shikhar Dhawan", score: 50 },
        { name: "Hardik Pandya", score: 75 },
        { name: "Jasprit Bumrah", score: 40 },
        { name: "Rishabh Pant", score: 88 },
        { name: "Ravindra Jadeja", score: 95 },
        { name: "Shreyas Iyer", score: 60 },
        { name: "Mohammed Shami", score: 70 },
        { name: "Suryakumar Yadav", score: 55 },
    ];

    // Filter players with score < 70 using arrow function
    const lowScorers = players.filter(player => player.score < 70);

    return (
        <div>
            <h2>All Players:</h2>
            <ul>
                {players.map((player, index) => (
                    <li key={index}>{player.name} - {player.score}</li>
                ))}
            </ul>

            <h3>Players with score below 70:</h3>
            <ul>
                {lowScorers.map((player, index) => (
                    <li key={index}>{player.name} - {player.score}</li>
                ))}
            </ul>
        </div>
    );
};

export default ListOfPlayers;
