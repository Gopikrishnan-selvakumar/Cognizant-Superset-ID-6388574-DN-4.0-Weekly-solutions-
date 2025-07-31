// src/components/CourseDetails.js
import React from 'react';

const CourseDetails = () => {
    const courses = [
        { id: 1, name: "Full Stack Dev", duration: "6 months" },
        { id: 2, name: "Data Science", duration: "4 months" },
    ];

    return (
        <div>
            <h2>🎓 Course Details</h2>
            <ul>
                {courses.map(course => (
                    <li key={course.id}>
                        <strong>{course.name}</strong> - {course.duration}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default CourseDetails;
