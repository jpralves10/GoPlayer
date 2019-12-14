var fs = require('file-system');
var db = require('./database/database.js');

var controller = require('./controller.js');

var lineReader = require('readline').createInterface({
    input: fs.createReadStream('/home/goplayer/config.json')
});

var webSocket
var timeout

var config

var cdEmpresa, cdPlayer, hostname, porta, sistema

module.exports.wsConnect = function(){
    lineReader.on('line', (configJson) => {
        config = JSON.parse(configJson);
        cdEmpresa = config["empresa"]
        cdPlayer = config["player"]
        hostname = config["hostname"]
        porta = config["porta"]
        sistema = config["sistema"]
        lineReader.close();

        connectWs();
    })
}

function connectWs(){
    websocket = new WebSocket("ws://"+hostname+":"+porta+"/"+sistema+"/wsgoplayer");
    websocket.onopen = function(evt) { wsOpen(evt) };
    websocket.onclose = function(evt) { wsClose(evt) };
    websocket.onmessage = function(evt) { wsMessage(evt) };
    websocket.onerror = function(evt) { wsError(evt) };
}

module.exports.wsCloseConnect = function(){
    websocket.close();
}

function wsOpen(evt){
    clearTimeout(timeout)

    var wsPagina = controller.connectServer(cdEmpresa, cdPlayer);

    console.log("CONNECTED")
    websocket.send(JSON.stringify(wsPagina));
}

function wsClose(evt){
    websocket.close();
    console.log("DISCONNECTED")
    
    timeout = setTimeout(connectWs,1000*60);
}

function wsError(evt){
    console.log("ERROR")
}

function wsMessage(evt){
    //websocket.close();
    //websocket.send();
    console.log("Mensagem chegando!", evt)
}