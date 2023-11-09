package Strategy;

public class TableReserver {
    private ITableReservingStrategy iTableReservingStrategy;

    public TableReserver(){
        this.iTableReservingStrategy = new WithoutTable();
    }

    public void setReserveBehavior(ITableReservingStrategy iTableReservingStrategy) {

        this.iTableReservingStrategy = iTableReservingStrategy;
    }

    public void perform(){
        iTableReservingStrategy.reserveTable();
    }
}
