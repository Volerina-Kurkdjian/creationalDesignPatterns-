package builder;

public class BuilderRezervare implements AbstractBuilder{

    Rezervare rezervare=null;

    @Override
    public Rezervare build() {

        return rezervare;
    }

    public BuilderRezervare() {

        this.rezervare = new Rezervare(0,false,false,false,false,"");
    }

    public BuilderRezervare(int codRezervare) {
        this.rezervare = new Rezervare(codRezervare,false,false,false,false,"");
    }

    public BuilderRezervare setCodRezervare(int codRezervare){
        this.rezervare.setCodRezervare(codRezervare);
        return this;
    }

    public BuilderRezervare setAreMancareInclusa(boolean areMancareInclusa) {
        this.rezervare.setAreMancareInclusa(areMancareInclusa);
        return this;
    }

    public BuilderRezervare setAreScaunInclus(boolean areScaunInclus) {
        this.rezervare.setAreScaunInclus(areScaunInclus);
        return this;
    }

    public BuilderRezervare setAreBauturaRacoritoareInclusa(boolean areBauturaRacoritoareInclusa) {
        this.rezervare.setAreBauturaRacoritoareInclusa(areBauturaRacoritoareInclusa);
        return this;
    }

    public BuilderRezervare setAreMuzicaAmbientalaInclusa(boolean areMuzicaAmbientalaInclusa) {
        this.rezervare.setAreMuzicaAmbientalaInclusa(areMuzicaAmbientalaInclusa);
        return this;
    }

    public BuilderRezervare setGenMuzica(String genMuzica) {
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }

    @Override
    public String toString() {
        return "BuilderRezervare{" +
                "rezervare=" + rezervare +
                '}';
    }
}
