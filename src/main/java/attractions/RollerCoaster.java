package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() > 12 && visitor.getHeight() > 1.45);
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 2.00) {
            return this.defaultPrice() * 2;
        } else {
            return this.defaultPrice();
        }
    }
}
