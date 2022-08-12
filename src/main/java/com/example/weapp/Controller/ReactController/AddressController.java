package com.example.weapp.Controller.ReactController;

import com.example.weapp.bean.Address;
import com.example.weapp.http.HttpResult;
import com.example.weapp.service.AddressService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by xm on 2022/8/10 10:34
 * title:
 */
@RestController
@RequestMapping("address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping("/getById")
    public HttpResult getAddressById(@RequestParam String id){
        System.out.println(id);
        List<Address> addressList=null;
        addressList=addressService.getAddressById(id);
        System.out.println(addressList);
        return HttpResult.ok(addressList);
    }
}
