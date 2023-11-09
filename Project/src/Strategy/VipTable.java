package Strategy;

public class VipTable implements ITableReservingStrategy{
    @Override
    public void reserveTable() {
        System.out.println("Vip table has been reserved");
    }
}
