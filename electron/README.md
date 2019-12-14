# TripCar Desktop

## Install Electron

`npm install --arch=ia32 electron` <br/>

## Install Electron Packager

*1. Instalando electron-packager <br/>
`npm install electron-packager -g` <br/>

*2. Estrutura do Comando <br/>
`electron-packager <dir> <app_name> --platform=win32 --arch=all --icon=<path_to_icon> --out=<dir_out>` <br/>

*3. Exemplo (for use from cli) <br/>
`$ electron-packager . goplayer --platform=linux --arch=x64 --out=dist` <br/>

*4. Links Úteis <br/>
*[Link 1](https://www.npmjs.com/package/electron-packager)* <br/>
*[Link 2](http://mylifeforthecode.com/using-electron-packager-to-package-an-electron-app/)* <br/>

## Install SQLite3

*1. Install Dependencias*
`npm install knex` <br/>
`npm install sqlite3` <br/>
`npm install --save-dev electron-rebuild` <br/>

*2. Package.json* <br/>
>   "scripts": {
>    "rebuild": "electron-rebuild -f -w sqlite3",
>    ...

*3. CMD Modo Administrador* <br/>
`npm --add-python-to-path='true' --debug install --global windows-build-tools` <br/>
`npm config set python "C:\Users\[Usuario]\.windows-build-tools\python27\python.exe"` <br/>

*4. Set PATH Variável* <br/>
`C:\Users\[Usuario]\.windows-build-tools\python27\` <br/>
`C:\Users\[Usuario]\.windows-build-tools\python27\Scripts` <br/>

*5. CMD Modo Administrador* <br/>
`..\python27\Scripts> easy_install-2.7.exe pip` <br/>
`..\python27\Scripts> pip2.7.exe install virtualenv` <br/>

*4. Rebuild SQLite3 (CMD Modo Administrador)* <br/>
`npm run rebuild` <br/>

## Utilizando Git e GitHub

*Após Instalar o Git:* <br/>
`git config --global user.name "Jean Alves"` <br/>
`git config --global user.email "jpralves10@gmail.com"` <br/>

*[Gerar SSH Key](https://help.github.com/articles/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent/)* <br/>
`ssh-keygen -t rsa -b 4096 -C "jpralves10@gmail.com"` <br/>
`Enter/Enter/Enter` <br/>
`cat id_rsa.pub`

*[Add SSH Key](https://github.com/settings/ssh/new)* <br/>
`Clicar no Botão "New SSH Key"` <br/>
`Add Título e a Chave`

*Criar Novo Repositório:* <br/>
`git init` <br/>
`git commit -m "first commit"` <br/>
`git remote add origin https://github.com/jpralves10/meat-app.git` <br/>
`git push -u origin master`

*Push Repositório Existente* <br/>
`git remote set-url origin https://github.com/jpralves10/meat-app.git` <br/>
`git push -u origin master`

*Mudando Status e Comitando:* <br/>
`git status` <br/>
`git add .` <br/>
`git commit -am "Arquivos comitados"` <br/>
`git log` <br/>
`git push origin master`

fatal: remote origin already exists.

## Observações Importantes


## Créditos

jpralves all rights copyright@
