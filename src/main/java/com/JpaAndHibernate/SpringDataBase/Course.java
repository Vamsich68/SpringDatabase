package com.JpaAndHibernate.SpringDataBase;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;
@Entity
public class Course {
    @Id
    private int id;
    private String coursename;
    private String platform;


    public Course() {
    }

    public Course(int id, String coursename, String platform) {
        super();
        this.id = id;
        this.coursename = coursename;
        this.platform = platform;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getId() {
        return id;
    }

    public String getCoursename() {
        return coursename;
    }

    public String getPlatform() {
        return platform;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", coursename=" + coursename + ", author=" + platform + "]";
    }
}

