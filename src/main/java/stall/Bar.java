package stall;

import themeParkOperations.Visitor;

public class Bar extends Stall implements ISecurity{

    public Bar(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public boolean isAllowedToVisit(Visitor visitor) {
        if (visitor.getAge() < 18)
            return false;
        else return true;
    }
}
