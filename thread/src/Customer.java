package thread.src;

import thread.src.ThreadClass;

/**
 * @author taowy
 * @time 2020/6/1 10:33
 */
public class Customer implements Runnable {
    private ThreadClass bank = new ThreadClass();
    @Override
    public void run() {
        for (int i = 0;i<3;i++) {
            bank.add(100);
        }
    }
}
