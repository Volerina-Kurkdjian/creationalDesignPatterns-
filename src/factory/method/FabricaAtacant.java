package factory.method;

public class FabricaAtacant implements FabricaJucatori{


    @Override
    public Jucator creeazaJucator(String nume, Integer numarTricou) {
        return new Atacant(nume, numarTricou);
    }
}
