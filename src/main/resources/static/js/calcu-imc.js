function calcularIMC() {
  var peso = parseFloat(document.getElementById("peso").value);
  var altura = parseFloat(document.getElementById("altura").value);

  console.log("Peso:", peso);
  console.log("Altura:", altura);

  if (isNaN(peso) || isNaN(altura) || altura <= 0 || peso <= 0) {
      alert("Por favor, ingrese valores válidos para peso y altura.");
      return;
  }

  var imc = peso / (altura ** 2);
  var resultadoIMC = document.getElementById("resultadoCalculo");

  if (resultadoIMC) {
      resultadoIMC.textContent = imc.toFixed(2);
  } else {
      console.error("Elemento con ID 'resultadoCálculo' no encontrado");
  }
}

console.log("Script cargado correctamente y función calcularIMC definida.");