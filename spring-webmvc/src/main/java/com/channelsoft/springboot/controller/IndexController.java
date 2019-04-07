package com.channelsoft.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: lizhu
 * @ClassName: IndexController
 * @Desciption: Date:2019/4/6
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(@RequestParam int value, Model model){
        return "index";
    }
}
