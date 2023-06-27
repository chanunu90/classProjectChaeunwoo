import styled from "styled-components";
import lesson1 from '../../images/띠링.png'; 

const Imga = styled.img`

    width: 200px,
    height : 200px

`

const ProductImage = (props) => {
  return <div>
	  <Imga src={lesson1} alt="online lesson" />
  </div>
}

export default ProductImage;