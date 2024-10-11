---
layout: post
toc: True
title: Sprint 2 review
description: Team teach review 
authors: Sharon Kodali 
categories: ['AP CSA']
courses: {'csa': {'week': 7}}
type: ccc
permalink: /sprint2review
---
<style>
  body {
    font-family: 'Arial', sans-serif;
    background: linear-gradient(135deg, #ff9999, #ffcc99, #ffff99, #ccff99, #99ffcc, #99ccff, #9999ff); /* Pastel rainbow background */
    color: #333333; /* Dark text for contrast */
    margin: 0;
    padding: 20px;
    display: flex;
    flex-direction: column;
    align-items: center;
  }

  .container {
    max-width: 800px;
    width: 100%;
    text-align: center;
    margin-bottom: 50px;
  }

  h1 {
    font-size: 28px; /* Smaller font size */
    margin-bottom: 40px;
    color: #663399; /* Darker color for the title */
  }

  .box {
    display: inline-block;
    background-color: rgba(255, 255, 255, 0.9); /* White background for boxes */
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
    margin: 20px;
    position: relative;
    overflow: hidden;
    transition: transform 0.3s ease;
  }

  .box:hover {
    transform: scale(1.05); /* Grow effect on hover */
  }

  .star {
    width: 100%;
    height: 100%;
    position: absolute;
    top: 0;
    left: 0;
    background-image: url('data:image/svg+xml;utf8,<svg xmlns="http://www.w3.org/2000/svg" width="100" height="100" viewBox="0 0 24 24"><path d="M12 .587l3.668 7.431 8.204 1.185-5.93 5.755 1.398 8.202L12 18.897l-7.34 3.866 1.398-8.202-5.93-5.755 8.204-1.185z" fill="rgba(255, 215, 0, 0.7)"/></svg>'); /* Star SVG */
    opacity: 0;
    transition: opacity 0.5s ease;
    pointer-events: none; /* Ignore mouse events */
  }

  .box:hover .star {
    opacity: 1; /* Show star on hover */
  }

  ul {
    text-align: left;
    padding-left: 20px;
    font-size: 14px; /* Smaller font size for list items */
    margin: 0;
  }
</style>

<div class="container">
  <h1>Programming Topics</h1>

  <a href="https://beijanm.github.io/beijan25/2024/10/09/review_ticket.html" class="main-link">Go to My Blog Post</a>

  <div class="box">
    Unit 2
    <div class="star"></div>
    <ul>
      <li>Objects represent real-world entities in programming.</li>
      <li>Methods define object behavior.</li>
      <li>Encapsulation hides data within objects.</li>
      <li>Constructors initialize new object instances.</li>
      <li>Accessors and mutators (getters/setters) manage object data.</li>
    </ul>
  </div>

  <div class="box">
    Unit 3
    <div class="star"></div>
    <ul>
      <li>Boolean expressions evaluate to either true or false.</li>
      <li>Logical operators include AND (&&), OR (||), and NOT (!).</li>
      <li>Used for decision-making (if-else statements).</li>
      <li>Relational operators compare values (==, !=, >, <, >=, <=).</li>
      <li>Critical for loops and flow control in programs.</li>
    </ul>
  </div>

  <div class="box">
    Unit 4
    <div class="star"></div>
    <ul>
      <li>Loops allow repeated execution of a block of code.</li>
      <li>Types of loops: for, while, and do-while.</li>
      <li>Loops can iterate over arrays or lists of items.</li>
      <li>Break and continue can control loop execution.</li>
      <li>Used to simplify repetitive tasks in code.</li>
    </ul>
  </div>

  <div class="box">
    Unit 5
    <div class="star"></div>
    <ul>
      <li>Classes define blueprints for objects.</li>
      <li>Each class contains fields (attributes) and methods.</li>
      <li>Constructors create instances of classes (objects).</li>
      <li>Static methods/fields belong to the class, not instances.</li>
      <li>Inheritance allows creating new classes from existing ones.</li>
    </ul>
  </div>

  <div class="box">
    Unit 6
    <div class="star"></div>
    <ul>
      <li>Arrays store multiple elements of the same type.</li>
      <li>Elements are accessed using zero-based index numbers.</li>
      <li>Fixed size; cannot change once declared.</li>
      <li>Useful for managing lists or collections of data.</li>
      <li>Common operations: iteration, sorting, and searching.</li>
    </ul>
  </div>

  <div class="box">
    Unit 7
    <div class="star"></div>
    <ul>
      <li>ArrayLists are dynamic arrays in Java.</li>
      <li>Unlike arrays, ArrayLists can change size dynamically.</li>
      <li>ArrayLists store objects, not primitive types.</li>
      <li>Useful methods: add(), remove(), get(), size().</li>
      <li>ArrayLists offer more flexibility than basic arrays.</li>
    </ul>
  </div>

  <div class="box">
    Unit 8
    <div class="star"></div>
    <ul>
      <li>2D arrays are arrays of arrays (matrix structure).</li>
      <li>Rows and columns are used to access elements.</li>
      <li>Useful for representing grids, tables, and matrices.</li>
      <li>Common operations: iterating over rows and columns.</li>
      <li>Indexed by two values: row index and column index.</li>
    </ul>
  </div>

  <div class="box">
    Unit 9
    <div class="star"></div>
    <ul>
      <li>Inheritance allows one class to acquire properties of another.</li>
      <li>Promotes code reuse and reduces redundancy.</li>
      <li>Parent (superclass) and child (subclass) relationships.</li>
      <li>Overriding methods in subclasses to provide specific behavior.</li>
      <li>Polymorphism allows treating objects of different classes in a uniform way.</li>
    </ul>
  </div>
</div>
