<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Success</title>
</head>
<body>
    <h2>Student Information Saved Successfully</h2>
    <p>Student ID: ${student.id}</p>
    <p>Student Name: ${student.name}</p>
    <p>Student Age: ${student.age}</p>
    <a href="/studentForm">Back to Form</a>
</body>
</html>