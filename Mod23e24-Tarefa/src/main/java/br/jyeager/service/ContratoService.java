package br.jyeager.service;

import br.jyeager.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        return "Busca Concluida";
    }

    @Override
    public String excluir() {
        return "Excluido";
    }

    @Override
    public String atualizar() {
        return "Atualizado";
    }
}
