package com.wood.courses.model;

import java.util.List;

/**
 * Created by Wood on 10/11/2016.
 */
public interface CourseIdeaDAO {
    boolean add(CourseIdea idea);

    List<CourseIdea> findAll();

    CourseIdea findBySlug(String slug);
}
