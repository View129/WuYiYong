package packagingmode;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

//这是增强类，必须包括两个字符流和字节流
public class Myresponse extends HttpServletResponseWrapper {
    private PrintWriter pw;
    ByteArrayOutputStream bout;

    public Myresponse(HttpServletResponse response) {
        super(response);
    }

    //字符流，字节写一个类，自己写write函数，写到bout中
    public ServletOutputStream getOutputStream() throws IOException {
        bout=new ByteArrayOutputStream();//每次都需要新的容器。
        return new Myout(bout);
    }


    //字符流的处理，字符流和字节不同，字符流可以实现IO直接的套接，不能单独写
    public PrintWriter getWriter() throws IOException {
        bout=new ByteArrayOutputStream();//每次都需要新的容器。
        pw= new PrintWriter(new OutputStreamWriter(bout, "utf-8"), true);
        //直接通过流套接写到内存流，比字节流简单
        return pw ;
    }

    //最后还是需要将这个容器返回出去
    public ByteArrayOutputStream getBout() {
        if(pw!=null){
            pw.close();//字符流必须刷新，否则得不到数据
        }
        return bout;
    }
}
