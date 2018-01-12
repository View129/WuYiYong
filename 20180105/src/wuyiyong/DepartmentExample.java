package wuyiyong;

import java.util.Scanner;

public class DepartmentExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //创建扫描器
        System.out.println("请输入新员工姓名：");
        String name = scanner.nextLine();           //获取输入的员工姓名
        System.out.println("请输入新员工应聘的编程语言：");
        String language = scanner.nextLine();       //获取输入的员工编程语言
        //根据编程语言分配部门
        switch (language.hashCode()) {
            case 3254818:           //java的哈希码
            case 2301506:           //Java的哈希码
            case 2269730:           //JAVA的哈希码
                System.out.println("员工"+name+"被分配到Java程序开发部门。");
                break;
            case 3104:              //c#的哈希码
            case 2112:              //C#的哈希码
                System.out.println("员工"+name+"被分配到C#程序开发部门。");
                break;
            case -709190099:        //asp.net的哈希码
            case 955463181:         //Asp.net的哈希码
            case 9745901:           //ASP.NET的哈希码
                System.out.println("员工"+name+"被分配到Asp.net程序开发部门。");
                break;
            default:
                System.out.println("本公司不需要"+language+"语言的程序开发人员!");

        }
    }
}
