public class OperadorDePrensa implements Operario{
    @Override
    public boolean trabalhar() {
        System.out.println("Prensa, Prensa, Prensa...");
        return true;
    }
}
