package com.example.callbackdemo.service.impl;

import com.example.callbackdemo.service.SelfOpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @program: callback-demo
 * @description:
 * @author: wjl
 * @create: 2024-05-04 23:07
 **/
@Service
@Slf4j
public class LiSiOpServiceImpl implements SelfOpService {
    @Override
    public void op1() {
        log.info("李四的操作1");
    }

    @Override
    public String op2(String param) {
        String str = "李四return1";
        log.info("李四的操作2，参数为 {},返回值为：{}",param,str);
        return str;
    }

    @Override
    public String op3() {
        String str = "李四return2";
        log.info("李四的操作3，,返回值为：{}",str);
        return str;
    }
}
