package com.Gitflow.Springboot;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Gitflow.Springboot.kjh.Resume;
import com.Gitflow.Springboot.kjh.ResumeService;

@RestController
@RequestMapping("/springboot")
@RequiredArgsConstructor
public class KjhRestController {
    private final ResumeService resumeService;

    // TODO : 내 이력을 JSON 으로 받아 보자
    @GetMapping("/resume/{id}")
    public Object createResume(@PathVariable("id") Integer id) {
        Resume resume = this.resumeService.getResume(id);
        return resume;
    }
}
