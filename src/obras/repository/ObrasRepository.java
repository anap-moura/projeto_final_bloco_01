package obras.repository;

import java.util.List;

import obras.model.Obras;

public interface ObrasRepository {
	public void adicionarLivro(Obras livro);
    List<Obras> listarLivros();
    public void atualizarLivro(Obras livro);
    public void deletarLivro(String titulo);
}
