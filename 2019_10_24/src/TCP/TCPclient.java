package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @ProjectName 2019_10_24
 * @ClassName TCPclient
 * Description
 * @Auther YunSW
 * @Date 2019/10/24 12:05
 * @Version 1.0
 **/
public class TCPclient {
    public static void main(String[] args) {
        Socket soc= null;
        try {
            soc = new Socket("127.0.0.1",8888);
            OutputStream output=soc.getOutputStream();//网络字节输出流
            System.out.println("请输入:");
            Scanner in=new Scanner(System.in);
            String s=in.nextLine();
            output.write(s.getBytes());//给服务器发送数据
            InputStream input=soc.getInputStream();
            byte [] str=new byte[1024];
            int len=input.read(str);
            System.out.println(new java.lang.String(str,0,len));
            soc.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
