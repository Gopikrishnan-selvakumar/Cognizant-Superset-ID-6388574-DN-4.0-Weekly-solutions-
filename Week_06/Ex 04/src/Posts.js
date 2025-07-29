import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            hasError: false,
        };
    }

    // Fetch posts from API after component mounts
    componentDidMount() {
        this.loadPosts();
    }

    // Lifecycle error handler
    componentDidCatch(error, info) {
        console.error('Error occurred:', error);
        this.setState({ hasError: true });
        alert("Something went wrong while fetching posts!");
    }

    loadPosts() {
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(res => res.json())
            .then(data => this.setState({ posts: data.slice(0, 10) })) // Get first 10 posts
            .catch(error => {
                throw new Error("API fetch failed");
            });
    }

    render() {
        if (this.state.hasError) {
            return <h2>Failed to load posts.</h2>;
        }

        return (
            <div>
                <h2>Blog Posts</h2>
                {this.state.posts.map(post => (
                    <Post key={post.id} title={post.title} body={post.body} />
                ))}
            </div>
        );
    }
}

export default Posts;
