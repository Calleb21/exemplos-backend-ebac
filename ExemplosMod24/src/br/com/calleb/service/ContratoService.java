package br.com.calleb.service;

import br.com.calleb.dao.IContratoDAO;

public class ContratoService implements IContratoService{

    private IContratoDAO contratoDAO;

    public ContratoService(IContratoDAO dao) {
        this.contratoDAO = dao;
    }

    @Override
    public String salvar() {
        contratoDAO.salvar();
        return "Sucesso";
    }
}
