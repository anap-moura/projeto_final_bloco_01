package obras.model;

public class LivrosUsados extends Obras {
 private int anoPublicacao;

 public LivrosUsados(String titulo, String autor, double preco, int anoPublicacao) {
     super(titulo, autor, preco);
     this.anoPublicacao = anoPublicacao;
 }

 public int getAnoPublicacao() {
     return anoPublicacao;
 }

 public void setAnoPublicacao(int anoPublicacao) {
     this.anoPublicacao = anoPublicacao;
 }

 @Override
 public void mostrarDetalhes() {
     System.out.println("Livro Usado:");
     System.out.println("Título: " + getTitulo());
     System.out.println("Autor: " + getAutor());
     System.out.println("Preço: $" + getPreco());
     System.out.println("Ano de Publicação: " + anoPublicacao);
 }
}