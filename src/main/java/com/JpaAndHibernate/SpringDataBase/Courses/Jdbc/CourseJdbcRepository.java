package com.JpaAndHibernate.SpringDataBase.Courses.Jdbc;

import com.JpaAndHibernate.SpringDataBase.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private static String insertQuery= """
            insert into Course (id, coursename, platform)
            				values(?, ?,?);
            """;
    public void insert(Course course){
        springJdbcTemplate.update(insertQuery,course.getId(),course.getCoursename(),course.getPlatform());
    }
}
