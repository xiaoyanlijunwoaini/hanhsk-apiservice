package com.chnchat.hanhsk.service.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.chnchat.hanhsk.service.common.JwtUtil;
import com.chnchat.hanhsk.service.common.LoginParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/",produces = "text/plain;charset=UTF-8")
public class IndexController {
    @RequestMapping(value = "/")
    public String getCommodityDO() {

        /*List<GoodsDO> lists=new ArrayList<>();
        GoodsDO goodsDO=new GoodsDO();
        goodsDO.setTitle("z 5555555");
        goodsDO.setId(1212L);
        goodsDO.setPrice(23L);
        goodsDO.setImgUrl("/images/main.jpg");
        goodsDO.setSalesVolume(12);
        lists.add(goodsDO);


        GoodsDO goodsDO1=new GoodsDO();
        goodsDO1.setTitle("88888888888888888888");
        goodsDO1.setId(12122L);
        goodsDO1.setPrice(223L);
        goodsDO1.setImgUrl("/images/main.jpg");
        goodsDO1.setSalesVolume(23);
        lists.add(goodsDO1);
        return JSON.toJSONString(lists);*/
        return "dfdfdf";
    }

    //登录
    @PostMapping("/login")
    public String login(@RequestBody LoginParam loginParam){
        //jwt加密解密: https://www.jianshu.com/p/e88d3f8151db
        //小程序调用jwt  https://ninghao.net/blog/5530

        JSONObject jsonObject=new JSONObject();
        //String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJVc2VySWQiOjEyMywiVXNlck5h.bWUiOiJhZG1pbiJ9.Qjw1epD5P6p4Yy2yju3-fkq28PddznqRj3ESfALQyU";
        String token= JwtUtil.getToken("1",loginParam.getUsername(),loginParam.getUsername(),"admin");
        jsonObject.put("code", 0);
        jsonObject.put("msg", "");
        JSONObject jsonObjectToken=new JSONObject();
        jsonObjectToken.put("token",token);
        jsonObject.put("data", jsonObjectToken.toJSONString());
        return jsonObject.toJSONString();
    }
}
