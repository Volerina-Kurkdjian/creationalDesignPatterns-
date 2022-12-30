package factory.method;

public class FabricaFundas implements FabricaJucatori{

    @Override
    public Jucator creeazaJucator(String nume, Integer numarTricou) {
        return new Fundas(nume, numarTricou);
    }
}
