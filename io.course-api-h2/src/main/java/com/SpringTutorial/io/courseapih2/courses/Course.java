package com.SpringTutorial.io.courseapih2.courses;

import com.SpringTutorial.io.courseapih2.topic.Topic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {
    
    @Id
    private String id;
    private String name;
    private String description;

    @ManyToOne
    private Topic topic;

    public Topic getTopic() {
        return this.topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Course(){

    }

    public Course(String id,String name,String description,String topicId){
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId,"","");
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