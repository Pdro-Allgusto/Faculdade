function leiaMais(){
    var pontos= document.getElementById("pontos");
    var maisTexto=document.getElementById("mais");
    var btnLeiaMais =document.getElementById("btnLeiaMais");

    if(pontos.style.display === "none"){
        pontos.style.display="inline";
        maisTexto.style.display="none";
        btnLeiaMais.innerHTML="Leia Mais";
    }else{
        pontos.style.display="none";
        maisTexto.style.display="inline";
        btnLeiaMais.innerHTML="Leia Menos";
    }
}
function leiaMais(){
    var pontos= document.getElementById("pontos");
    var maisTexto=document.getElementById("mais");
    var btnLeiaMais =document.getElementById("btnLeiaMais");

    if(pontos.style.display === "none"){
        pontos.style.display="inline";
        maisTexto.style.display="none";
        btnLeiaMais.innerHTML="Leia Mais";
    }else{
        pontos.style.display="none";
        maisTexto.style.display="inline";
        btnLeiaMais.innerHTML="Leia Menos";
    }
}
const backToTopButton = document.querySelector(".back-to-top");

function backToTop() {
    if (this.window.scrollY >= 560) {
        backToTopButton.classList.add("show");
    } else {
        backToTopButton.classList.remove("show");
    }
}

/* When Scroll */
window.addEventListener("scroll", function () {
    backToTop();
});
