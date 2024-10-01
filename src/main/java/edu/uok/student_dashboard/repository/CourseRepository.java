package edu.uok.student_dashboard.repository;

import edu.uok.student_dashboard.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
