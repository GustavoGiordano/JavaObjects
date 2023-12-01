package exercicios_Basico_de_Orientacao_a_Objetos_em_Java;

// Crie uma classe chamada 'Livro' com atributos como t�tulo, autor e n�mero de p�ginas. Adicione m�todos para exibir informa��es sobre o livro.

public class Ex03_Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Ex03_Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void exibirInformacoes() {
        System.out.println("Livro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("N�mero de P�ginas: " + numeroPaginas);
    }

    public static void main(String[] args) {
        Ex03_Livro livro = new Ex03_Livro("O Senhor dos An�is", "J.R.R. Tolkien", 1178);
        livro.exibirInformacoes();
    }
}