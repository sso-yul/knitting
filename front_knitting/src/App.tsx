import { useEffect, useState } from 'react'
import './App.css'
import Board from "./board/Board"
import axios from 'axios'

function App() {
  const [count, setCount] = useState(0)
  const [message, setMessage] = useState("");

  useEffect(() => {
    axios
      .get("/api/practice2?id=67a1afd4cd059e38f0a35a16")
      .then((response) => {
        setMessage(response.data);
      })
      .catch((error) => console.log(error));
  }, []);

  return (
    <>

      <div className="card">
        <button onClick={() => setCount((count) => count + 1)}>
          count is {count}
        </button>
        <p>
          Edit <code>src/App.tsx</code> and save to test HMR
        </p>
      </div>
      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p>
      안녕하세요
      <Board />
      <div>
        가져온 메시지 : {message}
      </div>
    </>
  )
}

export default App
