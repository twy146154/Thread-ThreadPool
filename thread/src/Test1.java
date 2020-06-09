/**
 * @author taowy
 * @time 2020/6/8 16:21
 */
public class Test1 implements Runnable {
    private int num = 100;

    @Override
    public void run() {
        while (true) {
            method();
        }
    }
    public synchronized void method(){
        if (num > 0) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String name = Thread.currentThread().getName();
            System.out.println(name + "出售" + num--);
        }
    }
}
