import { useNavigate } from "react-router-dom";

const OrderSummary = () =>{
    const navigate = useNavigate();

    return (
        <div style={{textAlign: "center"}}>
            <h1>Order Confirmed</h1>
            <button onClick={()=> navigate('/')}>Go back</button>
        </div>
    );
}

export default OrderSummary;