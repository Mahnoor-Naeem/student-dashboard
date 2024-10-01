package edu.uok.student_dashboard.mapper;


import edu.uok.student_dashboard.dto.CourseDto;
import edu.uok.student_dashboard.entity.Course;

public class CourseMapper {
    public static CourseDto mapToCourseDto(Course course){
        return new CourseDto(
                course.getCourseId(),
                course.getCourseName()
        );
    }
}
