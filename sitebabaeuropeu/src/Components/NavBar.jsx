import { useRef } from "react";
import { FaBars, FaTimes } from "react-icons/fa";

function Navbar() {

    const navRef = useRef();
    const showNavbar = () => {
        navRef.current.classList.toggle("responsive_nav")
        
    }

    return (
        <header>
            <h3>Logo</h3>
            <nav ref={navRef}>
                <a id="JOGADORES" href="/">JOGADORES</a>
                <a id="PRÓXIMOS JOGOS" href="/">PRÓXIMOS JOGOS</a>
                <a id="DESTAQUES DA SEMANA" href="/">DESTAQUES DA SEMANA</a>
                <a id="LANCES" href="/">LANCES</a>
                <a id="NOTÍCIAS" href="/">NOTÍCIAS</a>
                <a id="FOTOS" href="/">FOTOS</a>
                <button className="nav-btn nav-close-btn" onClick={showNavbar}>
                    <FaTimes />
                </button>
            </nav>
                <button className="nav-btn" onClick={showNavbar}>
                    <FaBars />
                </button>
        </header>
    );


}

export default Navbar