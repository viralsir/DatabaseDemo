package com.arhaminstitute.DatabaseDemo.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService
{

     @Autowired
     private TopicRepository topicRepository;


      public List<TopicModel> getAllTopics(){


           List<TopicModel> topicModelList=new ArrayList<>();
          topicRepository.findAll().forEach(topicModelList::add);
          return topicModelList;
      }

      public void addTopic(TopicModel topicModel)
      {
           topicRepository.save(topicModel);
      }

      public TopicModel getTopicById(String id){

          return topicRepository.findById(id).get();
      }

      public List<TopicModel> getTopicsByName(String name){
         return  topicRepository.findByName(name);
      }

      public void updateTopic(TopicModel topicModel)
      {
            topicRepository.save(topicModel);
      }


    public void deleteTopic(TopicModel topicModel) {
            topicRepository.delete(topicModel);

        }




}
