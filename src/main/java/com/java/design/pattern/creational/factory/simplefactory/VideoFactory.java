package com.java.design.pattern.creational.factory.simplefactory;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/10
 */
public class VideoFactory {
    // v3:反射方式获取
    public AbstractVideo getVideo(Class c) {
        AbstractVideo video = null;
        try {
            video = (AbstractVideo) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video != null ? video.produce() : null;
    }

//v1 :if-else
//    public AbstractVideo getVideo(String type){
//        if("java".equalsIgnoreCase(type)){
//            return new JavaVideo();
//        }else if("python".equalsIgnoreCase(type)){
//            return new PythonVideo();
//        }
//        return null;
//    }

    //v2 static
//    static AbstractVideo getVideo(Class c) {
//        AbstractVideo  video = null;
//        try {
//            video = (AbstractVideo) Class.forName(c.getName()).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return video.produce();
//    }
}
