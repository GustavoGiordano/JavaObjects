package exercicios_Basico_de_Orientacao_a_Objetos_em_Java;

// Crie uma classe 'Produto' com atributos como nome, preço e quantidade em estoque. Adicione métodos para realizar compras e exibir informações sobre o produto. 

import java.util.Scanner;

public class Ex09_Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Ex09_Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void realizarCompra(int quantidadeComprada) {
        if (quantidadeComprada > 0) {
            if (quantidadeComprada <= quantidadeEmEstoque) {
                quantidadeEmEstoque -= quantidadeComprada;
                System.out.println("Compra realizada com sucesso. " + quantidadeComprada + " unidades de " + nome + " foram compradas.");
            } else {
                System.out.println("Quantidade do estoque insuficiente para realizar a compra.");
            }
        } else {
            System.out.println("Quantidade inválida para compra.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Informações sobre o produto:");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque + " unidades");
    }

    public static void main(String[] args) {
        Ex09_Produto produto = new Ex09_Produto("Notebook", 2500.0, 10);
        produto.exibirInformacoes();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade que você deseja comprar:");
        int quantidadeComprada = scanner.nextInt();
        produto.realizarCompra(quantidadeComprada);
        produto.exibirInformacoes();
        scanner.close();
    }
}