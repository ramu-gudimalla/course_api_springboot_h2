package com.SpringTutorial.io.courseapih2.lessons;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends CrudRepository<Lesson,String> {
    
    public List<Lesson> findByCourseId(String courseId);

}
