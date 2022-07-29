package com.example.weapp.Controller;

import com.example.weapp.bean.Good;
import com.example.weapp.http.HttpResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: Cqmax
 * @Date: 2022/7/28 13:59
 * @Version 1.0
 */
@RequestMapping("good")
public class GoodController {
    @GetMapping("/getGoodList")
    public HttpResult getGoodList(){
        List<Good> goodList = null;

        // 在此处插入代码，实现获得good列表并赋值给goodList;

        return HttpResult.ok(goodList);
    }
}
