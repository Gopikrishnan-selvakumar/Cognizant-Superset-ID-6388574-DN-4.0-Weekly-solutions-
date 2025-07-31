// src/App.js
import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [selected, setSelected] = useState('books');

  // Method 1: if-else
  let content;
  if (selected === 'books') {
    content = <BookDetails />;
  } else if (selected === 'blogs') {
    content = <BlogDetails />;
  } else {
    content = <CourseDetails />;
  }

  return (
      <div className="App" style={{ textAlign: 'center' }}>
        <h1>Blogger App 📰</h1>

        {/* Buttons to switch content */}
        <button onClick={() => setSelected('books')}>Show Books</button>{' '}
        <button onClick={() => setSelected('blogs')}>Show Blogs</button>{' '}
        <button onClick={() => setSelected('courses')}>Show Courses</button>

        <hr />

        {/* Method 1: if-else */}
        {content}

        {/* Method 2: Ternary Operator */}
        {/*
        {selected === 'books' ? <BookDetails /> : selected === 'blogs' ? <BlogDetails /> : <CourseDetails />}
      */}

        {/* Method 3: Logical AND */}
        {/*
        {selected === 'books' && <BookDetails />}
        {selected === 'blogs' && <BlogDetails />}
        {selected === 'courses' && <CourseDetails />}
      */}
      </div>
  );
}

export default App;
