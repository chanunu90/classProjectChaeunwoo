import { useState } from "react"

const products = [
    {pno:1, pname:'Americano', price: 7000 , img:"c1.jpg"},
    {pno:2, pname:'Latte', price: 8000 , img:"c2.jpg"},
    {pno:3, pname:'Milk Tea', price: 9000 , img:"c3.jpg"},
    {pno:4, pname:'Green Tea', price: 6000 , img:"c4.jpg"},

    {pno:5, pname:'Americano', price: 7000 , img:"c1.jpg"},
    {pno:6, pname:'Latte', price: 8000 , img:"c2.jpg"},
    {pno:7, pname:'Milk Tea', price: 9000 , img:"c3.jpg"},
    {pno:8, pname:'Green Tea', price: 6000 , img:"c4.jpg"},


]

const getTotal = (arr) => {

    if(!arr || arr.length === 0){
        return 0
    }

    const resum = arr.reduce((actual,current) => {
        return actual+ current.price*current.qty
    },0)


    // let sum = 0;
    // // reduce으로 다시해보기
    // for(const ele of arr ){
    //     sum += (ele.price * ele.qty)
    // }
    // --------위의 포문을 reduce로 변경--------
    //reduce 의 기본형을 알아보자
    // array.reduce((acc,cur,index,element) => { return 결과 }, 초기값);
    // 위와 같이 기본 틀이다.
    // 누적값,현재값,인덱스,요소를 품고있다.
    // 코드를 보도록하자

    // const array1 = [1, 2, 3, 4];
    // // 0 + 1 + 2 + 3 + 4
    // const initialValue = 0;
    // const sumWithInitial = array1.reduce(
    // (accumulator, currentValue) => accumulator + currentValue, initialValue
    // );

    
    // let result = arr.reduce((acc,ele,i) => {
    //     return acc + cur;
    // }, 0);

    return resum

}






const Kiosk = () => {

    const [items, setItems] = useState([])

    const handleClickBuy = (product) => {
        console.log({...product, qty:1})

        const result = items.filter( ele => ele.pno === product.pno )

        console.log("result", result)

        if(result.length === 0) {
            setItems([...items, {...product, qty:1}])
            return
        }

        const cartItem = result[0]
        cartItem.qty += 1
        setItems([...items])

    }


    const handleClickQty = (pno , amount) => {

        console.log("pno" , pno , "amount" , amount)
        const target = items.filter( item => item.pno === pno )[0]

        console.log(target)


        if(amount === 1){
            target.qty += 1
            setItems([...items])
        }else {
            if(target.qty === 1){
                setItems( items.filter(ele => ele.pno !== pno) )
                return
            }
            target.qty -= 1
            setItems([...items])
        }

    }


    const productItemRead = (product) => {
        if(product.pno === 1) {
            setItems([...items, {...product, detailInfo: "아메리카노 - 진한 에스프레소에 시원한 정수물을 더하여 깔끔하고 강렬한 에스프레소를 가장 부드럽고 시원하게 즐길 수 있는 커피"}])
            return
        }
        if(product.pno === 2) {
            setItems([...items, {...product, detailInfo: "아메리카노 - 진한 에스프레소에 시원한 정수물을 더하여 깔끔하고 강렬한 에스프레소를 가장 부드럽고 시원하게 즐길 수 있는 커피"}])
            return
        }
        if(product.pno === 3) {
            setItems([...items, {...product, detailInfo: "아메리카노 - 진한 에스프레소에 시원한 정수물을 더하여 깔끔하고 강렬한 에스프레소를 가장 부드럽고 시원하게 즐길 수 있는 커피"}])
            return
        }
        if(product.pno === 4) {
            setItems([...items, {...product, detailInfo: "아메리카노 - 진한 에스프레소에 시원한 정수물을 더하여 깔끔하고 강렬한 에스프레소를 가장 부드럽고 시원하게 즐길 수 있는 커피"}])
            return
        }
         
    }
    
    
    
    return ( 

        <div className="w-full bg-green-300 flex"> 
            <div className="w-2/3 bg-stone-950 ">
                <div className="text-4xl font-extrabold text-zinc-50">Products</div>
                
                <ul className="flex justify-center flex-wrap">
                    {products.map( p => 
                    <li
                        key={p.pno} 
                        className="text-2xl underline m-3 p-3 bg-white flex"
                        onClick={() => {handleClickBuy(p)}}
                    >
                        <img className="w-20" src={p.img}/> - {p.pno} - {p.pname} - {p.price}
                    <button className="border-2 m-2 p-2 rounded-lg border-y-pink-400">BUY</button>
                    </li>)}
                </ul>

                <div className="text-2xl underline m-3 p-3 bg-orange-300 flex">
                            ㅁㄴㅇㅁㄴㅇㅁㄴㅇ
                </div>
    
            </div>
            <div className="w-1/3">
                
            <div className="text-4xl font-extrabold">Cart</div>

            <ul>
                {items.map( (item, idx) => 
                <li 
                    key={idx} className="border-2"
                    onClick={() => handleClickQty(item.pno, -1)}
                >
                    <div className="text-3xl m-4 p-4">
                        <div><img className="w-28 m-auto mb-7" src={item.img} /></div>
                        <div className="flex justify-center font-bold">
                            <div>-{item.pno}</div>
                            <div>-{item.pname}</div>
                            <div>-{item.price}</div>
                        </div>

                    </div>
                    <div className="flex justify-center text-2xl">
                        <button 
                            className="rounded-lg bg-orange-300 p-4 m-1"
                            onClick={() => handleClickQty(item.pno, 1)}
                        
                        >
                            +
                        </button>
                        <p className="m-2 text-red-700 p-2">{item.qty}</p>
                        <button 
                            className="rounded-lg bg-orange-300 p-4 m-1"
                            onClick={() => handleClickQty(item.pno, -1)}
                        >
                            -
                        </button>
                    </div>
                </li> )}
            </ul>

            <div className="bg-pink-700 text-5xl ">
                Total {getTotal(items)}
            </div>

            </div>
        </div>
       

     );
}
 
export default Kiosk;