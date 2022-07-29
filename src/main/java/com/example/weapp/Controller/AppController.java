package com.example.weapp.Controller;

import com.example.weapp.bean.AppInfo;
import com.example.weapp.http.HttpResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Cqmax
 * @Date: 2022/7/29 11:25
 * @Version 1.0
 */
@RestController
@RequestMapping("App")
public class AppController {
    @GetMapping("GetInfo")
    public HttpResult getInfo(){
        AppInfo info = new AppInfo();
        // 在这里实现
        return HttpResult.ok(info);
    }
}
