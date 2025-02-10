import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.tsx'

createRoot(document.getElementById('root')!).render(
  // 혹시라도 있을지 모르는 부분을 확인하기 위해 있는 StrictMode는 랜더링 두 번 하게 해주니 나중에 필요하면 지우기
  <StrictMode>
    <App />
  </StrictMode>,
)
