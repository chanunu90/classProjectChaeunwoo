import ProductDetail from "./ProductDetail";

const ProductList = () => {

    const products = [
        {pno :1, pname:'상품1' , price: 3000 , img : "m1.jpg"},
        {pno :2, pname:'상품2' , price: 5000 , img : "m2.jpg"},
        {pno :3, pname:'상품3' , price: 7000 , img : "m3.jpg"},
        {pno :4, pname:'상품4' , price: 9000 , img : "m4.jpg"},
        {pno :5, pname:'상품5' , price: 1000 , img : "m5.jpg"},
      ]

    return(
        <ul className="productList">
            {products.map(p => <ProductDetail key={p.pno} product={p}/>)}
        </ul>
    );

}
 //컴포넌트는 jsx를 반환한다.
export default ProductList;