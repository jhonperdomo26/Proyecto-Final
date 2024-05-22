<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
  <link rel="shorcut - icon" href="../multimedia/img/icono.ico">
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="/css/clases.css" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css2?family=Concert+One&family=Dekko&family=Dosis:wght@200&family=Edu+NSW+ACT+Foundation:wght@400;500&family=Exo:ital,wght@1,100;1,200&family=Patrick+Hand&family=Pixelify+Sans&family=Red+Hat+Display:wght@300&family=Source+Sans+3:wght@200;300&display=swap" rel="stylesheet">
</head>
<body>
    <header>
        <%@ include file="común/header.jsp" %>
    </header>
    <main>

        <div class="content">
          <div class="parrafo">
            <span>CLASES</span>
          </div>
        </div>

        <section class="section1">
          <div class="contenido1">
          <div class="sercicio">

          <a href="./clases/clase1.html">
            <div class="cuadroservicio">
              <div class="imagen">
                <img src="../multimedia/img/aerobiocos.jpg" width="100%">
              </div>
              <span>Aerobicos</span>
            </div>
          </a>

          <a href="./clases/clase2.html">
            <div class="cuadroservicio">
              <div class="imagen">
                <img src="../multimedia/img/bailegimnasio11.jpg" width="100%">
              </div>
              <span>Bailes</span>
            </div>
          </a>

          <a href="./clases/clase3.html">
            <div class="cuadroservicio">
              <div class="imagen">
                <img src="../multimedia/img/natacion.avif" width="100%">
              </div>
              <span>Natacion</span>
            </div>
          </a>

          <a href="./clases/clase4.html">
            <div class="cuadroservicio">
              <div class="imagen">
                <img src="../multimedia/img/estirar.png" width="100%">
              </div>
              <span>Stretching</span>
            </div>
          </a>
          </div>


          </div>
        </section>

        <section class="separador">
          <span>No eres lo que logras, eres lo que superas.</span>
        </section>

        <section class="section2">
          <div class="arribahr"><span>HORARIOS</span>
          <hr width="60%"></div>
          <div class="contenido2">
          <table>
              <tr>
                <th>Hora</th>
                <th>Lunes</th>
                <th>Martes</th>
                <th>Miércoles</th>
                <th>Jueves</th>
                <th>Viernes</th>
                <th>Sábado</th>
                <th>Domingo</th>
              </tr>

              <tr>
                <td>7pm</td>
                <td>Bailes</td>
                <td>Bailes</td>
                <td>Bailes</td>
                <td>Bailes</td>
                <td>Bailes</td>
                <td>Bailes</td>
                <td></td>
              </tr>

              <tr>
                <td>8am</td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
              </tr>

              <tr>
                <td>9am</td>
                <td>Stretching</td>
                <td>Stretching</td>
                <td>Stretching</td>
                <td>Stretching</td>
                <td>Stretching</td>
                <td>Stretching</td>
                <td></td>
              </tr>

              <tr>
                <td>10am</td>
                <td>Stretching</td>
                <td>Stretching</td>
                <td>Stretching</td>
                <td>Stretching</td>
                <td>Stretching</td>
                <td>Stretching</td>
                <td></td>
              </tr>

              <tr>
                <td>11am</td>
                <td>Natacion</td>
                <td>Natacion</td>
                <td>Natacion</td>
                <td>Natacion</td>
                <td>Natacion</td>
                <td>Natacion</td>
                <td></td>
              </tr>

              <tr>
                <td>12pm</td>
                <td>Natacion</td>
                <td>Natacion</td>
                <td>Natacion</td>
                <td>Natacion</td>
                <td>Natacion</td>
                <td>Natacion</td>
                <td></td>
              </tr>

              <tr>
                <td>1pm</td>
                <td>Aerobicos</td>
                <td>Aerobicos</td>
                <td>Aerobicos</td>
                <td>Aerobicos</td>
                <td>Aerobicos</td>
                <td>Aerobicos</td>
                <td></td>
              </tr>

              <tr>
                <td>2pm</td>
                <td>Aerobicos</td>
                <td>Aerobicos</td>
                <td>Aerobicos</td>
                <td>Aerobicos</td>
                <td>Aerobicos</td>
                <td>Aerobicos</td>
                <td></td>
              </tr>

              <tr>
                <td>3pm</td>
                <td>Stretching</td>
                <td>Stretching</td>
                <td>Stretching</td>
                <td>Stretching</td>
                <td>Stretching</td>
                <td>Stretching</td>
                <td></td>
              </tr>

              <tr>
                <td>4pm</td>
                <td>Stretching</td>
                <td>Stretching</td>
                <td>Stretching</td>
                <td>Stretching</td>
                <td>Stretching</td>
                <td>Stretching</td>
                <td></td>
              </tr>

              <tr>
                <td>5pm</td>
                <td>Bailes</td>
                <td>Bailes</td>
                <td>Bailes</td>
                <td>Bailes</td>
                <td>Bailes</td>
                <td>Bailes</td>
                <td></td>
              </tr>
          </table>

        </div>

        </section>

    </main>
    <footer>
        <%@ include file="común/footer.jsp" %>
    </footer>
</body>
</html>