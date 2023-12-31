package IceCreamDecorator;
import IceCreamFactory.*;

public class CherrySyrop extends IceCreamDecorator{

    public CherrySyrop(ProductManagment iceCream) {
        super(iceCream);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cherry syrop added");
    }

    @Override
    public double getCost(){
        return super.getCost() + 50.0;
    }
}
