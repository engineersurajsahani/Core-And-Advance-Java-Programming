<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Us - Computer Institute</title>
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
        <h2 class="text-2xl mb-4">Contact Us</h2>
        <form action="submitContact.jsp" method="post" class="space-y-4">
            <div>
                <label for="name" class="block text-sm font-medium text-gray-700">Name</label>
                <input type="text" id="name" name="name" class="mt-1 block w-full p-2 border border-gray-300 rounded-md">
            </div>
            <div>
                <label for="email" class="block text-sm font-medium text-gray-700">Email</label>
                <input type="email" id="email" name="email" class="mt-1 block w-full p-2 border border-gray-300 rounded-md">
            </div>
            <div>
                <label for="message" class="block text-sm font-medium text-gray-700">Message</label>
                <textarea id="message" name="message" class="mt-1 block w-full p-2 border border-gray-300 rounded-md"></textarea>
            </div>
            <div>
                <button type="submit" class="bg-blue-600 text-white px-4 py-2 rounded">Submit</button>
            </div>
        </form>
    </main>
</body>
</html>
