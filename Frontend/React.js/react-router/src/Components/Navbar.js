import { Link } from "react-router-dom";

const Navbar = () =>{
    return(
        <div style={{textAlign:"center"}}>
            <nav>
                <Link to="/">Home</Link>
                <Link to="/about">About</Link>
            </nav>
        </div>
    )
}

export default Navbar;