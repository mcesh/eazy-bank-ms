package com.eazybank.gatewayserver.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/azureContact")
    public Mono<String> azureContactSupport(){
        return Mono.just("An error occurred. Please try after some time or contact azure team!!");
    }
}
