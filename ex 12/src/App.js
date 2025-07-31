// src/App.js
import React, { useState } from 'react';
import GuestPage from './components/GuestPage';
import UserPage from './components/UserPage';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  // Toggle Login/Logout
  const toggleLogin = () => {
    setIsLoggedIn(!isLoggedIn);
  };

  // Decide which component to show
  const page = isLoggedIn ? <UserPage /> : <GuestPage />;

  return (
      <div className="App">
        <h1 style={{ textAlign: 'center' }}>Ticket Booking App</h1>
        <div style={{ textAlign: 'center', marginBottom: '20px' }}>
          <button onClick={toggleLogin}>
            {isLoggedIn ? "Logout" : "Login"}
          </button>
        </div>
        {page}
      </div>
  );
}

export default App;
