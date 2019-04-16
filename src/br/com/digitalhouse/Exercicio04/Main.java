package br.com.digitalhouse.Exercicio04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        GuardaVolumes guardaVolumes = new GuardaVolumes();

        //criação de lista vazia
        List<Peca> listaPeca01 = new ArrayList<>();

        List<Peca> listaPeca02 = new ArrayList<>();

        //criação parametro de entrada dos metodos
        int contador01 = 0;
        int contador02 = 0;

        //adicionar peças na lista
        Peca listaPeca1 = new GuardaVolumes("Reserva","Blusa");

        Peca listaPeca2 = new GuardaVolumes("Forum", "Saia");

        listaPeca01.add(listaPeca1);

        listaPeca02.add(listaPeca2);

        //guardar peças
        contador01 = guardaVolumes.guardarPecas(listaPeca01);
        guardaVolumes.mostrarPecas(contador01);

        contador02 = guardaVolumes.guardarPecas(listaPeca02);
        guardaVolumes.mostrarPecas(contador02);

        //mostrar todas as peças do guarda-volumes
        guardaVolumes.mostrarPecas();

        //devolver peças
        guardaVolumes.devolverPecas(contador01);

        guardaVolumes.mostrarPecas();
    }
}
