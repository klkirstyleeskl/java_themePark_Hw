package attraction;

import themeParkOperations.Visitor;

public class Rollercoaster extends Attraction implements ITicketed{

    public Rollercoaster(String name) {
        super(name);
    }

    @Override
    public double defaultPrice() {
        return 10;
    }

    @Override
    public double price(Visitor visitor) {
        return 5;
    }
}
