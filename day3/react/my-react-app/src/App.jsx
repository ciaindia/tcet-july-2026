import Hi from "./Hi"
import Sqr from "./Sqr"
import Add from "./Add"
import Fruits from "./Fruits"
import Users from "./Users"

function App() {
  
  return (
    <>
      Hello From React App
      <Users />
      <Hi />
      <Fruits />
      <Add num1={5} num2={6} />
      <Sqr num={5} />
      <Sqr num={6} />
    </>
  )
}

export default App






//To run application open terminal
//Ctrl + J or Command + J
//npm run dev
//Open browser and access url: http://localhost:5173/
//Delete App.css file
//Remove index.css import statement from main.jsx 