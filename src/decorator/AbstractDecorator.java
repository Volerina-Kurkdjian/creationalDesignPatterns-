package decorator;

public abstract class AbstractDecorator implements CardBancar{

    private CardBancar card;

    public AbstractDecorator(CardBancar card) {
        this.card = card;
    }

    public abstract void platesteContactless();

    public CardBancar getCard() {
        return card;
    }

    @Override
    public void platestePOS() {
        this.card.platestePOS();
    }

    @Override
    public void platesteOnline() {
        this.card.platesteOnline();
    }
}
