<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profile - Computer Institute</title>
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
        <h2 class="text-2xl mb-4">Your Profile</h2>
        <p>Name: <span id="username">John Doe</span></p>
        <p>Email: <span id="useremail">johndoe@example.com</span></p>
        <p>Enrolled Courses: <span id="usercourses">Web Development, Data Science</span></p>
    </main>
</body>
</html>
