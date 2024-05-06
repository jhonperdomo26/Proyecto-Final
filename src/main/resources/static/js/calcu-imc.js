function calcularIMC() {
    var peso = parseFloat(document.getElementById("peso").value);
    var altura = parseFloat(document.getElementById("altura").value);

    if (isNaN(peso) || isNaN(altura) || altura <= 0 || peso <= 0) {
      alert("Por favor, ingrese valores válidos para peso y altura.");
      return;
    }

    var imc = peso / (altura ** 2);
    
    document.getElementById("resultadoIMC").textContent = imc.toFixed(2);
  }

  
  function showDiv(divId) {
    // Oculta todos los divs
    var divs = document.querySelectorAll('.box');
    divs.forEach(function(div) {
        div.style.display = 'none';
    });

    // Oculta el span con la clase parrafo1
    var parrafo1 = document.querySelector('.parrafo1');
    if (parrafo1) {
        parrafo1.style.display = 'none';
    }

    // Muestra el div seleccionado
    var selectedDiv = document.getElementById(divId);
    if (selectedDiv) {
        selectedDiv.style.display = 'block';
    }
}
