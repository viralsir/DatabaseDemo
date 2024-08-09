package com.arhaminstitute.DatabaseDemo.Course;

import com.arhaminstitute.DatabaseDemo.Topic.TopicModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController
{

    @Autowired
    CourseService courseService;

    @RequestMapping("/topics/{id}/Courses")
    public List<Course> getAllCourseList(@PathVariable("id") String id)
    {

        return  courseService.getAllCoursesByTopic(id);
    }
    @RequestMapping(method=RequestMethod.POST,value="/topics/{id}/Course")
    public String addTopic(@RequestBody Course course,@PathVariable("id") String id)
    {
        TopicModel topicModel=new TopicModel(id,"","");
        course.setTopicModel(topicModel);

               courseService.addCourse(course);
               return "Record has been saved";
    }

    @RequestMapping("/topics/{topicid}/Course/{id}")
    public Course getTopicById(@PathVariable("topicid") String topicid,@PathVariable("id") String id)
    {

       return  courseService.getCourseById(id);
    }

    @RequestMapping("/courses/name/{name}")
    public List<Course> getTopicByName(@PathVariable("name") String name)
    {
        return  courseService.getCoursesByName(name);

    }



    @RequestMapping(method=RequestMethod.PUT,value="/topics/{id}/Course")
    public String updateTopic(@RequestBody Course course,@PathVariable("id") String id)
    {
        TopicModel topicModel=new TopicModel(id,"","");
        course.setTopicModel(topicModel);
        courseService.updateCourse(course);
        return "Record has been updated";
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}/Course")
    public String deleteTopic(@RequestBody Course course,@PathVariable("id") String id){

            TopicModel tm=new TopicModel(id,"","");
            course.setTopicModel(tm);
            courseService.deleteCourse(course);
            return "Record has been deleted";

    }




}
