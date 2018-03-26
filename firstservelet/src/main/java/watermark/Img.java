package watermark;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;

public class Img {
    public void addWaterMark(String srcImgPath, String tarImgPath, String waterMarkContent, Color markContentColor, Font font) {

        try {
            // 读取原图片信息
            File srcImgFile = new File(srcImgPath);//得到文件
            Image srcImg = ImageIO.read(srcImgFile);//文件转化为图片
            int srcImgWidth = srcImg.getWidth(null);//获取图片的宽
            int srcImgHeight = srcImg.getHeight(null);//获取图片的高
            // 加水印
            BufferedImage bufImg = new BufferedImage(srcImgWidth, srcImgHeight, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = bufImg.createGraphics();
            g.drawImage(srcImg, 0, 0, srcImgWidth, srcImgHeight, null);
            g.setColor(markContentColor); //根据图片的背景设置水印颜色
            g.setFont(font);              //设置字体

            //设置水印的坐标+
            int x = srcImgWidth - getWatermarkLength(waterMarkContent, g);
            int y = getWatermarkWidth(waterMarkContent, g);

            g.drawString(waterMarkContent, x, y);  //画出水印
            g.dispose();
            // 输出图片
            FileOutputStream outImgStream = new FileOutputStream(tarImgPath);
            ImageIO.write(bufImg, "jpg", outImgStream);
            System.out.println("添加水印完成");
            outImgStream.flush();
            outImgStream.close();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public int getWatermarkLength(String waterMarkContent, Graphics2D g) {
        return g.getFontMetrics(g.getFont()).charsWidth(waterMarkContent.toCharArray(), 0, waterMarkContent.length());
    }
    public int getWatermarkWidth(String waterMarkContent, Graphics2D g) {
        return g.getFontMetrics(g.getFont()).getHeight();
    }

    public static void main(String[] args) {
        Font font = new Font("微软雅黑", Font.PLAIN, 35);                     //水印字体
        String srcImgPath="C:/Users/wuyiyong/Desktop/1.jpg"; //源图片地址
        String tarImgPath="C:/Users/wuyiyong/Desktop/2.jpg"; //待存储的地址
        String waterMarkContent="图片来源：wuyiyong";  //水印内容
        Color color=new Color(255,255,255,128);                               //水印图片色彩以及透明度
        new Img().addWaterMark(srcImgPath, tarImgPath, waterMarkContent,color, font);

    }
}
