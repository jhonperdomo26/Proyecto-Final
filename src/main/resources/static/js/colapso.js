document.addEventListener('DOMContentLoaded', function () {
    const btnMenu = document.querySelector(".mi-btn-menu");
    const dropdownMenu = document.querySelector(".mi-dropdown-menu");

    btnMenu.addEventListener('click', function () {
        dropdownMenu.classList.toggle("open");
    });
});