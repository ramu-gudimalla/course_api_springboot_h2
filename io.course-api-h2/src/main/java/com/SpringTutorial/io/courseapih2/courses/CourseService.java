package com.SpringTutorial.io.courseapih2.courses;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    // private List<Course> courses = new ArrayList<>(Arrays.asList(
    //         new Course("spring","Spring Framework","Spring desc"),
    //         new Course("java","Java core","Java desc"),
    //         new Course("javascript","core javascript","javascript desc")
    //     ));

    //GET request for all courses
    public List<Course> getallCourse(String topicId){
        
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId)
        .forEach(courses::add);
        return courses;
    }
    
    //GET request for single course
    public Course getCourse(String id){
        Optional<Course> optionalTopic =  courseRepository.findById(id);
        //return courses.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return optionalTopic.orElse(null);
    }

    //POST request to add course
    public void addCourse(Course course) {
		courseRepository.save(course);
	}

    //PUT request to update course
    public void updateCourse(Course course) {
        // for (int i = 0; i < courses.size(); i++){
        //     Course t = courses.get(i);
        //     if (t.getId().equals(id)){
        //         courses.set(i, course);
        //         return;
        //     }
        // }
        courseRepository.save(course);
    }

    //DELETE request to delete a course
    public void deleteCourse(String id) {
        // courses.removeIf(t -> t.getId().equals(id));

        courseRepository.deleteById(id);

    }

}
