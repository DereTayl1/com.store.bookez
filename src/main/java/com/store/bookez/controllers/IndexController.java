package com.store.bookez.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by deretayl1 on 5/3/2016.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
