import java.util.concurrent.*;
import java.util.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Callable<String>> tasks = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int finalI = i;
            tasks.add(() -> "Result from task " + finalI);
        }

        List<Future<String>> results = service.invokeAll(tasks);
        for (Future<String> future : results) {
            System.out.println(future.get());
        }

        service.shutdown();
    }
}
