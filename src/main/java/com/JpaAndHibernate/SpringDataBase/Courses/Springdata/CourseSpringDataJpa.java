package com.JpaAndHibernate.SpringDataBase.Courses.Springdata;

import com.JpaAndHibernate.SpringDataBase.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpa extends JpaRepository<Course,Long> {
}
