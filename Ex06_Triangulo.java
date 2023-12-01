package exercicios_Basico_de_Orientacao_a_Objetos_em_Java;

// Crie uma classe 'Triangulo' com atributos para os lados. Adicione m�todos para calcular a �rea e verificar se � um tri�ngulo equil�tero, is�sceles ou escaleno. 

public class Ex06_Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Ex06_Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double calcularArea() {
        double s = (ladoA + ladoB + ladoC) / 2;
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }

    public String verificarTipo() {
        if (ladoA == ladoB && ladoB == ladoC) {
            return "Equil�tero";
        } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
            return "Is�sceles";
        } else {
            return "Escaleno";
        }
    }

    public static void main(String[] args) {
        Ex06_Triangulo triangulo = new Ex06_Triangulo(3, 4, 5);
        System.out.println("�rea do tri�ngulo: " + triangulo.calcularArea());
        System.out.println("Tipo do tri�ngulo: " + triangulo.verificarTipo());
    }
}
