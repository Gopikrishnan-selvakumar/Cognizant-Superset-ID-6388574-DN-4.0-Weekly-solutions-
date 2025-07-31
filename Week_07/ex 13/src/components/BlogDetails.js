// src/components/BlogDetails.js
import React from 'react';

const BlogDetails = () => {
    const blogs = [
        { id: 1, title: "React Tips", writer: "Gobi Krishnan" },
        { id: 2, title: "Hooks Mastery", writer: "Gobi Krishnan" },
    ];

    return (
        <div>
            <h2>📝 Blog Details</h2>
            <ul>
                {blogs.map(blog => (
                    <li key={blog.id}>
                        <strong>{blog.title}</strong> by {blog.writer}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default BlogDetails;
