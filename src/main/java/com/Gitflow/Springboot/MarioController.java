package com.Gitflow.Springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MarioController {


    @GetMapping("/")
    public String root() {
        return "redirect:/resume/list";
    }
}
