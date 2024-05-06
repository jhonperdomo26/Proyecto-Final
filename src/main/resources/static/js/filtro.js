const searchInput = document.getElementById('searchInput');
const categorySelect = document.getElementById('category');
const productList = document.querySelector('.lista');
searchInput.addEventListener('input', filterProducts);
categorySelect.addEventListener('change', filterProducts);

function filterProducts() {
    const searchValue = searchInput.value.toLowerCase();
    const selectedCategory = categorySelect.value.toLowerCase(); 

    const products = productList.querySelectorAll('.product');

    products.forEach(product => {
        const productText = product.getAttribute('data-texto').toLowerCase();
        const productCategory = product.getAttribute('data-category').toLowerCase(); 

        const matchesInitial = productText.includes(searchValue);
        const matchesCategory = selectedCategory === '' || productCategory === selectedCategory;

        if (matchesInitial && matchesCategory) {
            product.style.display = 'inline-block';
        } else {
            product.style.display = 'none';
        }
    });
}