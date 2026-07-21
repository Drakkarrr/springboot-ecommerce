package com.store.store.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "courses")
public class CourseEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String courseName;

    @Column
    private String courseCode;

    @Column
    private String courseDescription;
}
