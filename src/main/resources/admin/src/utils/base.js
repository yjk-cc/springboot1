const base = {
    get() {
        return {
            url : "http://localhost:8080/springbooty6b1p/",
            name: "springbooty6b1p",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbooty6b1p/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "网上书城的设计与实现"
        } 
    }
}
export default base
