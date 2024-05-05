package com.example.callbackdemo.utils;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: callback-demo
 * @description: 操作展示
 * @author: wjl
 * @create: 2024-05-04 23:23
 **/
@Slf4j
public class OpUtil2 {


    public static void main(String[] args) {
        String str = "sssss";
        ZhangSanOpServiceImpl zhangSanOpService = new ZhangSanOpServiceImpl();

        opSome(str,zhangSanOpService);
    }


    public static String opSome(String param1, ZhangSanOpServiceImpl selfOp){
        log.info("工具类操作1,参数为：{}",param1);
        selfOp.op1();
        log.info("工具类操作2");
        selfOp.op2(param1);
        log.info("工具类操作3");
        selfOp.op3();
        return "sucess";
    }


}

@Slf4j
class ZhangSanOpServiceImpl{

    public void op1() {
        log.info("张三的操作1");
    }

    public String op2(String param) {
        String str = "张三return1";
        log.info("张三的操作2，参数为 {},返回值为：{}",param,str);
        return str;
    }

    public String op3() {
        String str = "张三return2";
        log.info("张三的操作3，,返回值为：{}",str);
        return str;
    }
}
