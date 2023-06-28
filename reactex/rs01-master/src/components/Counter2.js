import { useState } from "react";

const Counter2 = () => {

    const [obj, setObj] = useState({num:10})

    return ( 
        <div>
            {obj.num}
            <br></br>
            <button onClick={()=>{
                obj.num += 1
                console.log(obj.num)

                //setObj({num: obj.num})
                setObj({...obj})

            }}>INC</button>
        </div>

     );
}
 
export default Counter2;