package com.example.callbackdemo.utils;

import com.example.callbackdemo.service.SelfOpService;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: callback-demo
 * @description: 操作展示
 * @author: wjl
 * @create: 2024-05-04 23:23
 **/
@Slf4j
public class OpUtil {

    public static String opSome(String param1,SelfOpService selfOp){
        log.info("工具类操作1,参数为：{}",param1);
        selfOp.op1();
        log.info("工具类操作2");
        selfOp.op2(param1);
        log.info("工具类操作3");
        selfOp.op3();
        return "sucess";
    }

}
