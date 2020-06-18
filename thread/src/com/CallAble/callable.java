package thread.src.com.CallAble;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**callable 有返回值的多线程
 * @author taowy
 * @time 2020/6/18 10:59
 */
public class callable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
      /*  MyCallAble myCallAble = new MyCallAble();
        FutureTask<String> task = new FutureTask<>(myCallAble);
        Thread thread1 = new Thread(task);
        thread1.start();
        try {
            System.out.println(task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }*/
        ExecutorService service = Executors.newFixedThreadPool(5);
        List<Future> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            MyCallAble myCallAble = new MyCallAble();
            Future<String> future = service.submit(myCallAble);
            list.add(future);
        }
        for (Future entry : list) {
            System.out.println("结果为----->"+entry.get().toString());
        }
    }

}
