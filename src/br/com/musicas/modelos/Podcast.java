package br.com.musicas.modelos;

public class Podcast extends Audio{
    private String host;
    private String descricao;

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() >= 1000){
            return 5;
        }else if (this.getTotalReproducoes() >= 500 && this.getTotalReproducoes() < 1000) {
            return 3;
        }else if(this.getTotalReproducoes() < 500){
            return 2;
        }else {
            return 1;
        }
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
