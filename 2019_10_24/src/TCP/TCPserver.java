package TCP;


import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ProjectName 2019_10_24
 * @ClassName TCPserver
 * Description
 * @Auther YunSW
 * @Date 2019/10/24 11:13
 * @Version 1.0
 **/
public class TCPserver {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8888);
        Socket soc=server.accept();//获取请求的客户端对象Socket
        OutputStream os=soc.getOutputStream();
        os.write("连接成功".getBytes());
        boolean isflag=true;
        while(isflag){
            java.io.InputStream input=soc.getInputStream();//使用网络字节输入流InputStream对象中的方法read，读取客户端发来的数据
            byte [] str=new byte[1024];
            int len=input.read(str);//网络字节输入流InputStream对象的方法read，读取客户端发送的数据
            System.out.println(new String(str,0,len));
            os.write("OK!".getBytes());
            soc.close();
        }
        server.close();
    }
}
