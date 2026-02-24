/*
 * Autor: Fabio Ferreira de Souza Santos
 * RU: 5240251
 * Professor: Prof. Leonardo Gomes
 * Disciplina: Programacao Orientada a Objetos
 * Data: Fevereiro/2026
 * Descricao: Programa Cofrinho que permite adicionar, remover, listar e converter moedas.
 */

package Cofre;
import java.util.InputMismatchException;
import java.util.Scanner;

// Classe Principal Controla o fluxo do programa e interage com o usuario. 
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        int opcao = -1;

        /*
         * Menu do Cofrinho
         * Foi colocado \n para quando o menu aparecer não ficar muito junto da frase a cima. 
         */
        do {
            System.out.println(" \n COFRINHO:"); 
            System.out.println("1 - Adicionar Moeda");
            System.out.println("2 - Remover Moeda");
            System.out.println("3 - Listar Moedas");
            System.out.println("4 - Calcular valor total convertido em Real");
            System.out.println("0 - Encerrar");
            System.out.print("\n Escolha uma opção: "); 
            
            try {
            	  opcao = teclado.nextInt(); 
         /*
          * Foi adicionado os tratamentos de erros para entradas nao numericas, pois quando eu estava testando notei que colocando uma letra o codigo crashava.
          * Assim evita que o programa crash.
          */
            } catch (InputMismatchException e) {
            	System.out.println("Entrada inválida! Digite apenas numeros.");
            	teclado.nextLine(); // limpa o buffer do Scanner apos erro de entrada, garantindo que o proximo input seja lido corretamente.
            	opcao= -1; // força repetir o menu
            	continue;
            }
            	if (opcao == 1 ) {
                    System.out.println("1 - Real R$"); // Foi adicionado os Simbolos das Moedas para ficar mais facil a compreensao 
                    System.out.println("2 - Dólar $");
                    System.out.println("3 - Euro €");
                    
                    int tipo = -1;
                    try {
                        tipo = teclado.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida! Digite apenas numeros.");
                        teclado.nextLine();
                        continue;
                    }

          /*
           * Foi adicionado esse tratamento, pois quando o usuario digita algum numero inexistente o programa
           * nao prossiga e ja apareça a msg invalido.
           */
                    if (tipo < 1 || tipo > 3) {
                        System.out.println("Tipo inválido! Escolha apenas 1, 2 ou 3.");
                        continue; 
                    }
                    
                    double valor = 0;
                    try {
                        System.out.print("Digite o valor da moeda: ");
                        valor = teclado.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida! Digite apenas numeros (decimais ou inteiros.)");
                        teclado.nextLine(); 
                        continue; 
                    }

                    Moeda moeda = null;
                    if (tipo == 1) moeda = new Real(valor);
                    else if (tipo == 2) moeda = new Dolar(valor);
                    else if (tipo == 3) moeda = new Euro(valor);

                    if (moeda != null) {
                        cofrinho.adicionar(moeda);
                        System.out.println("Moeda adicionada com sucesso!"); // Foi adicionado uma mensagem para confirmar que foi registrado com sucesso.  
                    } else {
                        System.out.println("Tipo inválido."); 
                    }
                  
            }	else if (opcao == 2) {
                System.out.println("1 - Real");
                System.out.println("2 - Dólar");
                System.out.println("3 - Euro");

                int tipo = -1;
                try {
                    tipo = teclado.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Digite apenas numeros.");
                    teclado.nextLine();
                    continue;
                }

             
                if (tipo < 1 || tipo > 3) {
                    System.out.println("Tipo inválido! Escolha apenas 1, 2 ou 3.");
                    continue; // volta ao menu sem pedir valor
                }

                double valor = 0;
                try {
                    System.out.println("Digite o valor exato da moeda que sera removida: ");
                    valor = teclado.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Digite apenas numeros (decimais ou inteiros.)");
                    teclado.nextLine();
                    continue;
                }

                Moeda mExcluir = null;
                if (tipo == 1) {
                    mExcluir = new Real(valor);
                } else if (tipo == 2) {
                    mExcluir = new Dolar(valor);
                } else if (tipo == 3) {
                    mExcluir = new Euro(valor);
                }

                if (mExcluir != null) {
                    cofrinho.remover(mExcluir);
                } else {
                    System.out.println("Tipo inválido.");
                }
                    
            }  else if (opcao == 3) { //Lista todas as moedas armazenadas no cofrinho
                    cofrinho.listagemMoedas();

            }  else if (opcao == 4) { // Calcula o valor total das moedas convertidas para Real
                    double total = cofrinho.totalConvertido();
                    System.out.println("\n Total convertido em Real: R$ " + String.format("%.2f", total)); //Foi usado o string para o resultado ficar com 2 casas decimais

            }  else if (opcao == 0) { //Encerra o programa quando o usuario escolhe a opção 0
                    System.out.println("Encerrando o programa...");
                    break;

            }        else { //Caso o usuario digite uma opção que não existe, informa o erro.
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        teclado.close();
    }
}

