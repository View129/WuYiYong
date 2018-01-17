package com.sms.wyy;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpUtil {
    //发送http获取返回的json
    public static String httpGet(String url) throws Exception {
        OkHttpClient mOkHttpClient = new OkHttpClient();
        final Request request = new Request.Builder().url(url).build();
        Response response = mOkHttpClient.newCall(request).execute();
        return  response.body().string();
    }
}
