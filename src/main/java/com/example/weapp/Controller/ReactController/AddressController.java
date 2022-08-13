package com.example.weapp.Controller.ReactController;

import com.example.weapp.bean.Address;
import com.example.weapp.http.HttpResult;
import com.example.weapp.service.AddressService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/action/add")
    public HttpResult newAddress(@RequestBody Address address){
//        System.out.println("----:"+address);
        boolean addResult=false;
        addResult=addressService.addAddress(address);
        System.out.println(addResult);
        return HttpResult.ok(addResult);
    }
    @PostMapping("/action/update")
    public HttpResult addressUpdate(@RequestBody Address address){
        boolean updateResult=false;
        updateResult=addressService.updateAddress(address);
        return HttpResult.ok(updateResult);
    }
    @PostMapping("/action/delete")
    public HttpResult addressDelete(@RequestBody Address address){
        boolean deleteResult=false;
        //逻辑删除
        address.setDeleted("1");
        deleteResult=addressService.updateAddress(address);
        return HttpResult.ok(deleteResult);
    }


}
