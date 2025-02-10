import axios from "axios"

export const getPracticeUserList = async() => {
    return await axios
                .get("/api/practice4")
                .then(response => {
                    if(response.status === 200) {
                        return response.data;
                    } else {
                        throw new Error("불러오기 실패");
                    }
                })
                .catch(error => {
                    throw new Error(error.response);
                })
}