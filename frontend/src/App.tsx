import {useEffect, useState} from 'react'
import './App.css'
import axios from 'axios'

function App() {
  type Dice = {testVal:string}
  const [dice, setDice] = useState<Dice[]>([]);

    function getAllDice():void {
        axios.get("/api/dice").then(
            (response) => {
                console.log(response);
                setDice(response.data);
            }
        )
    }

    useEffect(() => {
        getAllDice()
    },[])

  return (
    <>
      <h1>Vite + React</h1>
      <div className="card">
          count is {dice.length+""}
        <p>
          Edit <code>src/App.tsx</code> and save to test HMR
        </p>
      </div>
      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p>
    </>
  )
}

export default App
