package fileter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import packagingmode.Myresponse;

public class MyFileter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }


    //压缩
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        ((HttpServletRequest)request).setAttribute("key","123");


        HttpServletResponse resp=(HttpServletResponse) response;
        Myresponse myresp =new Myresponse(resp);//采用增强类传过去，直接写在里面

        chain.doFilter(request, myresp);

        //在返回的时候进行压缩就可以了

        //首先获得源数据
        ByteArrayOutputStream bout=myresp.getBout();
        //转成字节数据----zip写需要

        byte[] src=bout.toByteArray();
        System.out.println("压缩前"+src.length);//统计数量
        ByteArrayOutputStream baout =new ByteArrayOutputStream();
        GZIPOutputStream zip =new GZIPOutputStream(baout);
        //源数据压缩之后写到内存流中baout中
        zip.write(src);
        //关闭流
        zip.close();

        //设置http协议
        myresp.setHeader("Content-Encoding", "gzip");
        myresp.setContentLength(src.length);


        byte[] desc=baout.toByteArray();
        System.out.println("压缩之后"+desc.length);
        OutputStream out =resp.getOutputStream();//字符流压缩之后必须以字符流去写
        out.write(desc);
    }

    @Override
    public void destroy() {

    }
}
