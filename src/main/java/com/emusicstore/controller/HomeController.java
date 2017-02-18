package com.emusicstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by thinh on 12/31/2016.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
        public String Home()
        {
            return "home";
        }
}
