import { useState } from "react"

const Counter = () => {

    //let num = 1

    //훅스    
    const [num, setNum] = useState(1)

    const handleClick = (amount) => {
            
        setNum(num + amount)

        console.log("click", num)


    }
    
    

    return ( 
        <div className=" w-full bg-orange-500 h-1/2 ">
            <div className=" text-white bg-lime-500 h-1/2 text-center">
                {num}
            </div>
            <button className=" w-20 bg-blue-400 text-red-400 font-bold"
            onClick={() => { handleClick(1) }}
            >
                INC
            </button>

            <button className=" w-20 bg-amber-300 text-red-400 font-bold ml-10"
            onClick={() => {handleClick(-1)}}
            >
                DEC
            </button>
        </div>
     );
}
 
export default Counter;