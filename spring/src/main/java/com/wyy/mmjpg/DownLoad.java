package com.wyy.mmjpg;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/14.
 */
public class DownLoad {

    public static void main(String[] args) throws Exception {
        DownLoad downLoad = new DownLoad();
        downLoad.catchMMJpg();
    }

    private void catchMMJpg() throws Exception {
        String oldUrl = "http://www.mmjpg.com/mm/";
        String selectAttr = "img[data-img$=.jpg]";
        String attr = "data-img";
        String referer = "http://img.mmjpg.com/small/2016/656_s.jpg";
        //存储位置
        String savePath = "e:\\\\java基础教程";
        int start = 1200;
        int end = start + 100;

        for (int i = start; i <= end; i++) {
            String newsavePath = savePath+File.separator+i;
            File file = new File(newsavePath);
            if (!file.exists()) {
                file.mkdirs();
            }
            String newUrl = oldUrl + i;
            getInformation(getImgUrlsFromMMJpg(newUrl, selectAttr, attr),newsavePath, referer);
        }
    }

    private List<String> getImgUrlsFromMMJpg(String url, String selectAttr, String attr) throws IOException {
        // HtmlUnit 模拟浏览器
        WebClient webClient = new WebClient(BrowserVersion.FIREFOX_52);
        // 启用JS解释器，默认为true
        webClient.getOptions().setJavaScriptEnabled(true);
        // 禁用css支持
        webClient.getOptions().setCssEnabled(false);
        // js运行错误时，是否抛出异常
        webClient.getOptions().setThrowExceptionOnScriptError(false);

        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
        // 设置连接超时时间
        webClient.getOptions().setTimeout(10 * 1000);
//        抓取界面
        HtmlPage page = webClient.getPage(url);
//       点击界面的“全部图片”按钮
        page = page.getElementById("opic").click();
        // 等待js后台执行2秒
        webClient.waitForBackgroundJavaScript(2 * 1000);

        String pageAsXml = page.asXml();
//        System.out.println(pageAsXml);

        // Jsoup解析处理
        Document doc = Jsoup.parse(pageAsXml);
        // 获取所有图片元素集
        Elements jpgs = doc.select(selectAttr);

        List<String> imgUrls = new ArrayList<>();
        // 此处省略其他操作
        for (Element e : jpgs) {
            imgUrls.add(e.attr(attr));
        }

        return imgUrls;
    }
    public void getInformation(List<String> urlStr, String savePath, String referer){

        int t = 0;
        for (String url : urlStr) {
                int k = okHttpConnectAndDownLoad(url, ++t+".jpg", savePath, referer);
            }
        System.out.println(savePath + "复制完成！");
        }

    public int okHttpConnectAndDownLoad(String urlStr, String fileName, String savePath, String referer) {
        InputStream inputStream=null;
        try {
            //连接并得到输入流
            inputStream = okHttpConnect(urlStr,referer).body().byteStream();
            //获取数据
            byte[] getData = readInputStream(inputStream);
            //输出文件
            outSaveFile(savePath,getData,fileName);
            System.out.println("info:" + urlStr + " download success!");
        } catch (Exception e) {
            System.out.println("这个妹子没有更多的图片了，自动切换到下一个妹子");
            return 0;
        } finally{
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("IOException");
                }
            }
        }
        return 1;
    }

    private Response okHttpConnect(String urlStr, String referer) {
        try {
            OkHttpClient okHttpClient = new OkHttpClient();
            Request request = new Request.Builder()
                    .url(urlStr)
                    .addHeader("Referer", referer)
                    .build();
            Response response = okHttpClient.newCall(request).execute();
            if (!response.isSuccessful()) {
                response.body().close();
                throw new Exception();
            }
            return response;
        }catch (Exception e){
            return null;
        }
    }

    private void outSaveFile(String savePath,byte[] getData,String fileName) {
        FileOutputStream fileOutPut =null;
        try {
            //文件保存位置
            File saveDir = new File(savePath);
            //保存路径不存在则创建
            if (!saveDir.exists()) {
                saveDir.mkdir();
            }
            File file = new File(saveDir + File.separator + fileName);
            fileOutPut = new FileOutputStream(file);
            fileOutPut.write(getData);
        }catch(Exception e) {
            System.out.println("文件输出异常");
        }finally {
            if (fileOutPut != null) {
                try {
                    fileOutPut.close();
                } catch (IOException e1) {
                    System.out.println("write IOException");
                }
            }
        }
    }

    private  byte[] readInputStream(InputStream inputStream) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024*5];
        int len ;
        while((len = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        bos.flush();
        bos.close();
        return bos.toByteArray();
    }






}