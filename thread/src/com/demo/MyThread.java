package thread.src.com.demo;

/**
 * @author taowy
 * @time 2020/6/11 16:49
 */
public class MyThread implements Runnable {
    private static Object lock = new Object();

    @Override
    public void run() {
        int num = 100;
        while (true) {
            synchronized (lock) {
                if (num > 0) {
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("现在休息好了");
                    System.out.println("现在执行的线程是---->" + Thread.currentThread().getName() +
                            "现在剩余量是：" + num--);
                    System.out.println(Thread.currentThread().getName() + "先等待一下");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

                System.out.println("要被唤醒了！");
                lock.notify();
                System.out.println(Thread.currentThread().getName() + "已被唤醒");
            }
        }

    }
}
