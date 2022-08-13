package com.example.weapp.Controller.ReactController;



import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.weapp.bean.User;
import com.example.weapp.http.HttpResult;
import com.example.weapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.github.kevinsawicki.http.HttpRequest;
import java.util.HashMap;
import java.util.List;
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
        String appid = "wx33a6b9729ccf9226";
        String AppSecret = "1dc2957237fb7383c2c7b35e800513a3";
        String openId = null;
        Map<String, String> data = new HashMap<String, String>();
        data.put("appid", appid);
        data.put("secret", AppSecret);
        data.put("js_code", code);
        data.put("grant_type", "authorization_code");
        String response = HttpRequest.get("https://api.weixin.qq.com/sns/jscode2session").form(data).body();
        JSONObject obj = JSON.parseObject(response);//将json字符串转换为json对
        System.out.println("11111" + response);
//        return response.toString();
        return obj.toString();
    }

    //数据库里查找用户
    @Autowired
    private UserService userService;

    @GetMapping("/findUser")
    public HttpResult findUserByOpenid(@RequestParam(name = "openid") String openid) throws Exception {
        System.out.println("openid" + openid);
        List<User> userList = null;
        userList = userService.findUserByOpenid(openid);
        System.out.println("数据库查找到的数据：" + userList);
        System.out.println("2222" + userList);
        if (userList.size() != 0) {
            return HttpResult.ok(userList);
        } else {
            return HttpResult.ok(1);
        }
//        System.out.println("2222"+obj);
//        return userList.toString();
//        return obj.toString();
    }

//    注册用户
    @PostMapping("/registerUser")
    public String registerUser(@RequestBody User user)throws Exception{
        System.out.println("data：" + user);
        try{
            boolean registerUserrs= userService.registerUser(user);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "注册成功";
    }
}