package document;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws Exception {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("输入copy的文件或文件夹路径in：");
        String in = scanner.nextLine();
        System.out.println("输入copy的文件夹路径out：");
        String out = scanner.nextLine();*/
        cp("E:/wuyiyong/wu","E:/wuyiyong/yi");
        //cp(in,out);

    }
    public static void cp(String i, String o) throws Exception {
        File f1 = new File(i);
        File f2 = new File(o);
        //获取文件名
        String ii = i.substring(i.lastIndexOf("/")+1,i.length());

        if(f1.isDirectory()){//判断是否是文件
            String[] list = f1.list();

            //out的地方新建文件夹
            new File(o+"/"+ii).mkdir();
            for (String s:list) {
                //递归调用复制
                cp(i+"/"+s,o+"/"+ii);
            }
        }else {

            FileInputStream in = new FileInputStream(f1);
            FileOutputStream out = new FileOutputStream(o+"/"+ii);
            byte[] datas = new byte[1024];
            int x = in.read(datas);
            while(x != -1) {
                out.write(datas);
                x = in.read(datas);
                in.close();
                out.close();
            }
        }
    }
}
