package thread.src;

/**
 * @author taowy
 * @time 2020/6/8 16:21
 */
public class Main1 {
    public static void main(String[] args) {
        Test1 test = new Test1();
        Thread thread1 = new Thread(test,"线程1");
        Thread thread2 = new Thread(test,"线程2");
        Thread thread3 = new Thread(test,"线程3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
