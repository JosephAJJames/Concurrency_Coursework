public class Threads extends Thread {

    Warehouse warehouse;
    int numOfAdds;
    int threadNumber;

    public Threads(Warehouse inv, int numOfAdds, int threadNumber){
        this.warehouse = inv;
        this.numOfAdds = numOfAdds;
        this.threadNumber = threadNumber;
    }

    @Override
    public void run()
    {
        if (threadNumber >= numOfAdds) { //perform remove
            warehouse.removeStock();
        } else { //perform add
            warehouse.addStock();
        }
    }
}
