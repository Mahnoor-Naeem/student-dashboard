package edu.uok.student_dashboard.dto;

import edu.uok.student_dashboard.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private Long stdId;
    private String stdName;
    private String universityName;
    private Set<Course> courses = new HashSet<>();

}
