package wuyiyong;

import java.util.Scanner;

public class PriductPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //创建扫描器
        System.out.println("请输入金额：");
        long money = scanner.nextLong();           //获取输入的金额
        String rebate = "";
        if(money>200){
            int grade =(int)money/200;
            switch (grade){
                case 1:
                    rebate = "九五折";
                    break;
                case 2:
                    rebate = "九折";
                    break;
                case 3:
                    rebate = "八五折";
                    break;
                case 4:
                    rebate = "八折";
                    break;
                case 5:
                    rebate = "七五折";
                    break;
                case 6:
                    rebate = "七折";
                    break;
                case 7:
                    rebate = "六五折";
                    break;
                case 8:
                    rebate = "六折";
                    break;
                case 9:
                    rebate = "五折";
                    break;
                case 10:
                    rebate = "四五折";
                    break;
                default:
                    rebate = "一折";
            }
        }
        System.out.println("您累计消费金额为："+money);
        System.out.println("您将享受"+rebate+"优惠");
    }
}
