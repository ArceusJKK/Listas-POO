public class Musica {

    String nome;
    private int duracaoEmSegundos;
    private int popularidade;
    private String genero;
    public Musica(){
    }
    public Musica (int duracaoEmSegundos, int popularidade, String genero){
        this.duracaoEmSegundos = duracaoEmSegundos;
        this.popularidade = popularidade;
        this.genero = genero;
    }

    public int getDuracaoEmSegundos(){
        return duracaoEmSegundos;
    }
    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public int getPopularidade() {
        return popularidade;
    }
    public void setPopularidade(){
        this.popularidade = popularidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
