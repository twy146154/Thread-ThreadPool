package com.taowy;

import thread.src.com.taowy.MyThread;

import java.util.concurrent.*;

/**
 * 测试类完成等待唤醒机制,有效的利用资源
 * 吃包子案例
 *
 * @author taowy
 * @time 2020/6/8 20:46
 */
public class Demo {
    public static void main(String[] args) {
        //final ExecutorService service = Executors.newFixedThreadPool(5); 这种创建线程池是阿里不推荐的
        //创建线程池
        final ExecutorService service = new ThreadPoolExecutor(5,
                5, 0L, TimeUnit.MILLISECONDS,new LinkedBlockingDeque<>());
        MyThread myThread = new MyThread();
        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程执行！！！");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("执行完毕，线程池的名字为------>"+Thread.currentThread().getName());
            }
        });
       /* //多线程创建后运行
        service.submit(myThread);
        System.out.println();*/
    }
}
