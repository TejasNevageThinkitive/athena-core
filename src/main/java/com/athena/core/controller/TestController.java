package com.athena.core.controller;

import com.athena.core.client.AthenaRoutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private AthenaRoutes athenaRoutes;

    @GetMapping
    public void test(){
        System.out.println("Hellloo"+athenaRoutes.pullProviders(10101));
    }
}
