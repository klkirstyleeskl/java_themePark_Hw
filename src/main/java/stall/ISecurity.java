package stall;

import themeParkOperations.Visitor;

public interface ISecurity {
    boolean isAllowedToVisit(Visitor visitor);
}
