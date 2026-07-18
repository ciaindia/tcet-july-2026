//CW1: Create Add component to print addition of 2 numbers
function Fruits() {
    const fruits = ["apple", "banana", "chiku", "dangru"]

    return (
        <>
        <h1>List of Fruits (Mentos Zindagi)</h1>
        {fruits.map(x => <h1>{x}</h1>)}

        <hr />

        <h1>List of Fruits (Aam Zindagi)</h1>
        <h1>{fruits[0]}</h1>
        <h1>{fruits[1]}</h1>
        <h1>{fruits[2]}</h1>
        </>
    )
}

export default Fruits;
