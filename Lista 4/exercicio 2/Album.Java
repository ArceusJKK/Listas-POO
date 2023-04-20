import java.util.ArrayList;

public class Album {

    private String nome;
    private String nomeArtista;

    ArrayList<Musica> musicas;

    ArrayList<Musica> musicasMaisPopulares = new ArrayList<>();
    ArrayList<Musica> musicasMenorDuração = new ArrayList<>();


    ArrayList<Musica> getMusicasMaisPopulares() {
        Musica ret = new Musica();

        for (int i = 0; i > musicasMaisPopulares.size(); i++) {
            if (musicas.get(i).getPopularidade() > ret.getPopularidade()){
            }
        }
        return musicas;
    }
    ArrayList<Musica> getMusicasMenorDuração() {
        Musica ret = new Musica();

        for (int i = 0; i > musicas.size(); i++) {
            if (musicas.get(i).getDuracaoEmSegundos() > ret.getDuracaoEmSegundos()){
            }
        }
        return musicas;
    }

    public Album (){
    }
    public Album (String nomeArtista, String nome){
        this.nome = nome;
        this.nomeArtista = nomeArtista;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNomeArtista(){
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }
}



