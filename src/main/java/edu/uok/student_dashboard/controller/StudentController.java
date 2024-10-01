package edu.uok.student_dashboard.controller;

import edu.uok.student_dashboard.dto.StudentDto;
import edu.uok.student_dashboard.entity.Student;
import edu.uok.student_dashboard.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/student")
@CrossOrigin("*")
public class StudentController {
    private StudentService studentService;
    @PostMapping("/create")
    public ResponseEntity<StudentDto> createStudentApplication(@RequestBody StudentDto studentDto){
        StudentDto savedStudent = studentService.createStudentApplication(studentDto);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable("id") Long stdId){
        StudentDto student = studentService.getStudentById(stdId);
        return ResponseEntity.ok(student);
    }
}
