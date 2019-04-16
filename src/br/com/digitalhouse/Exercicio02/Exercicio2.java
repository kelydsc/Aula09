package br.com.digitalhouse.Exercicio02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio2 {

    public static void main(String[] args) {

                /*
        3. Definir e inicializar uma nova lista vazia. Adicionar os seguintes elementos à
        lista vazia: 1,5,5,6,7,8,8,8.
         */

        //definição e inicialização de lista vazia
        List<Integer> listaNumeros = new ArrayList<>();

        //adicionar valores na lista vazia
        listaNumeros.add(1);
        listaNumeros.add(5);
        listaNumeros.add(5);
        listaNumeros.add(6);
        listaNumeros.add(7);
        listaNumeros.add(8);
        listaNumeros.add(8);
        listaNumeros.add(8);

        System.out.println("Resultado do List/ArrayList:");

        for (Integer valor : listaNumeros){
            System.out.println(valor);
        }

        /*
        4. Definir e inicializar um novo conjunto vazio. Adicionar os seguintes elementos
        ao conjunto vazio: 1,5,5,6,7,8,8,8.
        Imprimir o resultado na tela. Qual é a diferença entre este exercício e o anterior?

        A diferença entre a lista e o conjunto é: uma lista é uma coleção de dados do mesmo tipo, que pode haver
        repetições e a ordem é importante, e um conjunto é uma lista de dados do mesmo tipo, em que a ordem não importa
        e não pode haver repetições

         */

        System.out.println("\r\n");

        //definição e inicialização de conjunto vazio:
        Set<Integer> conjuntoNumeros = new HashSet<>();

        //adicionando elementos no conjunto vazio:
        conjuntoNumeros.add(1);
        conjuntoNumeros.add(5);
        conjuntoNumeros.add(5);
        conjuntoNumeros.add(6);
        conjuntoNumeros.add(7);
        conjuntoNumeros.add(8);
        conjuntoNumeros.add(8);
        conjuntoNumeros.add(8);

        System.out.println("Resultado do conjunto Set/HashSet:");

        for (Integer valor : conjuntoNumeros){
            System.out.println(valor);
        }
    }
}
