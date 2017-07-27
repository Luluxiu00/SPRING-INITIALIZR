package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 326944 on 2017/7/4.
 */

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String Hello(){
        return "Hello World!!!";
    }

    @RequestMapping("/")
    public String index(ModelMap map){
        map.addAttribute("host","http://www.baidu.com");
        return "index";

    }

}
