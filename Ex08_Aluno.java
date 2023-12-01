package exercicios_Basico_de_Orientacao_a_Objetos_em_Java;

// Crie uma classe 'Aluno' com atributos como nome, matrícula e notas. Adicione métodos para calcular a média das notas.

import java.util.Scanner;

public class Ex08_Aluno {
    private String nome;
    private double[] notas;

    public Ex08_Aluno(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public double calcularMedia() {
        if (notas.length == 0) {
            System.out.println("Não há notas para calcular a média.");
            return 0.0;
        }

        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite o número de notas a serem lidas do aluno:");
        int numeroDeNotas = scanner.nextInt();

        double[] notas = new double[numeroDeNotas];

        for (int i = 0; i < numeroDeNotas; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
        }

        scanner.close();

        Ex08_Aluno aluno = new Ex08_Aluno(nome, notas);

        double mediaAluno = aluno.calcularMedia();
        System.out.println("Média do aluno " + aluno.nome + ": " + mediaAluno);
    }
}
