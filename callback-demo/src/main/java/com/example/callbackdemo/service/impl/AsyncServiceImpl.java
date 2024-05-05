package com.example.callbackdemo.service.impl;

import com.example.callbackdemo.controller.AsyncController;
import com.example.callbackdemo.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @program: callback-demo
 * @description:
 * @author: wjl
 * @create: 2024-05-05 16:57
 **/
@Service
@Slf4j
public class AsyncServiceImpl implements AsyncService {
    public static Random random = new Random();

    @Override
    public void asyncCalcul(Integer num, AsyncController asyncController) {
        int i = random.nextInt(100);
        log.info("异步传入参数：{}，计算结果为：{}",num,i);
        asyncController.calcul(i);
    }
}
