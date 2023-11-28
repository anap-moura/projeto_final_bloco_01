package obras.model;

public class LivrosUsados extends Obras {
    private int anoPublicacao;
    private String estadoLivro;

    public LivrosUsados(String titulo, String autor, double preco, int anoPublicacao, String estadoLivro) {
        super(titulo, autor, preco);
        this.anoPublicacao = anoPublicacao;
        this.estadoLivro = estadoLivro;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getEstadoLivro() {
        return estadoLivro;
    }

    public void setEstadoLivro(String estadoLivro) {
        this.estadoLivro = estadoLivro;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Livro Usado:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
         System.out.println("Estado do Livro: " + estadoLivro);
        System.out.println("Desconto: " + calcularDesconto() + "%");
    }

    // Método para calcular e retornar o desconto com base no estado do livro
    public double calcularDesconto() {
        switch (estadoLivro.toLowerCase()) {
            case "danificado":
                return 45.0;
            case "seminovo":
                return 15.0;
            default:
                return 0.0;
        }
    }
}