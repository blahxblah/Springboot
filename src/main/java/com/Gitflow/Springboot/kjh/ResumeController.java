package com.Gitflow.Springboot.kjh;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class ResumeController {

    private final ResumeService resumeService;
    @GetMapping("/resume/list")
    public String resumeList(Model model) {
        List<Resume> rList = resumeService.getList();
        model.addAttribute("rList", rList);
        return "resume_list";
    }

    @GetMapping(value = "/resume/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id) {
        Resume resume = resumeService.getResume(id);
        model.addAttribute("resume", resume);
        return "resume_detail";
    }

    @GetMapping("/resume/create")
    public String resumeCreate() {
        return "resume_form";
    }

    @PostMapping("/resume/create")
    public String resumeCreate(@RequestParam String name, @RequestParam String phone_number, @RequestParam String subject, @RequestParam String content) {
        resumeService.create(name, phone_number, subject, content);
        return "redirect:/resume/list"; // 이력서 저장후 이력서 목록으로 이동
    }
}
