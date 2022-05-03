/*
 * eightio.com Inc.
 * Copyright (c) 2021-2022 All Rights Reserved.
 */
package com.owlyowl.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 洛琪.guruoqi
 * @version $Id: TestController.java, v 0.1 2022-05-03 11:05 下午 洛琪.guruoqi Exp $$
 */
@RestController
public class TestController {

    @GetMapping("/")
    public String index(){
        return "success";
    }
}
