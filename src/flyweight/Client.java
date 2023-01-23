package flyweight;

public class Client implements IClient{

    private String nume;
    private int numarAsigurare;

    public Client(String nume, int numarAsigurare) {
        this.nume = nume;
        this.numarAsigurare = numarAsigurare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNumarAsigurare() {
        return numarAsigurare;
    }

    public void setNumarAsigurare(int numarAsigurare) {
        this.numarAsigurare = numarAsigurare;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", numarAsigurare=" + numarAsigurare +
                '}';
    }

    @Override
    public void printareReteta(Reteta reteta) {
        System.out.println(this.nume +" are reteta "+reteta.toString());
    }
}
