package com.example.hateoas;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    HelloWorldModel get() {
        HelloWorldModel model = new HelloWorldModel();
        model.setHello("Hello World");
        model.add(linkTo(methodOn(HelloWorldController.class).get()).withSelfRel());
        return model;
    }
}
