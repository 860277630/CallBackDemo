package com.example.callbackdemo.service.impl;

import com.example.callbackdemo.service.CallBackService;
import com.example.callbackdemo.service.SelfOpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @program: callback-demo
 * @description:
 * @author: wjl
 * @create: 2024-05-05 00:18
 **/
@Service
@Slf4j
public class CallBackServiceImpl implements CallBackService {
    @Override
    public String op(String param, SelfOpService selfOp) {
        log.info("注入类操作1,参数为：{}",param);
        selfOp.op1();
        log.info("注入类操作2");
        selfOp.op2(param);
        log.info("注入类操作3");
        selfOp.op3();
        return "sucess";
    }
}
