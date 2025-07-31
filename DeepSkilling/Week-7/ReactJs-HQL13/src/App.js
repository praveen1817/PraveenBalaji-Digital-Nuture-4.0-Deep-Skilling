import React, { useState } from 'react';
import './App.css';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';
import { books, blogs, courses } from './data';

function App() {
  const [showBooks, setShowBooks] = useState(true);
  const [showBlogs, setShowBlogs] = useState(true);
  const [showCourses, setShowCourses] = useState(true);

  return (
    <div className="container">
      {showCourses && (
        <div className="mystyle1">
          <h1>Course Details</h1>
          <CourseDetails courses={courses} />
        </div>
      )}

      {showBooks ? (
        <div className="st2">
          <h1>Book Details</h1>
          <BookDetails books={books} />
        </div>
      ) : null}

      {showBlogs && (
        <div className="v1">
          <h1>Blog Details</h1>
          <BlogDetails blogs={blogs} />
        </div>
      )}
    </div>
  );
}

export default App;
