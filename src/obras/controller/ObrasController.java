package obras.controller;

import java.util.ArrayList;

import obras.model.Obras;
import obras.repository.ObrasRepository;

public abstract class ObrasController implements ObrasRepository {
	private ArrayList<Obras> listaLivros = new ArrayList<Obras>();
	
	@Override
    public void adicionarLivro(Obras livro) {
        listaLivros.add(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    @Override
    public ArrayList<Obras> listarLivros() {
        return listaLivros;
    }

    @Override
    public void atualizarLivro(Obras livro) {
        for (int i = 0; i < listaLivros.size(); i++) {
            if (listaLivros.get(i).getTitulo().equals(livro.getTitulo())) {
                listaLivros.set(i, livro);
                System.out.println("Livro atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
    
    @Override
    public void deletarLivro(String titulo) {
        for (int i = 0; i < listaLivros.size(); i++) {
            if (listaLivros.get(i).getTitulo().equals(titulo)) {
                listaLivros.remove(i);
                System.out.println("Livro deletado com sucesso!");
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
}

   
    
   