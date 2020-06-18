package thread.src.com.Main;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 创建一个线程池，它可安排在给定延迟后运行命令或者定期地执行。
 *
 * @author taowy
 * @time 2020/6/17 17:09
 */
public class ScheduledThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(3);
        service.schedule(new Runnable() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                System.out.println("开始时间为"+ startTime);
                System.out.println("延迟2秒执行！");
            }
        } , 3 ,TimeUnit.SECONDS);
        long endTime = System.currentTimeMillis();
        System.out.println("结束时间为：" + (endTime ));
    }
}
