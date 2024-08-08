package com.arhaminstitute.DatabaseDemo.Topic;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TopicRepository extends CrudRepository<TopicModel, String>
{
       List<TopicModel> findByName(String name);


    //    getTopicByName(String nmae)
    //  addTopic(Topic)  insert query
    //  udateTopic(Topic) update query
    //  deleteTopic(id)  delete query
    // getAlltopic()   select query
    // getTopicById()  select query     CRUD (CREATE , READ,UPDATE,DELETE)

    /// INTERFACE (STEPS DEFINE)

    // CLASS IMPLEMENTS INTERFACE


}
