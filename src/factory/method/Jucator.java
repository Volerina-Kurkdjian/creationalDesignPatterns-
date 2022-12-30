package factory.method;

public abstract class Jucator {

    private String nume;
    private Integer nrTricou;

    public Jucator(String nume, Integer nrTricou) {
        this.nume = nume;
        this.nrTricou = nrTricou;
    }

    public String getNume() {
        return nume;
    }

    public Integer getNrTricou() {
        return nrTricou;
    }

    @Override
    public String toString() {
        return "Jucator{" +
                "nume='" + nume + '\'' +
                ", nrTricou=" + nrTricou +
                '}';
    }
}
