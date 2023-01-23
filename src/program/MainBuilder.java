package program;

import builder.BuilderRezervare;
import builder.BuilderVersionTwo;
import builder.Rezervare;

public class MainBuilder {

    public static void main(String[] args) {

        Rezervare rezervare = new Rezervare(11, true,
                true, true, false, "country");

        BuilderRezervare builderRezervare = new BuilderRezervare().setCodRezervare(111).setAreBauturaRacoritoareInclusa(false).setAreMancareInclusa(true).setAreMuzicaAmbientalaInclusa(true).setAreScaunInclus(false).setGenMuzica("pop");
        Rezervare rezervare1 = builderRezervare.build();
        System.out.println(rezervare);
        System.out.println(rezervare1);

        Rezervare rezervare2=new BuilderRezervare().setCodRezervare(110).build();
        System.out.println(rezervare2);

        //can we reuse a builder already created?
        Rezervare rezervare3= builderRezervare.setCodRezervare(5).build();
        System.out.println(rezervare3);
        System.out.println(rezervare1);

        //V2
        BuilderVersionTwo builderVersionTwo=new BuilderVersionTwo().setCodRezervare(10).setAreMancare(true);
        Rezervare rezervare4=builderVersionTwo.build();
        rezervare4.setCodRezervare(1101);
        Rezervare rezervare5= builderVersionTwo.build();
        System.out.println(rezervare4);
        System.out.println(rezervare5);
    }
}
