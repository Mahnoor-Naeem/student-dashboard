package edu.uok.student_dashboard.service.impl;

import edu.uok.student_dashboard.dto.CourseDto;
import edu.uok.student_dashboard.dto.StudentDto;
import edu.uok.student_dashboard.entity.Course;
import edu.uok.student_dashboard.entity.Student;
import edu.uok.student_dashboard.exception.ResourceNotFoundException;
import edu.uok.student_dashboard.mapper.StudentMapper;
import edu.uok.student_dashboard.repository.StudentRepository;
import edu.uok.student_dashboard.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;
    @Override
    public StudentDto createStudentApplication(StudentDto studentDto) {
        Student student = StudentMapper.mapToStudent(studentDto);
        Student savedStudent = studentRepository.save(student);
        return StudentMapper.mapToStudentDto(savedStudent);
    }

    @Override
    public StudentDto getStudentById(Long stdId) {
        Student student = studentRepository.findById(stdId).orElseThrow(()->
                new ResourceNotFoundException("Student Not Exist With Given ID"+ stdId));
        return StudentMapper.mapToStudentDto(student);
    }
}
