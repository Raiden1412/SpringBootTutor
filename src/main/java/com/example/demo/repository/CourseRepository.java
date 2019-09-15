package com.example.demo.repository;

import com.example.demo.modal.Course;
import com.example.demo.modal.Instructor;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CourseRepository {
    List<Course> courses = new ArrayList<>();

    // constructor
    public CourseRepository() {


        Course javaOne = Course.builder()
                .className("Java I")
                .instructor(new Instructor("Steve", "Jobs", "Phd", "TownHall201"))
                .startDate(new Date("8/1/2018"))
                .endDate(new Date("12/24/2018"))
                .timeFrame("8am-10am")
                .build();
        Course two= Course.builder()
                .className("Java II")
                .instructor(new Instructor("Steve", "Jobs", "Phd", "TownHall201"))
                .startDate(new Date("8/1/2018"))
                .endDate(new Date("12/24/2018"))
                .timeFrame("8am-10am")
                .build();

        courses.add(javaOne);
    }

    public int[] getTwoSum(String target){
        int[] arr=new int[]{2, 7, 11, 15};
        int targetInt=Integer.parseInt(target);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(targetInt-arr[i])){
                map.put(arr[i],i);
            }else{
                return new int[]{map.get(targetInt-arr[i]),i};
            }
        }
        return new int[]{-1,-1};
    }

    public int[] checkTwoSum(Integer[] inputArray,Integer target){
        if(inputArray==null||inputArray.length==0||target==null) return new int[]{-1,-1};

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inputArray.length;i++){
            if(!map.containsKey(target-inputArray[i])){
                map.put(inputArray[i],i);
            }else{
                return new int[]{map.get(target-inputArray[i]),i};
            }

        }
        return new int[]{-1,-1};
    }

    public List<Course> findAllClasses(){
        //链接数据库
        //返回数据库的信息
        return  courses;
    }

    public List<Course> findAllCourse(String searchByCourseName){

        return new ArrayList<Course>();
    }

    public List<Course> findCourseByName(String courseName) {
        if(courseName.equals("Java_I")) {
            return courses;
        }

        return new ArrayList<Course>();
    }
}
