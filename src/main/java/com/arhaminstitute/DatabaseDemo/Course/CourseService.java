package com.arhaminstitute.DatabaseDemo.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService
{

     @Autowired
     private CourseRepository courseRepository;


      public List<Course> getAllCoursesByTopic(String id){


           List<Course> courseList =new ArrayList<>();
           courseRepository.findByTopicModelId(id).forEach(courseList::add);
          return courseList;
      }

      public void addCourse(Course course)
      {
           courseRepository.save(course);
      }

      public Course getCourseById(String id){

          return courseRepository.findById(id).get();
      }

      public List<Course> getCoursesByName(String name){
         return  courseRepository.findByName(name);
      }

      public void updateCourse(Course course)
      {
            courseRepository.save(course);
      }


    public void deleteCourse(Course course) {
            courseRepository.delete(course);

        }




}
