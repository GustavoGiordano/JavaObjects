package exercicios_Basico_de_Orientacao_a_Objetos_em_Java;

// Crie uma classe 'Empresa' com atributos como nome, CNPJ e lista de funcion�rios. Adicione m�todos para contratar, demitir e exibir informa��es sobre os funcion�rios.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex10_Empresa {
    private String nome;
    private String cnpj;
    private List<String> funcionarios;

    // Construtor
    public Ex10_Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<>();
    }

    // contratar um funcion�rio
    public void contratarFuncionario(String nomeFuncionario) {
        funcionarios.add(nomeFuncionario);
        System.out.println("Funcion�rio contratado na empresa " + nome + ": " + nomeFuncionario);
    }

    // demitir um funcion�rio
    public void demitirFuncionario(String nomeFuncionario) {
        if (funcionarios.contains(nomeFuncionario)) {
            funcionarios.remove(nomeFuncionario);
            System.out.println("Funcion�rio demitido na empresa " + nome + ": " + nomeFuncionario);
        } else {
            System.out.println("Funcion�rio n�o encontrado na empresa " + nome + ".");
        }
    }

    // info sobre os funcion�rios
    public void exibirInformacoesFuncionarios() {
        System.out.println("Informa��es da empresa:");
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);

        if (funcionarios.isEmpty()) {
            System.out.println("A empresa n�o possui funcion�rios no momento.");
        } else {
            System.out.println("Lista de funcion�rios:");
            for (String funcionario : funcionarios) {
                System.out.println(funcionario);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da empresa:");
        String nomeEmpresa = scanner.nextLine();
        System.out.println("Digite o CNPJ da empresa:");
        String cnpjEmpresa = scanner.nextLine();
        Ex10_Empresa minhaEmpresa = new Ex10_Empresa(nomeEmpresa, cnpjEmpresa);
        minhaEmpresa.exibirInformacoesFuncionarios();
        System.out.println("Digite o nome do funcion�rio a ser contratado:");
        String novoFuncionario = scanner.nextLine();
        minhaEmpresa.contratarFuncionario(novoFuncionario);
        minhaEmpresa.exibirInformacoesFuncionarios();
        System.out.println("Digite o nome do funcion�rio a ser demitido:");
        String funcionarioDemitido = scanner.nextLine();
        minhaEmpresa.demitirFuncionario(funcionarioDemitido);
        minhaEmpresa.exibirInformacoesFuncionarios();
        scanner.close();
    }
}
