package factory.method;

public class FabricaPortar implements FabricaJucatori{

    @Override
    public Jucator creeazaJucator(String nume, Integer numarTricou) {
        return new Portar(nume, numarTricou);
    }
}
