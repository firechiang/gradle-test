package com.firechiang.springbootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 * @author JIANG
 * @version 1.0
 * @date 2020/4/17
 * @deprecated com.firechiang.springbootapp.controller
 */
@RestController
public class TestController {

    @GetMapping("/name")
    public String getName(@RequestParam(name="name",required = false) String name) {

        return "不的名字="+name;
    }
}
