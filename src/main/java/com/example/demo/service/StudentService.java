package com.example.demo.service;

import com.example.demo.contact.Students;
import com.example.demo.model.StudentModel;
import com.example.demo.repo.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepo studentRepo;

    public void save(String name) {
        studentRepo.save(StudentModel.builder().name(name).build());
    }

    public Students getAll(){
        List<StudentModel> studentModels = studentRepo.findAll();
        return Students.builder()
                .names(studentModels.stream().map(StudentModel::getName).collect(Collectors.toList()))
                .build();
    }
}
