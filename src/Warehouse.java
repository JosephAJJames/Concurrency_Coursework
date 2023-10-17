public class Warehouse {

    private int stock = 0;

    public synchronized void addStock()
    {
        stock++;
        System.out.println("added stock +1, current stock:" + stock);
    }

    public synchronized void removeStock()
    {
        stock--;
        System.out.println("removed stock -1, current stock:" + stock);
    }
}
