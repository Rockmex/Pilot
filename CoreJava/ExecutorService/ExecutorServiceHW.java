package CoreJava.ExecutorService;

import java.util.concurrent.*;

public class ExecutorServiceHW {
    static class A{
        public String getMethod() {
            return "A.getMethod";
        }
    }

    static class B{
        public String getMethod() {
            return "B.getMethod";
        }
    }

    public static void main(String[] args) {
        System.out.println(runSameTime());
    }

    public static String runSameTime() {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        String ret = null;
        try {
            Future<String> futureA = executor.submit(() -> new A().getMethod());
            Future<String> futureB = executor.submit(() -> new B().getMethod());
            boolean done = false;
            while (!done) {
                if (futureA.isDone() && futureB.isDone()) {
                    ret = futureB.get() + " " + futureA.get();
                    done = true;
                }
            }
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
        return ret;
    }
}
