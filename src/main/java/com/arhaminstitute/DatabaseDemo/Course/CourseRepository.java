package com.arhaminstitute.DatabaseDemo.Course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String>
{
       List<Course> findByName(String name);
       List<Course> findByTopicModelId(String topicid);



    //    getTopicByName(String nmae)
    //  addTopic(Topic)  insert query
    //  udateTopic(Topic) update query
    //  deleteTopic(id)  delete query
    // getAlltopic()   select query
    // getTopicById()  select query     CRUD (CREATE , READ,UPDATE,DELETE)

    /// INTERFACE (STEPS DEFINE)

    // CLASS IMPLEMENTS INTERFACE


}
