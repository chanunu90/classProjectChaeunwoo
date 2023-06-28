import { useState } from "react"

const Counter = () => {
    
    
    // let num = 1
    
    // 훅스
    const [num , setNum] = useState(1)
    
    const handleClick = (amount) => {
        console.log("click")

        setNum(num + amount)

        // num += amount
    }

    

    
    return ( 

        <div className="w-full bg-orange-800 h-1/2" >
            <div className="text-5xl text-white">
                {num}
            </div>
            <button 
                className="bg-fuchsia-500 text-white font-bold"
                onClick={() => {handleClick(1)}}
            >INC                
            </button>


            
            <button 
                className="bg-yellow-700 text-white font-bold ml-60"
                onClick={() => {handleClick(-1)}}
            >
            DEC
            </button>
        </div>

    );
}
 
export default Counter;