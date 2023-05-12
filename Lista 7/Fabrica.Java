import java.util.List;

public class Fabrica {
    boolean iniciarExpediente;
    private List<Operario> operadores;

    public List<Operario> getOperadores() {
        return operadores;
    }

    public void iniciarExpediente(List<Operario> operadores) {
        this.operadores = operadores;
    }



}
