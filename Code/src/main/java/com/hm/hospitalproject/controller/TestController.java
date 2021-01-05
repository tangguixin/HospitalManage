package com.hm.hospitalproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 唐贵欣
 * @Date: 2021/01/02/15:33
 * @Description:
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "Hello SpringBoot";
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String indexOf(){
        return "test";
    }
}
