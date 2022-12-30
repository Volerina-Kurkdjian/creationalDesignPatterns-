package program;

import factory.method.FabricaFundas;
import factory.method.FabricaJucatori;
import factory.method.Fundas;
import factory.method.Jucator;

public class MainFactoryMethod {

    public static void afiseazaJucatori(FabricaJucatori fabricaJucatori,String numeJucator, Integer numarTricou){
        Jucator jucator= fabricaJucatori.creeazaJucator(numeJucator,numarTricou);
        System.out.println(jucator.toString());
    }

    public static void main(String[] args) {
        Fundas fundas=new Fundas("Emil",13);
        afiseazaJucatori(new FabricaFundas(),"Emil",13);
    }
}
