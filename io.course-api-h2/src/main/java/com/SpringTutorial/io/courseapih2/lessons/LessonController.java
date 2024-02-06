package com.SpringTutorial.io.courseapih2.lessons;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class LessonController {

    @Autowired
    private LessonService lessonService; 
    
    @RequestMapping(path="/topics/{topicId}/courses/{courseId}/lessons", method=RequestMethod.GET)
    public List<Lesson> getallLessons(@PathVariable String topicId,@PathVariable String courseId ){
        return lessonService.getallLesson(topicId,courseId);
    }

}
