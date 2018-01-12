package wuyiyong;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //创建扫描器
        System.out.println("请输入一个整数：");
        long num = scanner.nextLong();             //获取输入的值
        System.out.println("输入的数字为："+num);
        System.out.println("该数字乘以2的结果为："+(num<<1));
        System.out.println("该数字乘以4的结果为："+(num<<2));
        System.out.println("该数字乘以8的结果为："+(num<<3));
        System.out.println("该数字乘以1的结果为："+(num<<4));
    }
}
