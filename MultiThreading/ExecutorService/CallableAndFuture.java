import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture {
    public static void main(String[] args) {
        
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        
        Callable<Integer> myCallable = () -> {

            int sum = 0;
            
            for(int i = 0;i<=5;i++){
                sum+=i;
            }

            return sum;
        };

        Future<Integer> future = executorService.submit(myCallable);

        System.out.println("Doing other work !");
        
        // Integer result = 0;
        try{
             Integer result = future.get();
             System.out.println("Result from Callable : " + result);
        }catch(InterruptedException | ExecutionException e) {

             e.printStackTrace();
        }finally {
            executorService.shutdown();
        }
        

        

        executorService.shutdown();
    }
}
