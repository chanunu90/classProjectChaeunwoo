import { useState } from "react"

const Counter2 = () => {
    
    const [obj , setObj] = useState({num:10}); 
    

    
    return ( 

        <div className="w-full bg-orange-800 h-1/2" >
            {obj.num}
            <button onClick={()=>{
                obj.num += 1
                setObj({num: obj.num})

            }}>
                Inc
            </button>
        </div>

    );
}
 
export default Counter2;