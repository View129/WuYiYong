package wuyiyong;

import java.util.Scanner;

public class VariableExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //创建扫描器
        System.out.println("请输入变量A：");
        long A = scanner.nextLong();             //获取输入的值
        System.out.println("请输入变量B：");
        long B = scanner.nextLong();             //获取输入的值
        System.out.println("A="+A+"  "+"B="+B);
        System.out.println("变量互换后为：");
        A=A^B;
        B=A^B;
        A=A^B;
        System.out.println("A="+A+"  "+"B="+B);
    }
}

