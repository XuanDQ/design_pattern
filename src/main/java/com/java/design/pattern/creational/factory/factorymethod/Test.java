package com.java.design.pattern.creational.factory.factorymethod;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        VideoFactory videoFactory2 = new JavaVideoFactory();
        //VideoFactaory videoFactory3 = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

    }

}
