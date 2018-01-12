package wuyiyong;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //创建扫描器
        System.out.println("请输入一个年份：");
        try {
            int year = scanner.nextInt();
            if(year%4==0&&year%100!=0||year%400==0){ //判断闰年
                System.out.println(year+"是闰年");
            }else{
                System.out.println(year+"不是闰年");
            }
        } catch (Exception e) {
            System.out.println("你输入的不是有效年份！");
        }

    }
}
