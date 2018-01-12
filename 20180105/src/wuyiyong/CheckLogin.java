package wuyiyong;

import java.util.Scanner;

public class CheckLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //创建扫描器
        System.out.println("请输入登陆名：");
        String name = scanner.nextLine();           //获取输入的用户名
        System.out.println("请输入密码：");
        String password = scanner.nextLine();       //获取输入的密码
        if(!name.equals("wuyiyong")){               //判断用户名
            System.out.println("用户名错误!");
        }else if(!password.equals("123456")){       //判断密码
            System.out.println("密码错误");
        }else{
            System.out.println("登陆成功");
        }
    }
}
