package exercicios_Basico_de_Orientacao_a_Objetos_em_Java;

// Crie uma classe 'Agenda' para armazenar contatos. Adicione m�todos para adicionar, remover e exibir contatos. 

import java.util.ArrayList;

public class Ex07_Agenda {
    private ArrayList<String> contatos;

    public Ex07_Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(String contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado: " + contato);
    }

    public void removerContato(String contato) {
        if (contatos.contains(contato)) {
            contatos.remove(contato);
            System.out.println("Contato removido: " + contato);
        } else {
            System.out.println("Contato n�o encontrado.");
        }
    }

    public void exibirContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia. Nenhum contato para exibir.");
        } else {
            System.out.println("Lista de contatos:");
            for (String contato : contatos) {
                System.out.println(contato);
            }
        }
    }

    public static void main(String[] args) {
        Ex07_Agenda minhaAgenda = new Ex07_Agenda();
        minhaAgenda.adicionarContato("Jo�o");
        minhaAgenda.adicionarContato("Maria");
        minhaAgenda.exibirContatos();
        minhaAgenda.removerContato("Jos�");
        minhaAgenda.removerContato("Jo�o");
        minhaAgenda.exibirContatos();
    }
}
