import React from 'react';
import styles from './styles/CohortDetails.module.css';

function CohortDetails() {
    const cohorts = [
        { id: 1, name: 'React Basics', status: 'ongoing' },
        { id: 2, name: 'Java Full Stack', status: 'completed' },
        { id: 3, name: 'Python with Django', status: 'ongoing' },
        { id: 4, name: 'Spring Boot Advanced', status: 'completed' }
    ];

    return (
        <div>
            <h2>Cohort Dashboard</h2>
            {cohorts.map(cohort => (
                <div key={cohort.id} className={styles.box}>
                    <h3 style={{ color: cohort.status === 'ongoing' ? 'green' : 'blue' }}>
                        {cohort.name}
                    </h3>
                    <dl>
                        <dt>Status:</dt>
                        <dd>{cohort.status}</dd>
                    </dl>
                </div>
            ))}
        </div>
    );
}

export default CohortDetails;
