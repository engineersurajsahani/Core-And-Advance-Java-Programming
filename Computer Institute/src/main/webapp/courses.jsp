<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Courses - Computer Institute</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-gray-100 text-gray-800">
    <header class="bg-blue-600 text-white p-4">
        <h1 class="text-3xl">Computer Institute</h1>
        <nav>
            <ul class="flex space-x-4">
                <li><a href="index.jsp">Home</a></li>
                <li><a href="about.jsp">About</a></li>
                <li><a href="contact.jsp">Contact</a></li>
                <li><a href="profile.jsp">Profile</a></li>
                <li><a href="courses.jsp">Courses</a></li>
            </ul>
        </nav>
    </header>
    <main class="container mx-auto mt-10">
        <h2 class="text-2xl mb-4">Our Courses</h2>
        <ul class="space-y-4">
            <li class="p-4 bg-white rounded shadow">
                <h3 class="text-xl font-bold">Web Development</h3>
                <p>Learn how to build websites from scratch using HTML, CSS, JavaScript, and more.</p>
            </li>
            <li class="p-4 bg-white rounded shadow">
                <h3 class="text-xl font-bold">Data Science</h3>
                <p>Explore the world of data analysis, machine learning, and statistical modeling.</p>
            </li>
            <li class="p-4 bg-white rounded shadow">
                <h3 class="text-xl font-bold">Cybersecurity</h3>
                <p>Understand the principles of protecting networks, systems, and data from cyber threats.</p>
            </li>
        </ul>
    </main>
</body>
</html>
    