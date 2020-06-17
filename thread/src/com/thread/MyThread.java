package thread.src.com.thread;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**给百度发送http请求
 * @author taowy
 * @time 2020/6/16 15:46
 */
public class MyThread implements Runnable {

    @Override
    public void run() {
        HttpURLConnection con = null;
        BufferedReader buffer = null;
        StringBuffer resultBuffer = null;
        try {
            URL url = new URL("http://www.baidu.com");
            //得到连接对象
            con = (HttpURLConnection) url.openConnection();
            //设置请求类型
            con.setRequestMethod("POST");
            //设置请求需要返回的数据类型和字符集类型
            con.setRequestProperty("Content-Type", "application/json;charset=GBK");
            //允许写出
            con.setDoOutput(true);
            //允许读入
            con.setDoInput(true);
            //不使用缓存
            con.setUseCaches(false);
            //得到响应码
            int responseCode = con.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                //得到响应流
                InputStream inputStream = con.getInputStream();
                //将响应流转换成字符串
                resultBuffer = new StringBuffer();
                String line;
                buffer = new BufferedReader(new InputStreamReader(inputStream, "GBK"));
                while ((line = buffer.readLine()) != null) {
                    resultBuffer.append(line);
                }
                System.out.println("返回结果：-----》" + resultBuffer.toString() + "线程的名字：-------->"
                        + Thread.currentThread().getName());
            }
        } catch (Exception e) {

        }
    }
}
