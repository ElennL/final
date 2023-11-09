package Strategy;

public class Table implements ITableReservingStrategy{
    @Override
    public void reserveTable() {
        System.out.println("Regular table has been reserved");
    }
}
