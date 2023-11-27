package Livraria;

import java.util.Scanner;
public class Menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

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
					System.out.println("Adicionar Livro\n\n");

					break;
				case 2:
					System.out.println("Listar todos os livros\n\n");

					break;
				case 3:
					System.out.println("Atualizar livros\n\n");

					break;
				case 4:
					System.out.println("Deletar livro da lista \n\n");

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