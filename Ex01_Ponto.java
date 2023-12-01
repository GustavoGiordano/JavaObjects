package exercicios_Basico_de_Orientacao_a_Objetos_em_Java;

// Crie uma classe chamada 'Ponto' com atributos 'x' e 'y' (coordenadas) e métodos para definir e exibir esses valores. 

public class Ex01_Ponto {
    private double x;
    private double y;

    public Ex01_Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Coordenadas: (" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Ex01_Ponto ponto = new Ex01_Ponto(3.5, 7.2);
        System.out.println(ponto);

        ponto = new Ex01_Ponto(1.0, 4.5);
        System.out.println(ponto);
    }
}
