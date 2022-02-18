package com.example.hateoas;

import org.springframework.hateoas.RepresentationModel;

public class HelloWorldModel extends RepresentationModel<HelloWorldModel> {

    private String hello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
