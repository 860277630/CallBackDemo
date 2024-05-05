package com.example.callbackdemo.controller;

import com.example.callbackdemo.service.AsyncService;
import com.example.callbackdemo.service.CallBackService;
import com.example.callbackdemo.service.impl.LiSiOpServiceImpl;
import com.example.callbackdemo.service.impl.ZhangSanOpServiceImpl;
import com.example.callbackdemo.utils.OpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @program: callback-demo
 * @description: 异步回调函数使用
 * @author: wjl
 * @create: 2024-05-04 23:20
 **/
@RestController
@RequestMapping("async")
@Slf4j
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    public static Random random = new Random();


    @RequestMapping("asyncMethod1")
    public String staticMethod1(){
        Integer param = random.nextInt(100);
        Integer calcul = calcul(param);
        Runnable runnable = ()->{
            asyncService.asyncCalcul(calcul,this);
        };
        Thread thread = new Thread(runnable);
        thread.start();
        return "sucess";
    }

    //  这个计算程序在异步中也会被调用
    public Integer calcul(Integer num){
        Integer result = random.nextInt(100);
        log.info("输入的参数为：{},计算结果为：{}",num,result);
        return result;
    }




}
