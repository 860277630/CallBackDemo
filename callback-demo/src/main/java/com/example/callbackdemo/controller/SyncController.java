package com.example.callbackdemo.controller;

import com.example.callbackdemo.service.CallBackService;
import com.example.callbackdemo.service.impl.LiSiOpServiceImpl;
import com.example.callbackdemo.service.impl.ZhangSanOpServiceImpl;
import com.example.callbackdemo.utils.OpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: callback-demo
 * @description: 同步回调函数使用
 * @author: wjl
 * @create: 2024-05-04 23:18
 **/
@RestController
@RequestMapping("sync")
public class SyncController {
    @Autowired
    private ZhangSanOpServiceImpl zhangSanOpService;

    @Autowired
    private LiSiOpServiceImpl liSiOpService;

    @Autowired
    private CallBackService callBackService;


    @RequestMapping("syncMethod1")
    public String staticMethod1(){
        callBackService.op("syncMethod1",this.zhangSanOpService);
        return "sucess";
    }

    @RequestMapping("syncMethod2")
    public String staticMethod2(){
        ZhangSanOpServiceImpl zhangSanOpService = new ZhangSanOpServiceImpl();
        callBackService.op("syncMethod2", zhangSanOpService);
        return "sucess";
    }
    @RequestMapping("syncMethod3")
    public String staticMethod3(){
        callBackService.op("syncMethod3",this.liSiOpService);
        return "sucess";
    }
    @RequestMapping("syncMethod4")
    public String staticMethod4(){
        LiSiOpServiceImpl liSiOpService = new LiSiOpServiceImpl();
        callBackService.op("syncMethod4",liSiOpService);
        return "sucess";
    }
}
