package com.example.srpingcorerush.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceAAA {

    @Autowired
    private ServiceBBB serviceBBB;

    public void helloA() {
        System.out.println("****业务逻辑1****");
        serviceBBB.helloB();
        System.out.println("****业务逻辑2****");
    }
}
