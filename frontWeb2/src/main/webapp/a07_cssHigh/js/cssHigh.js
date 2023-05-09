window.addEventListener("DOMContentLoaded", function () {
    document.querySelector(".scrollTop").onclick = function () {
        window.scrollTo({
            top: 0,
            left: 0,
            behavior: 'smooth'
        });
    }
})