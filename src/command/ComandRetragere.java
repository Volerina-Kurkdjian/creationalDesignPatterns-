package command;

public class ComandRetragere extends ComandaAbstracta{

    public ComandRetragere(Executant executant, float suma) {
        super(executant, suma);
    }

    @Override
    public void executa() {
        super.getExecutant().retragere(super.getSuma());
    }
}
