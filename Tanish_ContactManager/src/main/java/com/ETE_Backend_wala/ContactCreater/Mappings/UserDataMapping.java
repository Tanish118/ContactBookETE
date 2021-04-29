package com.ETE_Backend_wala.ContactCreater.Mappings;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserDataMapping {
    
    @RequestMapping("/")
    public String maino()
    {
        return "index";
    }

    @RequestMapping("/userinfo")
    public String userinfo()
    {
        return "html/Userinfo";
    }
}
