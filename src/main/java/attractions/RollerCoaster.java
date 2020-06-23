package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;


public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    private Visitor visitor;
    private Double price;

    public RollerCoaster(String name, int rating, Double price) {
        super(name, rating);
        this.price = price;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 12 && visitor.getHeight() >= 1.45;
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
        return null;
    }


}
