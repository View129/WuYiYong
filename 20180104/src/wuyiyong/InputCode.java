package wuyiyong;

import java.util.Scanner;

public class InputCode {
    public static void main(String[] args) {
        System.out.println("请输入你的身份证号：");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        //打印输出信息
        System.out.println("你的身份证号位数为："+line.length());
    }
}
