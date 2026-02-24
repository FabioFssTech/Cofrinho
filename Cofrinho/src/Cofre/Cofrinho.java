/*
 * Autor: Fabio Ferreira de Souza Santos
 * RU: 5240251
 * Professor: Prof. Leonardo Gomes
 * Disciplina: Programacao Orientada a Objetos
 * Data: Fevereiro/2026
 * Descricao: Programa Cofrinho que permite adicionar, remover, listar e converter moedas.
 */

package Cofre;

import java.util.ArrayList;

/*	
 * Responsavel por armazenar todas as moedas adicionadas no cofrinho.
 * E um arraylist de moeda, permitindo guardar diferentes tipos de moedas.
 */
public class Cofrinho {
    private ArrayList<Moeda> listaMoedas;  
    
//inicializa a lista de moedas com um ArrayList vazio.
    public Cofrinho() {
        listaMoedas = new ArrayList<>();
    }

//Recebe uma moeda e insere na lista. 
    public void adicionar(Moeda moeda) { 
        listaMoedas.add(moeda);
    }
    
/*
 * O metodo remove() do Arraylist elimina apenas a primeira ocorrência da moeda encontrada.
 * Exemplo: Se houver duas moedas iguais (R$0,50), apenas uma sera removida.
 * Isso nao e um erro, mas sim o comportamento padrao da colecao.
 * Notei por acaso, pois estava conferindo se os tratamentos de erros estavam funcionando de forma correta. 
 * Essa limitacao foi percebida durante os testes de validacao de entradas.
 */
    public void remover(Moeda moeda) { 
        boolean removida = listaMoedas.remove(moeda);
        if (removida) {
            System.out.println("Moeda removida com sucesso!");
        } else {
            System.out.println("Não existe essa moeda no cofrinho.");  
        }
    }

/* 
 * Mostra todas as moedas armazenadas no cofrinho, ambas com suas identificacoes(R$,$ ou €).
 * Se estiver vazio informa ao usuario.      
 */
    public void listagemMoedas() {
        if (listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
        } else {
            System.out.println(" \n Moedas armazenadas no cofrinho:");
            for (Moeda m : listaMoedas) {
                System.out.println(m.info());
            }
        }
    }

//Calcula o valor total das moedas convertendo todas para o Real.
    public double totalConvertido() {
        double total = 0;
        for (Moeda m : listaMoedas) {
            total += m.converter();
        }
        return total;
    }
}