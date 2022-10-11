package com.wch.euexam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wch
 * @version 1.0
 * @date 2022/10/11 18:16
 * 测试boot项目
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/get/eu-exam")
    public String test(){
        return "hello! eu-exam!";
    }
}
