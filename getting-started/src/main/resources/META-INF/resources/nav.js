const navSlide = () => {
    const pie = document.querySelector('.pie')
    const nav = document.querySelector('.nav-links')
    const navLinks = document.querySelectorAll('.pie')
    pie.addEventListener('click', () =>{
        nav.classList.toggle('nav-active');
        navLinks.forEach((link, index)=>{
            if(link.style.animation)
            {
                link.style.animation ='';
            }else(
                link.style.animation =`navLinkFade O.5s ease fowards ${index/7+0.3}s`
            )
        });
        pie.classList.toggle('toggle');
    });
}
navSlide();