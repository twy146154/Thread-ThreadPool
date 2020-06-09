/**
 * @author taowy
 * @time 2020/6/8 15:29
 */
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Test());
        thread.start();
       //通过匿名内部类创建线程
        new Runnable(){
            @Override
            public void run() {
                System.out.println("hhhh");
            }
        };
       /*相当于Thread thread = new Thread(mythread)
        thread.start()*/
        new Thread( new Runnable(){
            @Override
            public void run() {
                System.out.println("hhhh");
            }
        }).start();

    }
}
