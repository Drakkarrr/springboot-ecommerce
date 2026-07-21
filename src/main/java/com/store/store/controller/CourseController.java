package com.store.store.controller;

import com.store.store.entity.CourseEntity;
import com.store.store.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CourseController {
    private final CourseRepository courseRepository;

    @PostMapping("/courses")
    public CourseEntity createCourse(@RequestBody CourseEntity courseEntity) {
        return courseRepository.save(courseEntity);
    }
}
