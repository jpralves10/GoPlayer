
var knex = require('knex')({
    dialect: 'sqlite3',
    connection: {
        filename: '/home/goplayer/database/database.db'
    },
    useNullAsDefault: true
});

function init(){
    knex.schema.hasTable('Usuario').then((exists) => {
        if (!exists) {
            knex.schema.createTable('Usuario', (table) => {
                table.increments();
                table.string('cdEmpresa');
                table.string('cdUsuario');
                table.string('nmUsuario');
            })
            .catch((e) => { console.error(e); });
        }
    })
}

//sql:insert

function insertUsuario(usuario){

    knex.transaction((trx) => {
        knex('Usuario')
        .transacting(trx)
        .insert({
            'cdEmpresa': usuario.cdEmpresa,
            'cdUsuario': usuario.cdUsuario,
            'nmUsuario': usuario.nmUsuario
        })
        .then(trx.commit)
        .catch(trx.rollback);
    })
    .catch((e) => { console.error(e); });
}

//sql:update

function updateUsuario(usuario){

    knex.transaction((trx) => {
        knex('Usuario')
        .transacting(trx)
        .where({
            'cdEmpresa': usuario.cdEmpresa,
            'cdUsuario': usuario.cdUsuario,
        })
        .update({
            'nmUsuario': usuario.nmUsuario
        })
        .then(trx.commit)
        .catch(trx.rollback);
    })
    .catch((e) => { console.error(e); });
}

//sql:remove

function removeUsuario(usuario){

    knex('Usuario')
    .where({
        'cdEmpresa': usuario.cdEmpresa,
        'cdUsuario': usuario.cdUsuario,
    })
    .del()
    .catch((e) => { console.error(e); });
}

//sql:select

function selectUsuario(usuario){
    return knex.select('*')
               .where({
                   'cdEmpresa': usuario.cdEmpresa,
                   'cdUsuario': usuario.cdUsuario
               }) 
               .from('Usuario')
}

module.exports = {
    init:init,

    //sql:insert
    insertUsuario:insertUsuario,

    //sql:update
    updateUsuario:updateUsuario,

    //sql:remove
    removeUsuario:removeUsuario,

    //sql:select
    selectUsuario:selectUsuario
}