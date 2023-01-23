package command;

public class Executant {
    private float sold;
    private String detinator;

    public Executant(String detinator) {
        this.detinator = detinator;
    }

    public void constituireCont(float suma){
        this.sold=suma;
        System.out.println("S-a constituit soldul cu suma de: "+suma);
    }

    public void retragere(float suma){
        if(this.sold>suma) {
            this.sold-=suma;
            System.out.println("S-a retras suma de "+suma);
        }
        System.out.println("Fonduri insuficiente!");
    }

    public void depunere(float suma){
        this.sold+=suma;
        System.out.println("S-a depus suma "+suma);
    }
}
