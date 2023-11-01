package com.example.demo.controller;

import com.example.demo.contact.Students;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/save/{name}")
    public ResponseEntity<?> save(@PathVariable(value = "name") String name){
        studentService.save(name);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(produces = "application/json")
    public ResponseEntity<Students> getAllStudents() {
        return new ResponseEntity<>(studentService.getAll(), HttpStatus.OK);
    }
}
