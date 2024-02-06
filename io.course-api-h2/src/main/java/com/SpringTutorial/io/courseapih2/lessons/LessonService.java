package com.SpringTutorial.io.courseapih2.lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {
    
    @Autowired
    private LessonRepository lessonRepository;

    public List<Lesson> getallLesson(String topicId,String courseId){

        List<Lesson> lessons = new ArrayList<>();
        lessonRepository.findByCourseId(courseId)
        .forEach(lessons::add);
        return lessons;

    }

}
