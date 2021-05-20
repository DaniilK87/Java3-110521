package lesson4;


import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(4);
        Future<String> future = service.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("F");
                return "B";
            }
        });
        System.out.println("call:" + " " + future.get());
        service.shutdown();
    }
}
