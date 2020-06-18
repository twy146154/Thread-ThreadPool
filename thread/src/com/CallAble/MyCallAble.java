package thread.src.com.CallAble;

import java.util.concurrent.Callable;

/**
 * callable 具有返回值的多线程
 *
 * @author taowy
 * @time 2020/6/18 11:00
 */
public class MyCallAble implements Callable<String> {

    @Override
    public String call() throws Exception {
        synchronized (MyCallAble.class) {
            System.out.println("------------>");
            System.out.println("---------------====>");
            return "哈哈哈哈";
        }
    }

}
