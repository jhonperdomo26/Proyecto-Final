document.addEventListener('DOMContentLoaded', function () {
    const btnMenu = document.querySelector(".btn-menu");
    const dropdownMenu = document.querySelector(".dropdown-menu");

    btnMenu.addEventListener('click', function () {
        dropdownMenu.classList.toggle("open");
    });
});