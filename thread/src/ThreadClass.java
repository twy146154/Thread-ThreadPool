package thread.src;

/**
 * @author taowy
 * @time 2020/6/1 10:13
 */
public class ThreadClass {
   private int sum;
   //Object object = new Object();
   public void add(int num) {
       synchronized (this) {
           sum = sum + num;
           try {
               Thread.sleep(100);
           } catch (InterruptedException e) { e.printStackTrace(); }
           System.out.println("sum = " + sum);
       }
   }

}
