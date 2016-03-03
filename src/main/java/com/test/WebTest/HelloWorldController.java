package com.test.WebTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhangxibo on 16/3/3.
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public @ResponseBody
    String hello(Model model) {
        return"Hello Spring MVC";
    }

}