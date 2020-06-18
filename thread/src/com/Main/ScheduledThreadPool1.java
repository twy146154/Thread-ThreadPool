package thread.src.com.Main;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**定期执行，延迟一秒后每三秒执行一次
 * @author taowy
 * @time 2020/6/17 17:27
 */
public class ScheduledThreadPool1 {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(3);
        service.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟一秒后，每三秒执行一次");
            }
        },1,3, TimeUnit.SECONDS);
    }
}
