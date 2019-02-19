package attraction;

import stall.ISecurity;
import themeParkOperations.Visitor;

public class Rollercoaster extends Attraction implements ITicketed, ISecurity {

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

    @Override
    public boolean isAllowedToVisit(Visitor visitor) {
        if (visitor.getHeight() < 1.5 && visitor.getAge() < 12)
        return false;
        else return true;
    }
}
