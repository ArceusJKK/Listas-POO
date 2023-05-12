public class OperadorDeCorte implements Operario{
    @Override
    public boolean trabalhar() {
        System.out.println("Corta, Corta, Corta...");
        return true;
    }
}
