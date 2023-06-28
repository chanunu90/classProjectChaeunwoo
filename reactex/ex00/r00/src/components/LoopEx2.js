const LoopEx2 = ({start , end}) => {

    console.log("start" , start , "end" , end)

    let arr = []

    for(let i = start ; i <= end ; i++){
        arr.push(<li key={i}>AAA</li>)
    }   

    return(
        <ul>
            {arr}
        </ul>
    );

}

export default LoopEx2;