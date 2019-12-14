const { app, BrowserWindow } = require("electron")

let mainWindow
let db

app.on("ready", () => {
  mainWindow = new BrowserWindow({ width: 800, height: 600 })
  mainWindow.loadURL(`file://${__dirname}/src/app/index.html`)
  mainWindow.once("ready-to-show", () => { mainWindow.show() })
  //mainWindow.setFullScreen(true)
  //mainWindow.setMenuBarVisibility(false)
  mainWindow.webContents.openDevTools()

  //SQLite3 stuff
  db = require('./src/app/database/database.js');
  db.init();
})

app.on('window-all-closed', () => { app.quit() })

// Electron js download file (DownloadItem): 
// https://electronjs.org/docs/api/download-item