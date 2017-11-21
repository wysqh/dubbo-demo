package com.start.service;

import com.start.inter.IMyInterface;
import org.springframework.stereotype.Service;

@Service
public class MyInterfaceImpl implements IMyInterface {
    public String sayHello() {
        return "Hello World.";
    }
}
