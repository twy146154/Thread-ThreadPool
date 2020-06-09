/**
 * @author taowy
 * @time 2020/6/8 19:52
 */
public class Wait {
    static Object lock = new Object();
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("#####################");
                    System.out.println("等待线程，进入等待状态");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("以唤醒等待ing");

                }
            }
        }, "等待线程").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("++++++++++++++++++");
                    System.out.println("唤醒等待状态");
                    lock.notify();
                }
            }
        }, "唤醒等待状态的锁").start();
    }
}
