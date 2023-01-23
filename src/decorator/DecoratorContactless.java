package decorator;

public class DecoratorContactless  extends AbstractDecorator{


    public DecoratorContactless(CardBancar card) {
        super(card);
    }

    @Override
    public void platesteContactless() {
        System.out.println(((Card)super.getCard()).getTitular()+" a realizat o plata contactless");
    }
}
