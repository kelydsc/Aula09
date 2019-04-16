package br.com.digitalhouse.Exercicio01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio1 {

    public static void main(String[] args) {

        /*
        1- Números da Loteria dos Sonhos:
        0 → Ovos
        1 → Água
        2 → Escopeta
        3 → Cavalo
        4 → Dentista
        5 → Fogo
         */

        //declaração do mapa
        Map<Integer, String> loteriaDosSonhos = new HashMap<>();

        loteriaDosSonhos.put(0, "Ovos");
        loteriaDosSonhos.put(1, "Agua");
        loteriaDosSonhos.put(2, "Escopeta");
        loteriaDosSonhos.put(3, "Cavalo");
        loteriaDosSonhos.put(4, "Dentista");
        loteriaDosSonhos.put(5, "Fogo");

        for(int chave : loteriaDosSonhos.keySet()){
            System.out.println("Valor da loteria: " + loteriaDosSonhos.get(chave));
        }


        /*
        2-Apelidos:
        João → Juan, Fissura, Maromba
        Miguel → Night Watch, Bruce Wayne, Tampinha
        Maria → Wonder Woman, Mary, Marilene
        Lucas → Lukinha, Jorge, George
         */

        //declaração do mapa
        Map<String, List<String>> apelidos = new HashMap<>();

        List<String> apelidosJoao = new ArrayList<>();
        apelidosJoao.add("Juan");
        apelidosJoao.add("Fissura");
        apelidosJoao.add("Maromba");

        List<String> apelidosMiguel = new ArrayList<>();
        apelidosMiguel.add("Night Watch");
        apelidosMiguel.add("Bruce Wayne");
        apelidosMiguel.add("Tampinha");

        List<String> apelidosMaria = new ArrayList<>();
        apelidosMaria.add("Wonder Woman");
        apelidosMaria.add("Mary");
        apelidosMaria.add("Marilene");

        List<String> apelidosLucas = new ArrayList<>();
        apelidosLucas.add("Lukinha");
        apelidosLucas.add("Jorge");
        apelidosLucas.add("George");

        //neste caso a chave pode ser maiuscula ou minuscula:
        apelidos.put("joao",apelidosJoao);
        apelidos.put("Miguel",apelidosMiguel);
        apelidos.put("maria",apelidosMaria);
        apelidos.put("lucas",apelidosLucas);

        System.out.println("\r\n");

        for(String chave : apelidos.keySet()){

            System.out.println("Apelidos do : " + chave);

            for(String apelido : apelidos.get(chave)){

                // \t = Tab
                System.out.println("\t" + apelido);
            }
        }
    }
}
