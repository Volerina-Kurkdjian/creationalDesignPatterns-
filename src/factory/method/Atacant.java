package factory.method;

public class Atacant extends Jucator{

    public Atacant(String nume, Integer nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public String toString() {
        final StringBuilder sb=new StringBuilder("Atacant{ ");
        sb.append(super.toString()).append(" }");
        return sb.toString();
    }
}
