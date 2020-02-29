package com.ruibo.taogou.service.controller;

import com.alibaba.fastjson.JSON;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/taogou/main",produces = "text/plain;charset=UTF-8")
public class mainController {

    //@Autowired
    //UserDOMapper userDOMapper;
    //UserService userService;


    @RequestMapping(value = "/getCommodityDO")
    public String getCommodityDO() {

        /*List<GoodsDO> lists=new ArrayList<>();
        GoodsDO goodsDO=new GoodsDO();
        goodsDO.setTitle("z bd我爱你sgjxtadydbydstdsgjc");
        goodsDO.setId(1212L);
        goodsDO.setPrice(23L);
        goodsDO.setImgUrl("/images/main.jpg");
        goodsDO.setSalesVolume(12);
        lists.add(goodsDO);


        GoodsDO goodsDO1=new GoodsDO();
        goodsDO1.setTitle("dfdfdfdfdfddfdfdfdfdfdfdf");
        goodsDO1.setId(12122L);
        goodsDO1.setPrice(223L);
        goodsDO1.setImgUrl("/images/main.jpg");
        goodsDO1.setSalesVolume(23);
        lists.add(goodsDO1);
        return JSON.toJSONString(lists);*/
        return "ddggg";
    }
}
