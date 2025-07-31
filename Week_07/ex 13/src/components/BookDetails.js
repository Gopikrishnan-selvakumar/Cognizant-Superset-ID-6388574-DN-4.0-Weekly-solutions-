// src/components/BookDetails.js
import React from 'react';

const BookDetails = () => {
    const books = [
        { id: 1, title: "Learn React", author: "Dan Abramov" },
        { id: 2, title: "JavaScript Deep Dive", author: "Kyle Simpson" },
    ];

    return (
        <div>
            <h2>📚 Book Details</h2>
            <ul>
                {books.map(book => (
                    <li key={book.id}>
                        <strong>{book.title}</strong> by {book.author}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default BookDetails;
