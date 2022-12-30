package factory.method;

public class Portar extends Jucator{

    public Portar(String nume, Integer nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public String toString() {
        final StringBuilder sb=new StringBuilder("Portar{ ");
        sb.append(super.toString()).append(" }");
        return sb.toString();
    }
}
