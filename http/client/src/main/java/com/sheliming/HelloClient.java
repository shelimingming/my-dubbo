package com.sheliming;

import com.alibaba.fastjson.JSONObject;
import com.sheliming.domain.User;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequestFactory;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HelloClient {
    private static final String URL = "http://localhost:8080/hello/";

    public static void main(String[] args) {

        User user = getUser(1);
        System.out.println(user);

    }

    public static User getUser(int id) {
        //1.使用默认的配置的httpclient
        CloseableHttpClient client = HttpClients.createDefault();
        //2.使用get方法
        HttpGet httpGet = new HttpGet(URL + id);
        CloseableHttpResponse response = null;

        try {
            //3.执行请求，获取响应
            response = client.execute(httpGet);
            System.out.println("返回状态码：" + response.getStatusLine().getStatusCode());

            //4.获取响应的实体内容,使用fastJson转成对象
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                String res = EntityUtils.toString(entity, "utf-8");
                User user = JSONObject.parseObject(res, User.class);
                return user;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
