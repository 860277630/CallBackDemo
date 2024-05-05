package com.example.callbackdemo.service;

import com.example.callbackdemo.controller.AsyncController;

public interface AsyncService {
    void asyncCalcul(Integer num, AsyncController asyncController);
}
