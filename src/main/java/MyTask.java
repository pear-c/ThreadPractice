import java.util.Random;
import java.util.concurrent.Callable;

public class MyTask implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int n = (int) (Math.random() * 100) + 1;
        return n;
    }

}
