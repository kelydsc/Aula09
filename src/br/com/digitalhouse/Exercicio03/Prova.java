package br.com.digitalhouse.Exercicio03;

import java.util.HashSet;
import java.util.Set;

public class Prova {

    public void somaTotal(Set<Integer> conjuntoDeInteiros){

        int valorTotal = 0;

        for (Integer valor :conjuntoDeInteiros){

            valorTotal = valorTotal + valor;
        }
        // \n -> pula linha
        System.out.println("\nValor total da soma: " + valorTotal);
    }
}


