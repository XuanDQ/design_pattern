package com.imooc.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/9
 */
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }
}
