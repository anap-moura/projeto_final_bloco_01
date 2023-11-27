package Livraria;

import java.util.Scanner;
import java.util.Stack;
public class Menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Stack<String> listaLivros = new Stack<>();

		int opcao;

		while (true) {
			System.out.println("*****************************************************");
			System.out.println("          Seja bem vindo(a) à Livraria APMC!         ");                            
			System.out.println("            Selecione a opção desejada               ");                        
			System.out.println("                 no MENU abaixo:                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Livro                      ");
			System.out.println("            2 - Listar todos os livros        	     ");
			System.out.println("            3 - Atualizar livros         			 ");
			System.out.println("            4 - Deletar livro da lista               ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("\nObrigada por utilizar nossos serviços!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
                
                leia.nextLine();
                System.out.print("Digite o nome do livro a ser adicionado: ");
                String nomeLivro = leia.nextLine();
                listaLivros.push(nomeLivro);
                System.out.println("Livro adicionado!\n");
                break;
				case 2:
                    if (listaLivros.isEmpty()) {
                        System.out.println("Sua lista está vazia :(\n");
                    } else {
                        System.out.println("Lista de Livros na Pilha:");
                        for (String livro : listaLivros) {
                            System.out.println(livro);
                        }
                        System.out.println();
                    }
                    break;
	
				case 3:
                    leia.nextLine();
                    System.out.print("Digite o nome do livro a ser atualizado: ");
                    String livroAntigo = leia.nextLine();
                    if (listaLivros.contains(livroAntigo)) {
                        System.out.print("Digite o novo nome do livro: ");
                        String novoNome = leia.nextLine();
                        listaLivros.remove(livroAntigo);
                        listaLivros.push(novoNome);
                        System.out.println("Livro atualizado!\n");
                    } else {
                        System.out.println("Livro não encontrado na pilha.\n");
                    }
                    break;
				case 4:
				    if (listaLivros.isEmpty()) {
				        System.out.println("Lista vazia :( \n");
				    } else {
				        System.out.println("Lista de Livros atualizada:");
				        for (int i = 0; i < listaLivros.size(); i++) {
				            System.out.println(i + 1 + ". " + listaLivros.get(i));
				        }

				        boolean entradaValida = false;
				        do {
				            System.out.print("\nDigite o número do livro a ser deletado \n(ou digite 0 para voltar ao Menu principal): ");
				            int numeroLivroDeletado = leia.nextInt();

				            if (numeroLivroDeletado == 0) {
				                entradaValida = true;
				            } else if (numeroLivroDeletado >= 1 && numeroLivroDeletado <= listaLivros.size()) {
				                String livroDeletado = listaLivros.remove(numeroLivroDeletado - 1);
				                System.out.println("Livro deletado: " + livroDeletado + "\n");
				                entradaValida = true;
				            } else {
				                System.out.println("Número inválido... Tente novamente.");
				            }
				        } while (!entradaValida);
				    }
				    break;
								
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Ana Paula Moura");
		System.out.println("Contato: ana.mcruz@hotmail.com");
		System.out.println("github.com/anap-moura");
		System.out.println("*********************************************************");
	}
}