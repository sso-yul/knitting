import { useEffect, useState } from 'react'
import './App.css'
import Board from "./board/Board"
import { getPracticeUserList } from "./api/api.practice.tsx"

function App() {
    const [message, setMessage] = useState("");

    useEffect(() => {
        getPracticeUserList().then(data => setMessage(data));
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
