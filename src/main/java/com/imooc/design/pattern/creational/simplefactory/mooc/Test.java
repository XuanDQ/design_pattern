package com.imooc.design.pattern.creational.simplefactory.mooc;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/10
 */
public class Test {
    public static void main(String[] args) {

        //v1
//   Video video = new JavaVideo();
//     video.produce();

        //v2
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if(video == null){
//            return;
//        }
//        video.produce();

        //v3-1:反射
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();

        //v3-2: static 方法
//        Video video = VideoFactory.getVideo(JavaVideo.class);
//        if(video == null){
//            return;
//        }
//        video.produce();

    }
}
