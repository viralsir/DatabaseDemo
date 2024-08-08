package com.arhaminstitute.DatabaseDemo.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController
{

    @Autowired
    TopicService topicService;

    @RequestMapping("/topics")
    public List<TopicModel> getAllTopicList()
    {
       return  topicService.getAllTopics();
    }
    @RequestMapping(method=RequestMethod.POST,value="/topics")
    public String addTopic(@RequestBody TopicModel topicModel)

    {
               topicService.addTopic(topicModel);
               return "Record has been saved";
    }

    @RequestMapping("/topics/{id}")
    public TopicModel getTopicById(@PathVariable("id") String id)
    {
       return  topicService.getTopicById(id);
    }

    @RequestMapping("/topics/name/{name}")
    public List<TopicModel> getTopicByName(@PathVariable("name") String name)
    {
        return  topicService.getTopicsByName(name);
    }



    @RequestMapping(method=RequestMethod.PUT,value="/topics")
    public String updateTopic(@RequestBody TopicModel topicModel)
    {
        topicService.updateTopic(topicModel);
        return "Record has been updated";
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topics")
    public String deleteTopic(@RequestBody TopicModel topicModel){

            topicService.deleteTopic(topicModel);
            return "Record has been deleted";

    }




}
