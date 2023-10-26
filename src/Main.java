import java.lang.*;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        int total = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);

        //System.out.println(total + "\n\n\n\n\n\n\n\n\n\n");

        Threads[] threads = new Threads[total];
        Warehouse warehouse = new Warehouse();
        for (int x = 0; x <= total - 1; x++) {
            threads[x] = new Threads(warehouse, Integer.parseInt(args[0]), x);
            threads[x].start();
            System.out.println("Number of threads..." + Thread.activeCount());
        }
    }
}