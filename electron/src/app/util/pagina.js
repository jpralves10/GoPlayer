
module.exports.newPagina = function(cdEmpresa, deParametro, deMensagem, registros){
    var pagina = {
        'cdEmpresa' : cdEmpresa,
        'deParametro' : deParametro,
        'deMensagem' : deMensagem,
        'registros' : registros
    }
    return pagina;
}