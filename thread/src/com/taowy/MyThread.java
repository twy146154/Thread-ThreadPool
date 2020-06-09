package thread.src.com.taowy;

/**
 * @author taowy
 * @time 2020/6/8 21:29
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("我需要一个教练");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("教练来了"+ Thread.currentThread().getName());
        System.out.println("ok ");
    }
}
