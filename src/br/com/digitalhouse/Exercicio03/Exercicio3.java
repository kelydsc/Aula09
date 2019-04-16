package br.com.digitalhouse.Exercicio03;

import java.util.HashSet;
import java.util.Set;

public class Exercicio3 {

    public static void main(String[] args) {

        Prova prova = new Prova();

        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);
        conjunto.add(4);

        System.out.println("Resultado do conjunto Set/HashSet: ");

        for (Integer valor : conjunto){
            System.out.println(valor);
        }

        prova.somaTotal(conjunto);

    }
}
