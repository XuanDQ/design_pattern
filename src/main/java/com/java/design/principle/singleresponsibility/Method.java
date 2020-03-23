package com.java.design.principle.singleresponsibility;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/9
 */
public class Method {
    private void updateUserInfo(String userName, String address) {
        userName = "geely";
        address = "beijing";
    }

    private void updateUserInfo(String userName, String... properties) {
        userName = "geely";
//        address = "beijing";
    }

    private void updateUsername(String userName) {
        userName = "geely";
    }

    private void updateUserAddress(String address) {
        address = "beijing";
    }

    private void updateUserInfo(String userName,String address,boolean bool) {
        if (bool) {
            //todo something1
        } else {
            //todo something2
        }
        userName = "geely";
        address = "beijing";
    }
}