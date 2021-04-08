package com.codechallenge.mathdemo.controller;

import com.codechallenge.mathdemo.service.OperationService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationController {
    private OperationService service;

    public OperationController(OperationService service){
        this.service = service;
    }

    @RequestMapping("/getASum")
    public Integer getASum(@RequestParam(name="num1") Integer a, @RequestParam(name="num2") Integer b){
        return service.sum(a, b);
    }

    @RequestMapping("/getAProduct")
    public Integer getAProduct(@RequestParam(name="num") Integer a){
        return service.product(a);
    }

    @RequestMapping("/getAPower")
    public Integer getAPower(@RequestParam(name="num") Integer a){
        return service.power(a);
    }
}
