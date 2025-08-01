// src/App.js
import React from 'react';
import ListOfPlayers from './components/ListOfPlayers';
import IndianPlayers from './components/IndianPlayers';

function App() {
  const flag = true;  // Change this to false to switch components

  return (
      <div className="App">
        <h1>Welcome to Cricket App</h1>
        {flag ? <ListOfPlayers /> : <IndianPlayers />}
      </div>
  );
}

export default App;
