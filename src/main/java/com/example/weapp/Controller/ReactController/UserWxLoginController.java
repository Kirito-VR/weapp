package com.example.weapp.Controller.ReactController;



import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.weapp.http.HttpResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.kevinsawicki.http.HttpRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ludh
 * @date 2022/8/4 17:03:57
 */
@RestController
@RequestMapping("/api")
public class UserWxLoginController {
    @GetMapping("/onLogin")
//    public HttpResult findopenid(@RequestParam(name = "code") String code) throws Exception {
        public String getWxOpenData(@RequestParam(name = "code") String code) throws Exception {
        System.out.println("code" + code);
        String appid="wx33a6b9729ccf9226";
        String AppSecret="1dc2957237fb7383c2c7b35e800513a3";
        String openId = null;
        Map<String, String> data = new HashMap<String, String>();
        data.put("appid", appid);
        data.put("secret", AppSecret);
        data.put("js_code", code);
        data.put("grant_type", "authorization_code");
        String response = HttpRequest.get("https://api.weixin.qq.com/sns/jscode2session").form(data).body();
        JSONObject obj= JSON.parseObject(response);//将json字符串转换为json对
        System.out.println("11111"+response);
//        return response.toString();
        return obj.toString();
    }


}