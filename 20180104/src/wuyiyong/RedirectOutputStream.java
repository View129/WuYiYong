package wuyiyong;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RedirectOutputStream {
    public static void main(String[] args) {
        try {
            PrintStream out = System.out;
            System.setOut(new PrintStream("./log.txt"));
            int age = 20;
            String sex = "女";
            System.out.println("年龄的初始值为："+age);
            System.out.println("初始性别为："+age);
            //整合两个变量
            String info = "这是个"+sex+"孩子，应该有"+age+"岁了";
            System.out.println(info);
            System.setOut(out);
            System.out.println("程序运行完毕，请查看日志文件");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
