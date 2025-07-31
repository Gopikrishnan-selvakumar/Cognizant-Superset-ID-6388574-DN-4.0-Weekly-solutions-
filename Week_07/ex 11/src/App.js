// src/App.js
import React from 'react';
import CounterComponent from './components/CounterComponent';
import CurrencyConverter from './components/CurrencyConverter';

function App() {
  return (
      <div className="App">
        <h1 style={{ textAlign: 'center' }}>Event Examples App 🎮</h1>
        <CounterComponent />
        <CurrencyConverter />
      </div>
  );
}

export default App;
