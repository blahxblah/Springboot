package com.Gitflow.Springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class KjhController {

    @GetMapping("/mario")
    @ResponseBody
    public String mario() {
        System.out.println("MARIO");
        return "MARIO";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/resume/list";
    }
}
