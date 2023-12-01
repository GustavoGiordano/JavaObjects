package exercicios_Basico_de_Orientacao_a_Objetos_em_Java;

// Crie uma classe 'Carro' com atributos como modelo, ano e cor. Adicione métodos para ligar, desligar e exibir informações sobre o carro.

public class Ex05_Carro {
    private String modelo;
    private int ano;
    private String cor;
    private boolean ligado;

    public Ex05_Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro está ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O carro está desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
    }

    public static void main(String[] args) {
        Ex05_Carro meuCarro = new Ex05_Carro("Fusca", 1970, "Azul");
        meuCarro.exibirInfo();
        meuCarro.ligar();
        meuCarro.exibirInfo();
        meuCarro.desligar();
        meuCarro.exibirInfo();
    }
}
