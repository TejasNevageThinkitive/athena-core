package com.athena.core.controller;


import com.athena.core.client.EHRAthenaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {


    @Autowired
    private EHRAthenaConfig ehrAthenaConfig;

    @GetMapping
    public void test(){

        System.out.println("Token:-"+ehrAthenaConfig.getAccessToken());


    }
}
