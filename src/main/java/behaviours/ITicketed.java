package behaviours;

import people.Visitor;

public interface ITicketed {

    Double defaultPrice(Double price);

    Double priceFor(Visitor visitor);

}
