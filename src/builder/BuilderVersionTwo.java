package builder;

public class BuilderVersionTwo implements AbstractBuilder{

    //DRY principle not respected, we have same attributes in Rezervare
    private int codRezervare;
    private boolean areMancareInclusa;
    private boolean areScaunInclus;
    private boolean areBauturaRacoritoareInclusa;
    private boolean areMuzicaAmbientalaInclusa;
    private String genMuzica;

    @Override
    public Rezervare build() {
        return new Rezervare(codRezervare,areMancareInclusa,areScaunInclus,areBauturaRacoritoareInclusa,areMuzicaAmbientalaInclusa,genMuzica);
    }

    public BuilderVersionTwo() {
        this.codRezervare=10;
        this.areMancareInclusa=false;
        this.areScaunInclus=false;
        this.areBauturaRacoritoareInclusa=false;
        this.areMuzicaAmbientalaInclusa=false;
        this.genMuzica=" ";
    }

    public BuilderVersionTwo setCodRezervare(int codRezervare){
        this.codRezervare=codRezervare;
        return this;
    }

    public BuilderVersionTwo setAreMancare(boolean areMancareInclusa){
        this.areMancareInclusa=areMancareInclusa;
        return this;
    }


}
