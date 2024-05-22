<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
  <link rel="shorcut - icon" href="../multimedia/img/icono.ico">
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="/css/sobrenosotros.css" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css2?family=Concert+One&family=Dekko&family=Dosis:wght@200&family=Edu+NSW+ACT+Foundation:wght@400;500&family=Exo:ital,wght@1,100;1,200&family=Patrick+Hand&family=Pixelify+Sans&family=Red+Hat+Display:wght@300&family=Source+Sans+3:wght@200;300&display=swap" rel="stylesheet">
  <title>Iron Body</title>
</head>
<body>
    <header>
        <%@ include file="común/header.jsp" %>
    </header>
    <main>

            <div class="content">
              <div class="parrafo">
                <span>SOBRE NOSOTROS</span>
              </div>
            </div>

            <section class="section1">
              <div class="contenido1">
                <div class="titulo1"> <span>¿QUIENES SOMOS? </span> <hr> </div>
                <div class="abajo">
                <div class="imagen">
                  <img src="../multimedia/img/sobrenosotrosimg1" width="80%">
                </div>
                <div class="sobrenosotros">
                  <span>Somos más que un gimnasio; somos una comunidad comprometida con el bienestar integral. En GimnasioNMV, nos esforzamos por ofrecer un espacio acogedor y motivador donde nuestros miembros puedan alcanzar sus objetivos de salud y fitness.</span>
                </div>
              </div>

              <div class="frase">Mi objetivo no es vencer a los demás. Es vencerme a mí mismo.</div>

              <div class="titulo1">NUESTRA HISTORIA <hr> </div>
              <div class="textosobrenosotros2">Fundado en 2021, hemos crecido desde nuestros modestos comienzos hasta convertirnos en un referente local en la promoción de un estilo de vida activo. A lo largo de los años, hemos evolucionado para satisfacer las cambiantes necesidades de nuestra comunidad.</div>
              <div class="imagendentro"><img src="../multimedia/img/dentro.jpg" width="50%"></div>
            </div>
            </section>

            <section class="section2">
              <div class="contenido2">
                <div class="titulo2">VALORES</div>
              <div class="cajas">
                <div class="caja1">
                  <div class="sgvs">
                    <img src="../multimedia/sgv/salud.svg" width="70px">
                  </div>
                  <div class="textovalores">
                    Salud y Bienestar
                  </div>
                </div>

                <div class="caja1">
                  <div class="sgvs">
                    <img src="../multimedia/sgv/check.svg" width="70px">
                  </div>
                  <div class="textovalores">
                    Calidad y Excelencia
                  </div>
                </div>

                <div class="caja1">
                  <div class="sgvs">
                    <img src="../multimedia/sgv/team.svg" width="70px">
                  </div>
                  <div class="textovalores">
                    Trabajo en Equipo
                  </div>
                </div>

                <div class="caja1" id="cajacorta">
                  <div class="sgvs">
                    <img src="../multimedia/sgv/checkperson.svg" width="70px">
                  </div>
                  <div class="textovalores">
                    Profesionalismo
                  </div>
                </div>

                <div class="caja1">
                  <div class="sgvs">
                    <img src="../multimedia/sgv/star.svg" width="70px">
                  </div>
                  <div class="textovalores">
                    Atención al cliente
                  </div>
                </div>
              </div>
              </div>
            </section>

            <section class="section3">
              <div class="titulo3">SOBRE NOSOTROS</div>
              <div class="contenido3">
            <div class="botones">
              <button onclick="showDiv('uno')" class="botonsec3">Misión</button>
              <button onclick="showDiv('dos')" class="botonsec3">Visión</button>
              <button onclick="showDiv('tres')" class="botonsec3">Compromiso</button>
          </div>

          <div class="contenidobotones">
            <div class="parrafo1"><span>En GimnasioNMV, creemos en el poder transformador de la salud y el fitness. Nos dedicamos a proporcionar un espacio único donde la
              comunidad se une para alcanzar sus metas de bienestar físico y mental.</span></div>
            <div id="uno" class="box uno" style="display: none;">
              <span>Brindar un espacio inclusivo y motivador donde nuestros miembros puedan alcanzar sus metas de bienestar físico y mental. Nos
                comprometemos a ofrecer instalaciones de alta calidad, programas de entrenamiento personalizado y un ambiente acogedor que promueva la
                salud y el fitness para personas de todas las edades y niveles de condición física.</span>
            </div>
            <div id="dos" class="box dos" style="display: none;">
              <span>Ser reconocidos como el gimnasio líder en nuestra comunidad, destacando por la excelencia en servicios de acondicionamiento físico, la
                innovación en programas de entrenamiento, y el compromiso con la salud integral. Aspiramos a ser un referente en el bienestar, inspirando
                a nuestros miembros a adoptar un estilo de vida activo y saludable que perdure a lo largo del tiempo.</span>
              </div>
            <div id="tres" class="box tres" style="display: none;">
                <span><b>Compromiso con la Excelencia:</b></span> <br>
                <span>Nos esforzamos por ofrecer instalaciones de alta calidad, equipos de última generación y programas de entrenamiento innovadores. En
                      GimnasioNMV, nos comprometemos a proporcionar una experiencia de fitness excepcional.</span> <br><br>

                <span><b>Compromiso con la Experiencia del Miembro:</b></span> <br>
                <span>En GimnasioNMV, nuestra prioridad es tu experiencia. Desde instalaciones de alta calidad hasta un equipo amable y
                  dedicado, nos esforzamos por ofrecer un entorno donde te sientas inspirado, apoyado y motivado en cada paso de tu viaje de
                  fitness.</span> <br><br>

                <span><b>Compromiso con la Comunidad:</b></span> <br>
                <span>Creemos que la fuerza de una comunidad comprometida puede transformar vidas. En GimnasioNMV, te invitamos a formar parte de
                  una familia que se apoya mutuamente, celebra éxitos y enfrenta desafíos juntos.</span>
            </div>
          </div>
            </div>
            </section>
        </main>
        <footer>
            <%@ include file="común/footer.jsp" %>
        </footer>
    </body>
    </html>