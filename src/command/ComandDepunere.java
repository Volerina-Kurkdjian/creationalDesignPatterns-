package command;

public class ComandDepunere extends ComandaAbstracta{

    public ComandDepunere(Executant executant, float suma) {
        super(executant, suma);
    }

    @Override
    public void executa() {
        super.getExecutant().depunere(super.getSuma());
    }
}
