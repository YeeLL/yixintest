package yee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/home")
public class IndexController {

    @RequestMapping("/login")
    @ResponseBody
    public Map<String, String> login() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("aaaa", "aaaa");
        return map;
    }

    @RequestMapping("/index")
    public String index(){
        return "login";
    }
}
