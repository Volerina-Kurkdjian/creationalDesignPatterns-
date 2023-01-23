package adapter;

public class Leasing {

    private String numeClient;
    private int suma;

    public Leasing(String numeClient, int suma) {
        this.numeClient = numeClient;
        this.suma = suma;
    }

    public void oferaLeasing(){
        System.out.println("Leasing of value: "+this.suma+" has been offered to "+this.numeClient);
    }
}
