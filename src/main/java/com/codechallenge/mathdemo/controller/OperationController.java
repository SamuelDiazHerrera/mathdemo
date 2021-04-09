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
    public Integer getASum(@RequestParam(name="num1") String a, @RequestParam(name="num2") String b){
        return service.sum(Integer.valueOf(a), Integer.valueOf(b));
    }

    @RequestMapping("/getAProduct")
    public Integer getAProduct(@RequestParam(name="num") Integer a){
        return service.product(Integer.valueOf(a));
    }

    @RequestMapping("/getAPower")
    public Integer getAPower(@RequestParam(name="num") Integer a){
        return service.power(Integer.valueOf(a));
    }
}
