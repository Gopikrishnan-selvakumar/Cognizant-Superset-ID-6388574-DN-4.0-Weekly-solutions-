// src/components/CounterComponent.js
import React, { Component } from 'react';

class CounterComponent extends Component {
    constructor(props) {
        super(props);
        this.state = {
            count: 0,
        };
        this.increment = this.increment.bind(this);
        this.sayHello = this.sayHello.bind(this);
        this.decrement = this.decrement.bind(this);
    }

    increment() {
        this.setState({ count: this.state.count + 1 });
        this.sayHello();
    }

    decrement() {
        this.setState({ count: this.state.count - 1 });
    }

    sayHello() {
        alert("Hello! Keep counting 📈");
    }

    sayWelcome(message) {
        alert(`Welcome! Message: ${message}`);
    }

    handleClick = (event) => {
        alert("I was clicked (Synthetic Event) 🎯");
    };

    render() {
        return (
            <div style={{ textAlign: 'center' }}>
                <h2>Counter: {this.state.count}</h2>
                <button onClick={this.increment}>Increment</button>{' '}
                <button onClick={this.decrement}>Decrement</button>{' '}
                <button onClick={() => this.sayWelcome("You clicked Welcome!")}>Say Welcome</button>{' '}
                <button onClick={this.handleClick}>OnPress (Synthetic Event)</button>
            </div>
        );
    }
}

export default CounterComponent;
