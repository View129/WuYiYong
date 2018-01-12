package com.sms.wyy;

import com.alibaba.fastjson.JSON;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Date;

public class Getcontent {
    public static String getcontent() throws IOException {
        String content;
        while (true) {
            //10位时间戳和 page
            String time = String.valueOf(new Date().getTime());
            time = time.substring(0, 10);
            int page = (int) (Math.random() * 40000);
            String url = "http://api.avatardata.cn/Joke/QueryJokeByTime?key=9e76e8444cf04de8b85f1d3841b46cc0&page=" + page + "&rows=1&sort=desc&time=" + time;
            //发http
            OkHttpClient mOkHttpClient = new OkHttpClient();
            final Request request = new Request.Builder().url(url).build();
            Response response = mOkHttpClient.newCall(request).execute();
            //解析json
            QueryResultInfo queryResultInfo = JSON.parseObject(response.body().string(), QueryResultInfo.class);
            content = queryResultInfo.result.get(0).content;
            if (content.length() < 140) {
                System.out.println(content);
                break;
            }
        }
        return content;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(Getcontent.getcontent());
    }
}
