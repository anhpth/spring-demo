package com.higgsup.intern.spring.pojo.hello_world;

public class HelloWorldImpl implements HelloWorld {
    public void sayHello(String name) {
        System.out.printf("Hello %s!\n", name);
    }
}
