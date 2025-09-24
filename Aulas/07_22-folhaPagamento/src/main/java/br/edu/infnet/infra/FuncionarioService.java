package br.edu.infnet.infra;

import br.edu.infnet.domain.Funcionario;
import java.util.List;

public class FuncionarioService {

    private final FuncionarioDAO funcionarioDAO;

    public FuncionarioService() {
        this.funcionarioDAO = new FuncionarioDAO();
    }

    public List<Funcionario> findAll() {
        return funcionarioDAO.findAll();
    }
}
