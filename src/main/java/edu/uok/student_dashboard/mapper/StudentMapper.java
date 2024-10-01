package edu.uok.student_dashboard.mapper;


import edu.uok.student_dashboard.dto.StudentDto;
import edu.uok.student_dashboard.entity.Course;
import edu.uok.student_dashboard.entity.Student;

import java.util.HashSet;
import java.util.Set;

public class StudentMapper {
    public static StudentDto mapToStudentDto(Student student){
        return new StudentDto(
                student.getStdId(),
                student.getStdName(),
                student.getUniversityName(),
                student.getCourses()
        );
    }

    public static Student mapToStudent(StudentDto studentDto){
        Student student = new Student();
        student.setStdId(studentDto.getStdId());
        student.setStdName(studentDto.getStdName());
        student.setUniversityName(studentDto.getUniversityName());
        Set<Course> set = studentDto.getCourses();
        if ( set != null ) {
            student.setCourses( new HashSet<Course>( set ) );
        }
        return student;
    }
}
