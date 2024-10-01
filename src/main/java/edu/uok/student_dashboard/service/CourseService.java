package edu.uok.student_dashboard.service;

import edu.uok.student_dashboard.dto.CourseDto;

import java.util.List;

public interface CourseService {
    List<CourseDto> getAllCourses();
}
