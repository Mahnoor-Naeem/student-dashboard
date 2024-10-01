package edu.uok.student_dashboard.controller;

import edu.uok.student_dashboard.dto.CourseDto;
import edu.uok.student_dashboard.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/course")
@CrossOrigin("*")
public class CourseController {
    private CourseService courseService;

    @GetMapping
    public ResponseEntity<List<CourseDto>> getAllCourses(){
        List<CourseDto> courseDtoList = courseService.getAllCourses();
        return ResponseEntity.ok(courseDtoList);
    }
}
