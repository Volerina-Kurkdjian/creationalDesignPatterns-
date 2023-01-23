package command;

public class ComandCreare extends ComandaAbstracta{
    public ComandCreare(Executant executant, float suma) {
        super(executant, suma);
    }

    @Override
    public void executa() {
        super.getExecutant().constituireCont(super.getSuma());
    }


}
