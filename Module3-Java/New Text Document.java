import java.util.concurrent.*;
import java.util.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        List<Callable<String>> tasks = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            final int id = i;
            tasks.add(() -> "Task " + id + " result");
        }

        List<Future<String>> results = executor.invokeAll(tasks);

        for (Future<String> future : results) {
            System.out.println(future.get());
        }

        executor.shutdown();
    }
}