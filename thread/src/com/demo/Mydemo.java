package thread.src.com.demo;

/**
 * @author taowy
 * @time 2020/6/11 16:35
 */
public class Mydemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread,"线程1");
        Thread thread2 = new Thread(myThread,"线程2");
        Thread thread3 = new Thread(myThread,"线程3");
        Thread thread4 = new Thread(myThread,"线程4");
        Thread thread5 = new Thread(myThread,"线程5");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
