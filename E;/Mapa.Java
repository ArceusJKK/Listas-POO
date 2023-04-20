import java.util.ArrayList;
import java.util.Map;

public class Mapa {

    private String nome;
    private int altura;
    private int largura;

    ArrayList<Inimigo> inimigos = new ArrayList<>();
    ArrayList<Heroi> Herois = new ArrayList<>();

    ArrayList<Inimigo> getInimigoMaiorAtaque() {
        Inimigo ret = new Inimigo();
        for (int i = 0; i > inimigos.size(); i++) {
            if (inimigos.get(i).getAtaque() > ret.getAtaque()) {
            }
        }
        return inimigos;
    }

    public Mapa(){
    }

    public Mapa(String nome, int altura, int largura){
        this.nome = nome;
        this.altura = altura;
        this.largura = largura;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }
}
