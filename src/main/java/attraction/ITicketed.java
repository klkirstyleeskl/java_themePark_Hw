package attraction;

import themeParkOperations.Visitor;

public interface ITicketed {
    double defaultPrice();
    double price(Visitor visitor);


}
