package builder;

public class Rezervare {

    private int codRezervare;
    private boolean areMancareInclusa;
    private boolean areScaunInclus;
    private boolean areBauturaRacoritoareInclusa;
    private boolean areMuzicaAmbientalaInclusa;
    private String genMuzica;

    public Rezervare(int codRezervare, boolean areMancareInclusa, boolean areScaunInclus, boolean areBauturaRacoritoareInclusa, boolean areMuzicaAmbientalaInclusa, String genMuzica) {
        this.codRezervare = codRezervare;
        this.areMancareInclusa = areMancareInclusa;
        this.areScaunInclus = areScaunInclus;
        this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
        this.areMuzicaAmbientalaInclusa = areMuzicaAmbientalaInclusa;
        this.genMuzica = genMuzica;
    }

    public void setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
    }

    public void setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
    }

    public void setAreScaunInclus(boolean areScaunInclus) {
        this.areScaunInclus = areScaunInclus;
    }

    public void setAreBauturaRacoritoareInclusa(boolean areBauturaRacoritoareInclusa) {
        this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
    }

    public void setAreMuzicaAmbientalaInclusa(boolean areMuzicaAmbientalaInclusa) {
        this.areMuzicaAmbientalaInclusa = areMuzicaAmbientalaInclusa;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "codRezervare=" + codRezervare +
                ", areMancareInclusa=" + areMancareInclusa +
                ", areScaunInclus=" + areScaunInclus +
                ", areBauturaRacoritoareInclusa=" + areBauturaRacoritoareInclusa +
                ", areMuzicaAmbientalaInclusa=" + areMuzicaAmbientalaInclusa +
                ", genMuzica='" + genMuzica + '\'' +
                '}';
    }
}
