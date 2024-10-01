package edu.uok.student_dashboard.service;


import edu.uok.student_dashboard.dto.StudentDto;

public interface StudentService {
    StudentDto createStudentApplication(StudentDto studentDto);
    StudentDto getStudentById(Long stdId);
}
