package factory.method;

public class Fundas extends Jucator{

    public Fundas(String nume, Integer nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public String toString() {
        final StringBuilder sb=new StringBuilder("Fundas{ ");
        sb.append(super.toString()).append(" }");
        return sb.toString();
    }
}
