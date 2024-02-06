package com.SpringTutorial.io.courseapih2.lessons;

import com.SpringTutorial.io.courseapih2.courses.Course;
import com.SpringTutorial.io.courseapih2.topic.Topic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Lesson {
    
    @Id
    private String id;
    private String name;
    private String description;

    @ManyToOne
    private Course course;

    @ManyToOne
    private Topic topic;

    public Lesson(){

    }

    public Lesson(String id, String name, String description, String topicId, String courseId){
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId,"","");
        this.course = new Course(courseId,"","",topicId);
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Topic getTopic() {
        return this.topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
