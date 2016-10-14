package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"/index", "ext"})
    String index(){
        return "index";
    }

//    @RequestMapping({"/secured", "ext"})
//    public String secured(){
//        return "secured";
//    }
}
