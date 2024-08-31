package br.com.musicas.modelos;

public class Musica extends Audio {
    private String album;
    private String artista;
    private String genero;


    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidadas() >= 100){
            return 5;
        }else if (this.getTotalCurtidadas() >= 50 && this.getTotalCurtidadas() < 100) {
            return 3;
        }else if(this.getTotalCurtidadas() < 50){
            return 2;
        }else {
            return 1;
        }
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

}
