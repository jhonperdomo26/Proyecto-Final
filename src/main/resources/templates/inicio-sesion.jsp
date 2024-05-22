<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
<head>
    <title>Login Page</title>
</head>
<body>
    <h2>Login</h2>
    <form method="post" action="/login">
        <div>
            <label for="username">Username:</label>
            <input type="text" id="username" name="username"/>
        </div>
        <div>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password"/>
        </div>
        <div>
            <button type="submit">Login</button>
        </div>
    </form>
    <c:if test="${not empty error}">
        <p style="color:red;">Invalid username or password.</p>
    </c:if>
</body>
</html>
