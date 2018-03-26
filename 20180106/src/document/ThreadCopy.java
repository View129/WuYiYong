package document;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ThreadCopy extends Thread{
    private File inputPath;
    private File outputPath;
    private static int i=1;

    private ThreadCopy(File inputPath, File outputPath) {
        this.inputPath = inputPath;
        this.outputPath = outputPath;
    }

    @Override
    public void run() {
        try {
            copy();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("第"+i+++"个线程启动："+"复制"+inputPath);
    }

    private void copy() throws Exception {
        //获取文件名
        String ii = inputPath.getName();

        //判断是否是文件
        if(inputPath.isDirectory()){
            String[] list = inputPath.list();

            //out的地方新建文件夹
            new File(outputPath+"/"+ii).mkdir();
            for (String s:list) {
                //起新的线程调用复制
                new ThreadCopy(new File(inputPath+"/"+s),new File(outputPath+"/"+ii)).start();
            }
        }else {
            //文件复制
            docCopy(ii, inputPath, outputPath);
        }
    }

    //普通文件复制
    private void docCopy(String ii, File inputPath, File outputPath) throws IOException {
        FileInputStream in = new FileInputStream(inputPath);
        FileOutputStream out = new FileOutputStream(outputPath +"/"+ii);
        byte[] data = new byte[1024];
        int x = in.read(data);
        while(x !=-1) {
            out.write(data);
            x = in.read(data);
        }
        out.close();
        in.close();
    }

    //多线程文件夹的复制
    public static void multithreadReplication(String inputPath,String outputPath){
        new ThreadCopy(new File(inputPath),new File(outputPath)).start();
    }


    public static void main(String[] args) {
        multithreadReplication("E:/wuyiyong/wu","E:/wuyiyong/yi");
    }
}
