// 请求转发解决跨域
let proxyObj = {}

proxyObj['/'] = {
    // ws websocket
    ws: false,
    // 目标地址
    target: 'http://localhost:8081',
    // 发送请求头host会被设置target
    changeOrigin: true,
    // 不重写请求地址
    pathRewrite: {
        '^/': '/',
    },
    //
}

module.export = {
    devServer: {
        host: 'localhost',
        port: 8080,
        proxy: proxyObj,
    }
}