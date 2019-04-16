package br.com.digitalhouse.Exercicio04;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes extends Peca {

    //criação de dicionario
    private Map<Integer, List<Peca>> mapaListaPecas = new HashMap<>();
    private int contador;

    //construtor padrão
    public GuardaVolumes(){

    }

    //construtor especifico
    public GuardaVolumes(String marca, String modelo) {
        super(marca, modelo);
    }

    //getter e setter
    public Map<Integer, List<Peca>> getMapaListaPecas() {
        return mapaListaPecas;
    }

    public void setMapaListaPecas(Map<Integer, List<Peca>> mapaListaPecas) {
        this.mapaListaPecas = mapaListaPecas;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    //metodos
    @Override
    public void retirada() {
    }

    public Integer guardarPecas(List<Peca> listaDePeca) {

        //chave
        contador = contador + 1;

        mapaListaPecas.put(contador, listaDePeca);

        //número de identificação ou chave
        return contador;
    }

    public void mostrarPecas(){

        System.out.println("Peças que estão no guarda-volumes: ");

        //percorre todas as chaves
        for (Integer chave : mapaListaPecas.keySet()){

            for (Peca valor : mapaListaPecas.get(chave)){
                System.out.println("Numero da peça: " + chave +
                        "\nMarca: " + valor.getMarca() +
                        "\nModelo: " + valor.getModelo());
            }
        }
    }

    public void mostrarPecas(Integer numero){

        System.out.println("Peças referentes ao numero: " + numero);

        for (Peca valor : mapaListaPecas.get(numero)){

            System.out.println("Marca: "    + valor.getMarca() +
                               "\nModelo: " + valor.getModelo());
        }

    }

    public void devolverPecas(Integer numero){

        System.out.println("Devolver peças referentes ao número: " + numero);

        mapaListaPecas.remove(numero);

    }
}
