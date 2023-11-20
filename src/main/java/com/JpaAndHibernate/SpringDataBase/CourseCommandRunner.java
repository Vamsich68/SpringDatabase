package com.JpaAndHibernate.SpringDataBase;

import com.JpaAndHibernate.SpringDataBase.Courses.Jdbc.CourseJdbcRepository;
import com.JpaAndHibernate.SpringDataBase.Courses.Jpa.CourseJpaRepository;
import com.JpaAndHibernate.SpringDataBase.Courses.Springdata.CourseSpringDataJpa;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class CourseCommandRunner implements CommandLineRunner {
    /*@Autowired
    private CourseJdbcRepository repository;*/

    /*@Autowired
    private CourseJpaRepository repository;
*/
    @Autowired
    private CourseSpringDataJpa repository;
    @Override
    public void run(String... args) throws Exception {
        //repository.insert(new Course(3,"Azure-jpa","udemy"));
        //repository.insert(new Course(4,"DevOps-jpa","udemy"));
        repository.save(new Course(1,"azure-sd","udemy"));
        repository.save(new Course(2,"devops-sd","udemy"));
        //System.out.println(repository.findById(3));
        //System.out.println(repository.findById(4));
        System.out.println(repository.findById(2l));
        System.out.println(repository.findAll());
        System.out.println(repository.count());

    }
}
