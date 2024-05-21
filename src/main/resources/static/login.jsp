<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Rest. Carmen | Login</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style5.css">
</head>
<body>
<!-- partial:index.partial.html -->
<div class="container">
    <div class="message signup">
        <div id="google_translate_element" class="google"></div>
        <div class="btn-wrapper">
            <a href="/registro">
                <button class="button" id="signup">Registrate</button>
            </a>
            <button class="button" id="login">Ingresa</button>
            <a href="/home">
                <img src="/Source/sorc1.png" class="source1" alt="logo1">
            </a>
        </div>
    </div>
    <div class="form form--login">
        <div class="form--heading">Bienvenido otra vez</div>
        <form autocomplete="off" action="/login" method="post">
            <c:if test="${not empty param.error}">
                <div class="alerta">Credenciales no válidas</div>
            </c:if>
            <c:if test="${not empty param.logout}">
                <div class="alerta">Ha cerrado exitosamente sesión</div>
            </c:if>
            <input name="username" type="email" id="email" required autofocus="autofocus" placeholder="Correo">
            <input name="password" type="password" id="password" required autofocus="autofocus" placeholder="Contraseña">
            <button type="submit" class="button" id="Login-submit">Ingresar</button>
        </form>
    </div>
</div>
<script type="text/javascript">
    function googleTranslateElementInit() {
        new google.translate.TranslateElement({
            pageLanguage: 'es',
            includedLanguages: 'ca,eu,gl,es',
            layout: google.translate.TranslateElement.InlineLayout.SIMPLE,
            gaTrack: true
        }, 'google_translate_element');
    }
</script>
<script type="text/javascript" src="https://translate.google.com/translate_a/element.js?cb=googleTranslateElementInit"></script>
</body>
</html>