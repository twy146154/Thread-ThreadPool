package thread.src.com.Main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建一个指定工作线程数量的线程池。每当提交一个任务就创建一个工作线程，
 * 如果工作线程数量达到线程池初始的最大数，则将提交的任务存入到池队列中。
 *
 * @author taowy
 * @time 2020/6/17 17:00
 */
public class FixThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("第" + index + "个线程" +
                            "线程的名字" + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

        }

    }


}
