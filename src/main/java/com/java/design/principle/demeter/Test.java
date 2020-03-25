package com.java.design.principle.demeter;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/9
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
