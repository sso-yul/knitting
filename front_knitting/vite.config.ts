import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react-swc'

// https://vite.dev/config/
export default defineConfig({
  plugins: [react()],
  server: {
    port: 5173, // React 개발 서버 포트
    proxy: {
      '/api': {  // '/api' 경로로 요청 시 Spring Boot로 프록시
        target: 'http://localhost:8001',
        changeOrigin: true,
        secure: false,
      },
    },
  },
});
