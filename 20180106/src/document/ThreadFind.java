package document;

import java.io.*;

public class ThreadFind extends Thread{
    private File inputPath;
    private String string;
    private  static  int tmp=0;


    private ThreadFind(File inputPath,String string) {
        this.inputPath = inputPath;
        this.string = string;
    }

    @Override
    public void run() {
        try {
            find();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println("第"+i+++"个线程启动："+"查找"+inputPath);
    }

    private void find() throws Exception {
        //判断是否是文件
        if(inputPath.isDirectory()){
            String[] list = inputPath.list();
            for (String s:list) {
                //起新的线程调用复制
                new ThreadFind(new File(inputPath+"/"+s),string).start();
            }
        }else {
            //字符串查找
            docFind(inputPath);
        }
    }

    //普通文件查找
    private void docFind( File inputPath) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(inputPath));
        String str = in.readLine();
        while(str !=null) {
            if (str.indexOf(string)!=-1){
                System.out.println("找到"+string+"在文件中："+inputPath);
                tmp++;
            }
            str = in.readLine();
        }
        in.close();
    }

    //多线程文件夹的字符串查找
    public static void multithreadFind(String inputPath,String string){
        new ThreadFind(new File(inputPath),string).start();
//        if (tmp==0){
//            System.out.println("未找到字符串"+string);
//        }else{
//            System.out.println("共在"+tmp+"个文件中找到该字符串");
//        }
    }


    public static void main(String[] args) {
        multithreadFind("E:/wuyiyong/wu","123");
    }
}
