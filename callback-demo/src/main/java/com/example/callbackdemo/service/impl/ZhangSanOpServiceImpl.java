package com.example.callbackdemo.service.impl;

import com.example.callbackdemo.service.SelfOpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @program: callback-demo
 * @description:
 * @author: wjl
 * @create: 2024-05-04 23:05
 **/
@Service
@Slf4j
public class ZhangSanOpServiceImpl implements SelfOpService {
    @Override
    public void op1() {
        log.info("张三的操作1");
    }

    @Override
    public String op2(String param) {
        String str = "张三return1";
        log.info("张三的操作2，参数为 {},返回值为：{}",param,str);
        return str;
    }

    @Override
    public String op3() {
        String str = "张三return2";
        log.info("张三的操作3，,返回值为：{}",str);
        return str;
    }
}
