import { create } from "zustand"
import { persist } from "zustand/middleware";

// 유저 정보
type User = {
    id: string;
    userId: string;
    userName: string;
    userNickname: string;
};

// 인증 상태
type AuthState = {
    isLoggedIn: boolean;
    user: User | null;
};

// 인증 상태 정의
type AuthActions = {
    login: (user: User) => void;
    logout: () => void;
    updateUser: (updates: Partial<User>) => void;
};

// 인증 상태 초기화(로그아웃)
const INITIAL_STATE: AuthState = {
    isLoggedIn: false,
    user: null,
};

type AuthStore = AuthState & AuthActions;

const useAuthStore = create(persist<AuthStore>((set) => ({
            ...INITIAL_STATE,

            login: (user) => set({
                isLoggedIn: true,
                user,
            }),

            logout: () => set(INITIAL_STATE),

            updateUser: (updates) => set((state) => ({
                ...state,
                user: state.user ? {...state.user, ...updates,} : null,
            })),
        }),
        {
            name: 'auth-storage',
            version: 1,
        }
    )
);
export default useAuthStore;