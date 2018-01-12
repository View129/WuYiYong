package wuyiyong;


import java.util.Scanner;

public class ParityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        long num = scanner.nextLong();
        String check = (num%2==0)?"这个数是偶数":"这个数是奇数";
        System.out.println(check);
    }
}
