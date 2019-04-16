package br.com.digitalhouse.Exercicio04;

public abstract class Peca {

    //atributos
    private String marca;
    private String modelo;

    //construtor padrão
    public Peca(){

    }

    //construtor especifico

    public Peca(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //getter e setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //metodos
    public abstract void retirada();
}
