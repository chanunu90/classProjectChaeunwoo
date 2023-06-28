import styled from "styled-components";
import ProductImage from "./ProductImage";

const BlueDiv = styled.div`
    background-color: blue
`
const Imga = styled.img`
    width: 200px;
    height: 200px;
`
console.log( "============ProductImage===============" + ProductImage)

const ProductDetail = ({product}) => {

    const {pno , pname, price ,img } = product || {pno : -1 , pname: '' , price: 0 , img: ""}



    return(
        <li>
            <BlueDiv> PNO {pno} </BlueDiv>
            <div> NAME {pname} </div>
            <div> price {price} </div>
            <div><Imga src={require(`../../images/${img}`)}/></div>
            <button> BUY </button>
        </li>
    );

}






 //컴포넌트는 jsx를 반환한다.
export default ProductDetail;