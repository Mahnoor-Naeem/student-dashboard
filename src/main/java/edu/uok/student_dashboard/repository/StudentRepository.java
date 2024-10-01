package edu.uok.student_dashboard.repository;

import edu.uok.student_dashboard.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
