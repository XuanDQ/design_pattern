package com.java.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/9
 */
public class TeamLeader {
    public void checkNumberOfCourses(){
        // 接收查到的课的list
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是："+courseList.size());
    }
}
