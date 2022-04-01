package com.example.api.students;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> list() {
        return studentService.list();
    }

    @GetMapping(path = "{studentId}")
    public Optional<Student> get(@PathVariable Long studentId) {
        return studentService.get(studentId);
    }

    @PostMapping(path = "student")
    public void add(@RequestBody Student student) {
        studentService.add(student);
    }

    @DeleteMapping(path = "student/{studentId}")
    public void delete(@PathVariable Long studentId) {
        studentService.delete(studentId);
    }

    @PutMapping(path = "student")
    public void update(@RequestBody Student student) {
        studentService.update(student);
    }
}
