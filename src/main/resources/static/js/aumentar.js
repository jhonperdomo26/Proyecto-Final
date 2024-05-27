$(document).ready(function() {
    var number = 1;
    $(".table-number > strong").html(number);
  
    $(".table.plus").click(function() {
        number++;
        updateTableNumber();
        updateTableNumberInput();
    });
  
    $(".table.minus").click(function() {
        if (number > 1) {
            number--;
            updateTableNumber();
            updateTableNumberInput();
        }
    });
  
    function updateTableNumber() {
        $(".table-number > strong").html(number);
    }
  
    function updateTableNumberInput() {
        $("#tableNumberInput").val(number);
    }
  });  