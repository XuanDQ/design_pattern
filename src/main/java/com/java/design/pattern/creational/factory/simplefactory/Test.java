package com.java.design.pattern.creational.factory.simplefactory;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/10
 */
public class Test {
    public static void main(String[] args) {

        //v1
//   AbstractVideo video = new JavaVideo();
//     video.produce();

        //v2
//        VideoFactory videoFactory = new VideoFactory();
//        AbstractVideo video = videoFactory.getVideo("java");
//        if(video == null){
//            return;
//        }
//        video.produce();


        // v3-1:反射
        VideoFactory videoFactory = new VideoFactory();
        AbstractVideo video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();

        //v3-2: static 方法
//        AbstractVideo video = VideoFactory.getVideo(JavaVideo.class);
//        if(video == null){
//            return;
//        }
//        video.produce();

    }
}
