package br.edu.infnet.app;

import br.edu.infnet.domain.Funcionario;
import br.edu.infnet.infra.FuncionarioService;

import java.util.List;

public class FolhaPagamento {

    public static void main(String[] args) {

        System.out.println("===== Folha de Pagamento =====");
        FuncionarioService funcionarioService = new FuncionarioService();
        List<Funcionario> funcionarios = funcionarioService.findAll();
        for (Funcionario funcionario : funcionarios) {
            funcionario.calcularSalario();
        }
    }
}
