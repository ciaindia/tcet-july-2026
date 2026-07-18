//CW1: Create Add component to print addition of 2 numbers
function Add(props) {

    var x = props.num1
    var y = props.num2

    return (
        <>
        <h1>
        {x} + {y} = {x + y}
        </h1>
        </>
    )


}

export default Add;
