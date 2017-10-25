package test.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import test.spring.exception.ALISUREException;

/**
 * Created by ALISURE on 2017/3/17.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/index.html")
    public String test(){
        return "index";
    }

    @RequestMapping("/h")
    @ResponseBody
    public String test2(){
        String str = "xxx";
        char c = str.charAt(12);
        return "haha:" + c;
    }

    @RequestMapping("/a")
    @ResponseBody
    public String testALISUREException() throws ALISUREException {
        throw new ALISUREException("出现异常...");
    }
}
