package exercicios_Basico_de_Orientacao_a_Objetos_em_Java;

// Crie uma classe chamada 'C�rculo' que utilize a classe 'Ponto' para representar um c�rculo. Adicione m�todos para calcular a �rea e o per�metro do c�rculo. 

class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

public class Ex02_Circulo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("�rea do c�rculo: " + circulo.calcularArea());
        System.out.println("Per�metro do c�rculo: " + circulo.calcularPerimetro());
    }
}

