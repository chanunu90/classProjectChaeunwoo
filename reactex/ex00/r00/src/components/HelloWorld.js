const HelloWorld = ({product}) => {

    const {pno , pname, price } = product || {pno : -1 , pname: '' , price: 0}

    return ( 
        <div>
            <div>{pno}</div>
            <div>{pname}</div>
            <div>{price}</div>

            { price > 5000 ? <div> 쌈 </div> : <div> 안비쌈 </div>}

        </div>
        
     );
}
 //컴포넌트는 jsx를 반환한다.
export default HelloWorld;