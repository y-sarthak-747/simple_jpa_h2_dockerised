package com.example.demo.service;

import com.example.demo.repo.StudentRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {

    @Mock
    private StudentRepo studentRepo;
    @InjectMocks
    private StudentService studentService;

    @Test
    void save() {
        studentService.save("abcd");
    }
}