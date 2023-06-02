public class Pokemon {

    private String codigoIndetificador;
    private String nome;
    private String tipo;

    public Pokemon(){
    }

    public Pokemon(String codigoIndetificador, String nome, String tipo){
        this.codigoIndetificador = codigoIndetificador;
        this.nome = nome;
        this.tipo = tipo;
    }
    public String getCodigoIndetificador() {
        return codigoIndetificador;
    }
    public void setCodigoIndetificador(String codigoIndetificador){
        this.codigoIndetificador = codigoIndetificador;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
}


