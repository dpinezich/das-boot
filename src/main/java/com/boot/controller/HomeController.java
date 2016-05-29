package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by david_000 on 29.05.2016.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Das Boot, reporting for duty!";
    }
}
