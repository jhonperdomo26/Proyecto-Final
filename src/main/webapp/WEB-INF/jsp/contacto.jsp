<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
  <link rel="shorcut - icon" href="../multimedia/img/icono.ico">
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="/css/contacto.css" rel="stylesheet">
  <script src="../js/calculadora.js"></script>
  <link href="https://fonts.googleapis.com/css2?family=Concert+One&family=Dekko&family=Dosis:wght@200&family=Edu+NSW+ACT+Foundation:wght@400;500&family=Exo:ital,wght@1,100;1,200&family=Patrick+Hand&family=Pixelify+Sans&family=Red+Hat+Display:wght@300&family=Source+Sans+3:wght@200;300&display=swap" rel="stylesheet">
</head>
<body>
    <header>
        <%@ include file="común/header.jsp" %>
    </header>
    <main>

        <div class="content">
          <div class="parrafo">
            <span>CONTÁCTANOS</span>
          </div>
        </div>

        <section class="section1">
          <div class="contenidosection1">
            <div class="derecha">
              <div class="azul">PONTE EN CONTACTO</div>
              <div class="titulocontacto">ENCUENTRANOS AQUI</div>
              <div class="contactosengrid">
                <div class="grid">
                  <div class="titulo">◆ DIRECCIÓN</div>
                  <div class="textocontacto">Calle 33 #9-20 Barrio la manguita Algeciras-Huila</div>
                </div>
                <div class="grid">
                  <div class="titulo">◆ HORARIO</div>
                  <div class="textocontacto">de lunes a sábado<br>
                    6:30 am — 6:00 pm</div>
                </div>
                <div class="grid">
                  <div class="titulo">◆ TELÉFONO Y CORREO</div>
                  <div class="textocontacto">+57 3213410972<br>
                  GimnasioNMV@gmail.com</div>
                </div>
                <div class="grid">
                  <div class="titulo">◆ SIGUENOS EN REDES</div>
                  <div class="redescontacto">
                  <a href="https://wa.me/3164896297" target="_blank"><img id="wh" src="../multimedia/sgv/whatsapp-svgrepo-com.svg" width="30" height="40" alt="WhatsApp"></a>
                  <a href="mailto: maanuuelva10@gmail.com" target="_blank"><img id="Em" src="../multimedia/sgv/facebook-svgrepo-com.svg" width="30" height="40" alt="Email"></a>
                  <a href="https://www.instagram.com/maanuelva10" target="_blank"><img src="../multimedia/sgv/instagram-svgrepo-com.svg" width="30" height="40" alt="instagram"></a>
                </div>
                </div>
              </div>
            </div>

            <div class="izquierda">
              <iframe src="https://www.google.com/maps/embed?pb=!1m16!1m12!1m3!1d704.6215839983321!2d-75.31842829066231!3d2.5259711248665977!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!2m1!1sAlgeciras%2C%20Huila%20gym!5e0!3m2!1ses-419!2sco!4v1699776251385!5m2!1ses-419!2sco" width="80%" height="80%" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
            </div>
          </div>
        </section>

        <section class="section2">
          <div class="contenidosection2">
            <div class="titulosection2" id="titulosus">SUSCRÍBETE</div>
            <div class="titulosection2">Regístrate para estar recibir noticias de nuestras ofertas.</div>
            <form class="formulario">
            <div class="parte1">
              <input type="text" id="text" name="email" placeholder="Ingresa tu correo electronico" required> <input type="submit" value="Enviar" class="botonformulario">
            </div>
            <div class="checkbox">
              <label>
                <input type="checkbox" name="politicas" required>
                Acepto las políticas de tratamiento de datos.
            </label>
            <br>
            <label>
                <input type="checkbox" name="boletin">
                Quiero recibir boletín informativo al correo electrónico.
            </label>
            </div>
          </form>
          </div>
        </section>

    </main>
    <footer>
        <%@ include file="común/footer.jsp" %>
    </footer>
</body>
</html>