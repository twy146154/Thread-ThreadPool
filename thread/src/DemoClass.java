import sun.applet.Main;

/**
 * @author taowy
 * @time 2020/6/1 10:13
 */
public class DemoClass {
    public static void main(String[] args) {
      Customer c = new Customer();
       Thread t1 = new Thread(c);
       Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}
