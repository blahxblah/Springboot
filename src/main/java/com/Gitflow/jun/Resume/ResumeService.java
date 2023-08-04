package com.Gitflow.jun.Resume;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ResumeService {
    private final ResumeRepository resumeRepository;

    public List<Resume> getList() {
        List<Resume> rList = resumeRepository.findAll();
        return rList;
    }

    public Resume getResume(Integer id) {
        Optional<Resume> resume = this.resumeRepository.findById(id);
        return resume.get();
    }

    public void create(String name, String phone_number, String subject, String content) {
        Resume r = new Resume();
        r.setName(name);
        r.setPhone_number(phone_number);
        r.setSubject(subject);
        r.setContent(content);
        this.resumeRepository.save(r);
    }
}