package br.com.digitalhouse.Aula09;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //cria lista vazia -- ArrayList é uma classe concreta -- ArrayList<E> aceita classes generica
        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa tairo = new Pessoa("Tairo","Roberto",30);
        Pessoa jessica = new Pessoa("Jessica","Milena",18);
        Pessoa vini = new Pessoa("Vini","PHP",35);

        pessoas.add(tairo);
        pessoas.add(jessica);
        pessoas.add(vini);

        /*
        for (Pessoa pessoa : pessoas) {

            //\n pula linha
            System.out.println("Nome: " + pessoa.getNome() + "\nSobrenome: " + pessoa.getSobrenome() + "\n");
        }
        */

        Set<Pessoa> pessoaSet = new HashSet<>();
        pessoaSet.add(tairo);
        pessoaSet.add(jessica);

        //não adiciona mais de uma vez o mesmo valor só sobrescreve
        pessoaSet.add(vini);
        pessoaSet.add(vini);
        pessoaSet.add(vini);

/*        for (Pessoa pessoa : pessoaSet){
            System.out.println("Nome: " + pessoa.getNome() + "\nSobrenome: " + pessoa.getSobrenome() + "\n");
        }*/

        Map<String, Pessoa> pessoaMap = new HashMap<>();
        pessoaMap.put("Tairo",tairo);
        pessoaMap.put("Jessica",jessica);
        pessoaMap.put("Vini",vini); //acusa que esta repetindo o mesmo valor, porém ele nao repete, por causa da chave
        pessoaMap.put("Vini",vini);
        pessoaMap.put("Vini",vini);

        for(String chave: pessoaMap.keySet()){

            System.out.println("Nome: " + pessoaMap.get(chave).getNome() + "\nSobrenome: " +
                                pessoaMap.get(chave).getSobrenome() + "\n");
        }
    }
}
