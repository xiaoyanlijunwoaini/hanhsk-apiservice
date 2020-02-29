package com.chnchat.hanhsk.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@SpringBootApplication
@EnableWebMvc
@EnableScheduling
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("启动成功！");

        // 生成token
        /*Encrypt encrypt = new Encrypt();
        String token = encrypt.getToken(true, "zhangchao", "张超");
        // 打印token
        System.out.println("token: " + token);
        // 解密token
        Decrypt decrypt = new Decrypt();
        DecodedJWT jwt = decrypt.deToken(token);
        System.out.println("issuer: " + jwt.getIssuer());
        System.out.println("isVip:  " + jwt.getClaim("isVip").asBoolean());
        System.out.println("username: " + jwt.getClaim("username").asString());
        System.out.println("name:     " + jwt.getClaim("name").asString());
        System.out.println("过期时间：      " + jwt.getExpiresAt());*/
    }
}
