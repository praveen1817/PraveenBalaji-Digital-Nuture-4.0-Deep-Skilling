import React from 'react';

function BlogDetails({ blogs }) {
  return (
    <ul>
      {blogs.map(blog => (
        <div key={blog.id}>
          <h3>{blog.title}</h3>
          <strong>{blog.author}</strong>
          <p>{blog.content}</p>
        </div>
      ))}
    </ul>
  );
}

export default BlogDetails;
