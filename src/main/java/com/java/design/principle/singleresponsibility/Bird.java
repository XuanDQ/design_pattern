package com.java.design.principle.singleresponsibility;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/9
 */
public class Bird {
    public void mainMoveMode(String birdName){
        if("鸵鸟".equals(birdName)){
            System.out.println(birdName+"用脚走");
        }else{
            System.out.println(birdName+"用翅膀飞");
        }
    }
}
