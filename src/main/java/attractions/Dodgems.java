package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    private Visitor visitor;
    private Double price;


    public Dodgems(String name, int rating, Double price) {
        super(name, rating);
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public Double defaultPrice(Double price){
        return defaultPrice(price) * 2;
    }

    @Override
    public Double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12){
            price = price / 2;
        }
        else price = price;
        return price;
    }
}
