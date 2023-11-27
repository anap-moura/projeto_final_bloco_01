package Livraria;

import java.util.Scanner;
import java.util.Stack;
import Livraria.util.Cores;
import obras.model.EstoqueLivros;
import obras.model.LivrosUsados;
import obras.model.Obras;

public class Menu {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Stack<String> listaLivros = new Stack<>();

        int opcao;

        while (true) {
            System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND+"*****************************************************");
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
            System.out.println("                                                     " + Cores.TEXT_RESET);
            
            
            opcao = leia.nextInt();

            try {
                processarOpcao(opcao, listaLivros, leia);
            } catch (Exception e) {
                System.out.println(Cores.TEXT_RED +"Ocorreu um erro: " + e.getMessage());
                leia.nextLine(); 
            }

            if (opcao == 0) {
                System.out.println(Cores.TEXT_CYAN +"\nObrigada por utilizar nossos serviços!");
                sobre();
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    leia.nextLine();
                    System.out.print(Cores.TEXT_CYAN + "Digite o nome do livro a ser adicionado: ");
                    String nomeLivro = leia.nextLine();
                    listaLivros.push(nomeLivro);
                    System.out.println(Cores.TEXT_CYAN + "Livro adicionado!\n");
                    break;
                case 2:
                    if (listaLivros.isEmpty()) {
                        System.out.println(Cores.TEXT_CYAN + "Sua lista está vazia :(\n");
                    } else {
                        System.out.println(Cores.TEXT_CYAN + "Lista de Livros:");
                        for (String livro : listaLivros) {
                            System.out.println(livro);
                        }
                    }
                    break;
                case 3:
                    leia.nextLine();
                    System.out.print(Cores.TEXT_CYAN + "Digite o nome do livro a ser atualizado: ");
                    String livroAntigo = leia.nextLine();
                    if (listaLivros.contains(livroAntigo)) {
                        System.out.print(Cores.TEXT_CYAN + "Digite o nome do novo livro: ");
                        String novoNome = leia.nextLine();
                        listaLivros.remove(livroAntigo);
                        listaLivros.push(novoNome);
                        System.out.println(Cores.TEXT_CYAN + "Livro atualizado!\n");
                    } else {
                        System.out.println(Cores.TEXT_RED + "Livro não encontrado...\n");
                    }
                    break;
                case 4:
                    if (listaLivros.isEmpty()) {
                        System.out.println(Cores.TEXT_CYAN + "Lista vazia :( \n");
                    } else {
                        System.out.println(Cores.TEXT_CYAN + "Lista de livros atualizada:");
                        for (int i = 0; i < listaLivros.size(); i++) {
                            System.out.println(i + 1 + ". " + listaLivros.get(i));
                        }

                        boolean entradaValida = false;
                        do {
                            System.out.print(Cores.TEXT_CYAN + "\nDigite o número do livro a ser deletado \n(ou digite 0 para voltar ao Menu principal): ");
                            int numeroLivroDeletado = leia.nextInt();

                            if (numeroLivroDeletado == 0) {
                                entradaValida = true;
                            } else if (numeroLivroDeletado >= 1 && numeroLivroDeletado <= listaLivros.size()) {
                                String livroDeletado = listaLivros.remove(numeroLivroDeletado - 1);
                                System.out.println(Cores.TEXT_CYAN + "Livro deletado: " + livroDeletado + "\n");
                                entradaValida = true;
                            } else {
                                System.out.println(Cores.TEXT_RED + "Número inválido... Tente novamente.");
                            }
                        } while (!entradaValida);
                    }
                    break;

                default:
                    System.out.println(Cores.TEXT_RED + "\nOpção Inválida!\n");
                    break;
            }
        }
    }

    private static void processarOpcao(int opcao, Stack<String> listaLivros, Scanner leia) {
       
    }

    public static void sobre() {
        System.out.println("Projeto de menu desenvolvido por: Ana Paula Moura");
    }
}
