package br.com.musicas.modelos;

public class Audio {
    private String nome;
    private int totalReproducoes;
    private int totalCurtidadas;
    private int classificacao;

    public void curte(){
        this.totalCurtidadas++;
    }

    public void reproduzir(){
        this.totalReproducoes++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }


    public int getTotalCurtidadas() {
        return totalCurtidadas;
    }

    public int getClassificacao() {
        return classificacao;
    }




}
