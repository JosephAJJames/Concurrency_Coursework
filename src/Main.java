public class Main {
    public static void main(String[] args)
    {
        int total = Integer.parseInt(args[0] + args[1]);
        Threads[] threads = new Threads[total];
        Warehouse warehouse = new Warehouse();
        for (int x = 0; x < total; x++) {
            threads[x] = new Threads(warehouse, Integer.parseInt(args[0]), x);
            threads[x].start();
        }
    }
}