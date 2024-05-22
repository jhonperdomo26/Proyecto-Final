<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
  <link rel="shorcut - icon" href="../multimedia/img/icono.ico">
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="/css/tienda.css" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css2?family=Concert+One&family=Dekko&family=Dosis:wght@200&family=Edu+NSW+ACT+Foundation:wght@400;500&family=Exo:ital,wght@1,100;1,200&family=Patrick+Hand&family=Pixelify+Sans&family=Red+Hat+Display:wght@300&family=Source+Sans+3:wght@200;300&display=swap" rel="stylesheet">
</head>
<body>
    <header>
        <%@ include file="común/header.jsp" %>
    </header>
    <main>

        <section class="seccion1">
            <div class="textotitulo">
                Encuentra los productos perfecto para ti
                <hr>
            </div>

        <div class="contenedor1">
          <div class="buscadores">
            <div class="Buscartexto">
            <input type="text" id="searchInput" placeholder="Buscar por texto">
          </div>
            <div class="categorias">
            <label for="category" style="font-size: 30px;">Categoría: </label>
            <select id="category">
                <option value="">Todos</option>
                <option value="Suplementos">Suplementos</option>
                <option value="Ropa">Ropa</option>
            </select>
          </div>
          </div>

          <div class="tarjetas">
            <div class="lista">
                <div class="product" data-texto="camiseta masculina" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/buzo1mm.jpg"></div>
                  <div class="contenidocarta">
                    <h4>Camiseta masculinos</h4><br>
                    <p>$70.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="camiseta masculina" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/buzom2.webp"></div>
                  <div class="contenidocarta">
                    <h4>Camiseta masculina</h4><br>
                    <p>$45.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="camiseta masculina" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/buzom3.webp"></div>
                  <div class="contenidocarta">
                    <h4>Camiseta masculina</h4><br>
                    <p>$45.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="camiseta masculina" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/buzom4.webp"></div>
                  <div class="contenidocarta">
                    <h4>Camiseta masculina</h4><br>
                    <p>$70.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="camiseta masculina" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/buzom5.webp"></div>
                  <div class="contenidocarta">
                    <h4>Camiseta masculina</h4><br>
                    <p>$59.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="camiseta femenina" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/camisaf1.webp"></div>
                  <div class="contenidocarta">
                    <h4>Camiseta femenina</h4><br>
                    <p>$39.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="camiseta femenina" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/camisetam2.webp"></div>
                  <div class="contenidocarta">
                    <h4>Camiseta femenina</h4><br>
                    <p>$29.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="camiseta femenina" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/esqueletof.webp"></div>
                  <div class="contenidocarta">
                    <h4>Camiseta femenina</h4><br>
                    <p>$49.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="camiseta femenina" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/camisaf1.webp"></div>
                  <div class="contenidocarta">
                    <h4>Camiseta femenina</h4><br>
                    <p>$59.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="conjunto masculino" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/conjustom1.webp"></div>
                  <div class="contenidocarta">
                    <h4>Conjunto masculino</h4><br>
                    <p>$69.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="conjunto masculino" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/conjuntom2.webp"></div>
                  <div class="contenidocarta">
                    <h4>Conjunto masculino</h4><br>
                    <p>$99.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="conjunto femenino" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/conjuntof1.webp"></div>
                  <div class="contenidocarta">
                    <h4>Conjunto femenino</h4><br>
                    <p>$89.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="conjunto femenino" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/conjuntonegro.webp"></div>
                  <div class="contenidocarta">
                    <h4>Conjunto femenino</h4><br>
                    <p>$89.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="Gorras" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/gorram1.webp"></div>
                  <div class="contenidocarta">
                    <h4>Gorras</h4><br>
                    <p>$39.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="Gorras" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/GORRAm22.jpg"></div>
                  <div class="contenidocarta">
                    <h4>Gorras</h4><br>
                    <p>$39.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="pantalon masculino" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/pantalonesm1.webp"></div>
                  <div class="contenidocarta">
                    <h4>Pantalon masculino</h4><br>
                    <p>$49.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="pantalon masculino" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/pantalonesm2.webp"></div>
                  <div class="contenidocarta">
                    <h4>Pantalon masculino</h4><br>
                    <p>$39.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="pantalon femenino" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/pantalonmmm.webp"></div>
                  <div class="contenidocarta">
                    <h4>Pantalon femenino</h4><br>
                    <p>$59.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="pantalon femenino" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/pantalonf4.webp"></div>
                  <div class="contenidocarta">
                    <h4>Pantalon femenino</h4><br>
                    <p>$69.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="pantalon femenino" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/pantalonm3.jpeg"></div>
                  <div class="contenidocarta">
                    <h4>Pantalon femenino</h4><br>
                    <p>$49.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="medias" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/mediasm1webp.webp"></div>
                  <div class="contenidocarta">
                    <h4>Medias</h4><br>
                    <p>$16.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="guantes femenino" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/guantes.webp"></div>
                  <div class="contenidocarta">
                    <h4>Guantes</h4><br>
                    <p>$19.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="zapatos masculinos" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/zapatosm1.jpg"></div>
                  <div class="contenidocarta">
                    <h4>Zapatos masculinos</h4><br>
                    <p>$159.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="zapatos masculinos" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/zapatosm3.webp"></div>
                  <div class="contenidocarta">
                    <h4>Zapatos masculinos</h4><br>
                    <p>$159.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="Zapatos femeninos" data-category="Ropa">
                  <div class="imgcarta">
                    <img src="../multimedia/img/zapatosf5.webp"></div>
                  <div class="contenidocarta">
                    <h4>Zapatos femeninos</h4><br>
                    <p>$159.000</p>
                    <button>
                      <a href="" class="comprab">comprar</a>
                    </button>
                  </div>
                </div>

                <div class="product" data-texto="proteina" data-category="Suplementos">
                  <div class="imgcarta">
                    <img src="../multimedia/img/wheypro.png"></div>
                    <div class="contenidocarta">
                      <h4>Proteina</h4><br>
                      <p>$400.000</p>
                      <button>
                        <a href="" class="comprab">comprar</a>
                      </button>
                    </div>
                </div>

                <div class="product" data-texto="creatina" data-category="Suplementos">
                  <div class="imgcarta">
                    <img src="../multimedia/img/suplemento.png"></div>
                    <div class="contenidocarta">
                      <h4>Creatina</h4><br>
                      <p>$200.000</p>
                      <button>
                        <a href="" class="comprab">comprar</a>
                      </button>
                    </div>
                </div>

                <div class="product" data-texto="glutanima" data-category="Suplementos">
                  <div class="imgcarta">
                    <img src="../multimedia/img/glutamine2.png"></div>
                    <div class="contenidocarta">
                      <h4>Glutanima</h4><br>
                      <p>$99.000</p>
                      <button>
                        <a href="" class="comprab">comprar</a>
                      </button>
                    </div>
                </div>

                <div class="product" data-texto="preentreno" data-category="Suplementos">
                  <div class="imgcarta">
                    <img src="../multimedia/img/preen.webp"></div>
                    <div class="contenidocarta">
                      <h4>Preentreno</h4><br>
                      <p>$120.000</p>
                      <button>
                        <a href="" class="comprab">comprar</a>
                      </button>
                    </div>
                </div>

                <div class="product" data-texto="beta alanina" data-category="Suplementos">
                  <div class="imgcarta">
                    <img src="../multimedia/img/beta.png"></div>
                    <div class="contenidocarta">
                      <h4>Beta-alanina</h4><br>
                      <p>$79.000</p>
                      <button>
                        <a href="" class="comprab">comprar</a>
                      </button>
                    </div>
                </div>

                <div class="product" data-texto="oxido nítrico" data-category="Suplementos">
                  <div class="imgcarta">
                    <img src="../multimedia/img/oxido_.png"></div>
                    <div class="contenidocarta">
                      <h4>Óxido nítrico</h4><br>
                      <p>$85.000</p>
                      <button>
                        <a href="" class="comprab">comprar</a>
                      </button>
                    </div>
                </div>

                <div class="product" data-texto="multivitaminas y minerales" data-category="Suplementos">
                  <div class="imgcarta">
                    <img src="../multimedia/img/multi.webp"></div>
                    <div class="contenidocarta">
                      <h4>Multivitaminas y minerales</h4><br>
                      <p>$69.000</p>
                      <button>
                        <a href="" class="comprab">comprar</a>
                      </button>
                    </div>
                </div>

                <div class="product" data-texto="omega 3" data-category="Suplementos">
                  <div class="imgcarta">
                    <img src="../multimedia/img/omega-3.webp"></div>
                    <div class="contenidocarta">
                      <h4>Omega 3</h4><br>
                      <p>$69.000</p>
                      <button>
                        <a href="" class="comprab">comprar</a>
                      </button>
                    </div>
                </div>

                <div class="product" data-texto="hidratos de carbono" data-category="Suplementos">
                  <div class="imgcarta">
                    <img src="../multimedia/img/hidro.webp"></div>
                    <div class="contenidocarta">
                      <h4>Hidratos de carbono</h4><br>
                      <p>$129.000</p>
                      <button>
                        <a href="" class="comprab">comprar</a>
                      </button>
                    </div>
                </div>

                <div class="product" data-texto="BCAA" data-category="Suplementos">
                  <div class="imgcarta">
                    <img src="../multimedia/img/bcaa.webp"></div>
                    <div class="contenidocarta">
                      <h4>BCAA</h4><br>
                      <p>$89.000</p>
                      <button>
                        <a href="" class="comprab">comprar</a>
                      </button>
                    </div>
                </div>

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