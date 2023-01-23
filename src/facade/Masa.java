package facade;

public class Masa {

    private int nrMasa;
    private int capacitate;


    public Masa(int nrMasa, int capacitate) {
        this.nrMasa = nrMasa;
        this.capacitate = capacitate;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }
}
