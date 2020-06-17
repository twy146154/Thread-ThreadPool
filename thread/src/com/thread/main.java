package thread.src.com.thread;

import java.io.BufferedReader;
import java.net.HttpURLConnection;

/**
 * @author taowy
 * @time 2020/6/16 14:53
 */
public class main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        Thread thread1 = new Thread(thread, Thread.currentThread().getName());
        Thread thread2 = new Thread(thread, Thread.currentThread().getName());
        Thread thread3 = new Thread(thread, Thread.currentThread().getName());
        Thread thread4 = new Thread(thread, Thread.currentThread().getName());
        Thread thread5 = new Thread(thread, Thread.currentThread().getName());
        Thread thread6 = new Thread(thread, Thread.currentThread().getName());
        Thread thread7 = new Thread(thread, Thread.currentThread().getName());
        Thread thread8 = new Thread(thread, Thread.currentThread().getName());
        Thread thread9 = new Thread(thread, Thread.currentThread().getName());
        Thread thread10 = new Thread(thread, Thread.currentThread().getName());
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();

    }
}
