function showDiv(divId) {
    var divs = document.querySelectorAll('.box');
    divs.forEach(function(div) {
        div.style.display = 'none';
    });

    var selectedDiv = document.getElementById(divId);
    if (selectedDiv) {
        selectedDiv.style.display = 'block';
    }
}