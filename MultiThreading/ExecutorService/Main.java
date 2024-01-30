
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(() -> {
            for(int i = 0;i<50;i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        });
        executorService.submit(() -> {
            for(int i = 0;i<50;i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        });

        executorService.shutdown();
    }
}
