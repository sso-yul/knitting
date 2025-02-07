import { useEffect, useState } from 'react'
import './App.css'
import Board from "./board/Board"
import axios from 'axios'

function App() {
  const [message, setMessage] = useState("");

  useEffect(() => {
    axios
      .get("/api/practice4")
      .then((response) => {
        setMessage(response.data);
      })
      .catch((error) => console.log(error));
  }, []);

  return (
    <>
      안녕하세요
      <Board />
      <div>
        가져온 메시지 :
        <div dangerouslySetInnerHTML={{ __html: message }} />
      </div>
    </>
  )
}

export default App
