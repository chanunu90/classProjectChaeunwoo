const LoopEx = () => {


    const arr = [1,2,3,4,5,6]

    const result = arr.map( (ele,index) => {
        
        if(ele % 2 === 0){
            return <li key={index}> {index}AAA</li>
        }

        

    })

    return(
        <ul>
            {result}
        </ul>
    );

}

export default LoopEx;