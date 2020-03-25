package com.java.design.principle.demeter;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/9
 */
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }
}
