package Strategy;

public class WithoutTable implements ITableReservingStrategy{
    @Override
    public void reserveTable() {
        System.out.println("Your order is without table");
    }
}
