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
  .table-container {
    width: 100%;
    border-collapse: collapse;
    background-color: #ffe6f2;
    border-radius: 12px;
    box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
    margin: 20px auto;
    font-family: Arial, sans-serif;
  }

  .table-container th, .table-container td {
    padding: 15px;
    text-align: left;
    border-bottom: 1px solid #ddd;
    font-size: 16px;
  }

  .table-container th {
    background-color: #ffb3d9;
    color: white;
  }

  .table-container td {
    color: #333;
  }

  .dropdown {
    position: relative;
    display: inline-block;
  }

  .dropdown-content {
    display: none;
    position: absolute;
    background-color: #ffe6f2;
    min-width: 160px;
    box-shadow: 0px 8px 16px rgba(0, 0, 0, 0.2);
    padding: 12px 16px;
    z-index: 1;
    border-radius: 8px;
  }

  .dropdown:hover .dropdown-content {
    display: block;
  }

  .dropdown-content p {
    margin: 0;
    font-size: 14px;
    color: #333;
  }

  body {
    background-color: #fff0f5;
  }

  h2 {
    color: #cc6699;
    text-align: center;
    padding-top: 20px;
  }
</style>

<h2>Weekly Units Overview</h2>

<table class="table-container">
  <tr>
    <th>Unit</th>
    <th>Description</th>
  </tr>
  {% for unit in (1..9) %}
  <tr>
    <td>Unit {{ unit }}</td>
    <td>
      <div class="dropdown">
        <span>Hover for details</span>
        <div class="dropdown-content">
          <p>Details about Unit {{ unit }} and what will be covered during this week.</p>
        </div>
      </div>
    </td>
  </tr>
  {% endfor %}
</table>
