package com.example.hateoas;

import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.config.EnableHypermediaSupport;

@Configuration
@EnableHypermediaSupport(type = {
    EnableHypermediaSupport.HypermediaType.HAL,
})
class EnableHypermedia {
}
