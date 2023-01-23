package flyweight;

public class Reteta {
    private int numarReteta;
    private float sumaReteta;
    private  int nrMedicamente;

    public Reteta(int numarReteta, float sumaReteta, int nrMedicamente) {
        this.numarReteta = numarReteta;
        this.sumaReteta = sumaReteta;
        this.nrMedicamente = nrMedicamente;
    }

    public int getNumarReteta() {
        return numarReteta;
    }

    public float getSumaReteta() {
        return sumaReteta;
    }

    public int getNrMedicamente() {
        return nrMedicamente;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "numarReteta=" + numarReteta +
                ", sumaReteta=" + sumaReteta +
                ", nrMedicamente=" + nrMedicamente +
                '}';
    }
}
