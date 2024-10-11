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
    background: linear-gradient(135deg, #ff9999, #ffcc99, #ffff99, #ccff99, #99ffcc, #99ccff, #9999ff);
    color: #333333;
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
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    gap: 20px;
  }

  h1 {
    font-size: 28px;
    margin-bottom: 40px;
    color: #663399;
    text-align: center;
  }

  .box {
    background-color: rgba(255, 255, 255, 0.9);
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
    position: relative;
    overflow: hidden;
    transition: transform 0.3s ease;
    cursor: pointer;
    text-align: center;
  }

  .box:hover {
    transform: scale(1.05);
    box-shadow: 0 0 20px rgba(102, 51, 153, 0.8);
  }

  .summary, .memory {
    display: none;
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background-color: rgba(255, 255, 255, 0.95);
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
    z-index: 1;
    text-align: left;
  }

  .box:hover .summary, .box:hover .memory {
    display: block;
  }

  .content {
    font-size: 14px;
    margin: 0;
  }

  ul {
    padding-left: 0;
    list-style: none;
  }

  ul li {
    margin-bottom: 10px;
  }

  .summary-section, .memory-section {
    margin-top: 10px;
  }
</style>

<!-- Unit 1 -->
<div class="box" onclick="window.location.href='https://sharonkodali.github.io/sharon_2025v2/csa/unit1/intro'">
  Unit 1 - Primitive Types
  <div class="summary-section">
    <h3>Summary</h3>
    <ul>
      <li>Basic types of data directly stored in memory.</li>
      <li>Examples: int, double, boolean.</li>
    </ul>
  </div>
  <div class="memory-section">
    <h3>Key Takeaways from Team Teach</h3>
    <ul>
      <li>Understanding memory-efficient coding.</li>
      <li>Use boolean for true/false conditions.</li>
    </ul>
  </div>
</div>


  <!-- Unit 2 -->
  <div class="box" onclick="window.location.href='https://sharonkodali.github.io/sharon_2025v2/csa/unit2/period3/home/'">
    Unit 2 - Objects and Classes
    <div class="summary-section">
      <h3>Summary</h3>
      <ul>
        <li>Objects encapsulate data and behavior.</li>
        <li>Classes define the structure for objects.</li>
      </ul>
    </div>
    <div class="memory-section">
      <h3>Key Takeaways from Team Teach</h3>
      <ul>
        <li>Constructors initialize objects.</li>
        <li>Getters and setters manage object data.</li>
      </ul>
    </div>
  </div>

  <!-- Unit 3 -->
  <div class="box" onclick="window.location.href='https://sharonkodali.github.io/sharon_2025v2/unit3lesson'">
    Unit 3 - Boolean Expressions
    <div class="summary-section">
      <h3>Summary</h3>
      <ul>
        <li>Boolean expressions evaluate to true or false.</li>
        <li>Operators: AND (&&), OR (||), NOT (!).</li>
      </ul>
    </div>
    <div class="memory-section">
      <h3>Key Takeaways from Team Teach</h3>
      <ul>
        <li>Crucial for control flow using if-else statements.</li>
        <li>Optimize decision-making in algorithms.</li>
      </ul>
    </div>
  </div>

  <!-- Unit 4 -->
  <div class="box" onclick="window.location.href='https://sharonkodali.github.io/sharon_2025v2/csa/unit4-p1/'">
    Unit 4 - Iteration
    <div class="summary-section">
      <h3>Summary</h3>
      <ul>
        <li>Loop structures like for, while, do-while.</li>
        <li>Repetitive tasks in code execution.</li>
      </ul>
    </div>
    <div class="memory-section">
      <h3>Key Takeaways from Team Teach</h3>
      <ul>
        <li>Useful for repeating operations efficiently.</li>
        <li>Control loop execution with break/continue.</li>
      </ul>
    </div>
  </div>

  <!-- Unit 5 -->
  <div class="box" onclick="window.location.href='https://sharonkodali.github.io/sharon_2025v2/csa/period1/unit5/intro'">
    Unit 5 - Writing Classes
    <div class="summary-section">
      <h3>Summary</h3>
      <ul>
        <li>Defining a class structure and behavior.</li>
        <li>Methods and attributes for encapsulation.</li>
      </ul>
    </div>
    <div class="memory-section">
      <h3>Key Takeaways from Team Teach</h3>
      <ul>
        <li>Access modifiers: public, private.</li>
        <li>Use methods to manipulate object data.</li>
      </ul>
    </div>
  </div>

  <!-- Unit 6 -->
  <div class="box" onclick="window.location.href='https://sharonkodali.github.io/sharon_2025v2/csa/unit6-p1/'">
    Unit 6 - Arrays
    <div class="summary-section">
      <h3>Summary</h3>
      <ul>
        <li>Array is a collection of elements of the same type.</li>
        <li>Indexing starts at 0.</li>
      </ul>
    </div>
    <div class="memory-section">
      <h3>Key Takeaways from Team Teach</h3>
      <ul>
        <li>Arrays are static in size.</li>
        <li>Use loops to traverse an array.</li>
      </ul>
    </div>
  </div>

  <!-- Unit 7 -->
  <div class="box" onclick="window.location.href='https://sharonkodali.github.io/sharon_2025v2/csa/unit7-p1/unit7-1'">
    Unit 7 - ArrayList
    <div class="summary-section">
      <h3>Summary</h3>
      <ul>
        <li>ArrayList is a dynamic array that resizes as needed.</li>
        <li>Methods include add(), remove(), and get().</li>
      </ul>
    </div>
    <div class="memory-section">
      <h3>Key Takeaways from Team Teach</h3>
      <ul>
        <li>More flexible than arrays.</li>
        <li>Automatically adjusts size as elements are added or removed.</li>
      </ul>
    </div>
  </div>

  <!-- Unit 8 -->
  <div class="box" onclick="window.location.href='https://sharonkodali.github.io/sharon_2025v2/unit8lesson'">
    Unit 8 - Inheritance
    <div class="summary-section">
      <h3>Summary</h3>
      <ul>
        <li>Inheritance allows classes to share attributes and methods.</li>
        <li>Parent-child relationship between classes.</li>
      </ul>
    </div>
    <div class="memory-section">
      <h3>Key Takeaways from Team Teach</h3>
      <ul>
        <li>Use "extends" keyword to inherit from a superclass.</li>
        <li>Override methods for specific child behavior.</li>
      </ul>
    </div>
  </div>

  <!-- Unit 9 -->
  <div class="box" onclick="window.location.href='https://sharonkodali.github.io/sharon_2025v2/unit9lesson'">
    Unit 9 - Recursion
    <div class="summary-section">
      <h3>Summary</h3>
      <ul>
        <li>Recursion is a method calling itself to solve a problem.</li>
        <li>Base case is required to end recursion.</li>
      </ul>
    </div>
    <div class="memory-section">
      <h3>Key Takeaways from Team Teach</h3>
      <ul>
        <li>Commonly used for divide-and-conquer algorithms.</li>
        <li>Be cautious of infinite recursion without a base case.</li>
      </ul>
    </div>
  </div>
</div>
