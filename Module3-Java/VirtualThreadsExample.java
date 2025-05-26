public class VirtualThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            Thread.startVirtualThread(() -> {
                System.out.println("Hello from virtual thread!");
            });
        }

        // Wait some time for threads to finish (not best practice but for demo)
        Thread.sleep(5000);

        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + " ms");
    }
}