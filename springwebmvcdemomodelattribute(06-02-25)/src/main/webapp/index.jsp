<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
    <h2>Student Information</h2>
    <form action="saveStudent" method="post">
        Name: <input type="text" name="name" /><br/>
        Age: <input type="text" name="age" /><br/>
        <input type="submit" value="Submit" />
    </form>
</body>
</html>