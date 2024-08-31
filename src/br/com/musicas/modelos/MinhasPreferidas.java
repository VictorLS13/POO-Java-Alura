package br.com.musicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 4){
            System.out.println("Muito em alta, considerado um sucesso.");
            
        } else if (audio.getClassificacao() >= 3) {
            System.out.println("Em alta, otima repercusão.");
        }else {
            System.out.println("Adicione a sua lista para assistir mais tarde");
        }
    }
}
