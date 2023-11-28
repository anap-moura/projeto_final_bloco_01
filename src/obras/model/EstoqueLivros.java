package obras.model;

public class EstoqueLivros extends Obras {
 private int quantidadeDisponivel;

 public EstoqueLivros(String titulo, String autor, double preco, int quantidadeDisponivel) {
     super(titulo, autor, preco);
     this.quantidadeDisponivel = quantidadeDisponivel;
 }

 public int getQuantidadeDisponivel() {
     return quantidadeDisponivel;
 }

 public void setQuantidadeDisponivel(int quantidadeDisponivel) {
     this.quantidadeDisponivel = quantidadeDisponivel;
 }

 @Override
 public void mostrarDetalhes() {
     System.out.println("Livro em Estoque:");
     System.out.println("Título: " + getTitulo());
     System.out.println("Autor: " + getAutor());
         System.out.println("Quantidade Disponível: " + quantidadeDisponivel);
 }
}