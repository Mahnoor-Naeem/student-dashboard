package edu.uok.student_dashboard.service.impl;

import edu.uok.student_dashboard.dto.CourseDto;
import edu.uok.student_dashboard.entity.Course;
import edu.uok.student_dashboard.mapper.CourseMapper;
import edu.uok.student_dashboard.repository.CourseRepository;
import edu.uok.student_dashboard.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
    private CourseRepository courseRepository;

    @Override
    public List<CourseDto> getAllCourses() {
        List<Course> courses = courseRepository.findAll();
        return courses.stream().map((course) -> CourseMapper.mapToCourseDto(course))
                .collect(Collectors.toList());
    }
}
