package com.example.callbackdemo.controller;

import com.example.callbackdemo.service.impl.LiSiOpServiceImpl;
import com.example.callbackdemo.service.impl.ZhangSanOpServiceImpl;
import com.example.callbackdemo.utils.OpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: callback-demo
 * @description: 静态方法回调函数演示
 * @author: wjl
 * @create: 2024-05-04 23:45
 **/
@RestController
@RequestMapping("static")
public class StaticController {
    @Autowired
    private ZhangSanOpServiceImpl zhangSanOpService;

    @Autowired
    private LiSiOpServiceImpl liSiOpService;

    @RequestMapping("staticMethod1")
    public String staticMethod1(){
        OpUtil.opSome("staticMethod1",this.zhangSanOpService);
        return "sucess";
    }

    @RequestMapping("staticMethod2")
    public String staticMethod2(){
        ZhangSanOpServiceImpl zhangSanOpService = new ZhangSanOpServiceImpl();
        OpUtil.opSome("staticMethod2", zhangSanOpService);
        return "sucess";
    }
    @RequestMapping("staticMethod3")
    public String staticMethod3(){
        OpUtil.opSome("staticMethod3",this.liSiOpService);
        return "sucess";
    }
    @RequestMapping("staticMethod4")
    public String staticMethod4(){
        LiSiOpServiceImpl liSiOpService = new LiSiOpServiceImpl();
        OpUtil.opSome("staticMethod4",liSiOpService);
        return "sucess";
    }
}
