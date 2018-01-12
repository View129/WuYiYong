package wuyiyong;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个英文字符串或解密字符串");
        String pd = scanner.nextLine();
        char[] array = pd.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = (char)(array[i]^2000);
        }
        System.out.println("加密或解密结果如下：");
        System.out.println(array);
    }
}
