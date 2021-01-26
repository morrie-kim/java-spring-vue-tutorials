package com.morrie.vue.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by morrie kim on 08/07/2019.
 */
@Slf4j
@RestController
@Api(value = "Home")
public class CommonController {

    @GetMapping("/api/index")
    public String index() {
        return "index";
    }

    @GetMapping(value = "/{path:[^\\.]*}")
    public String redirect() {
        return "forward:/";
    }
}
