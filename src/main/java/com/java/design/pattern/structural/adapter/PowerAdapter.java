package com.java.design.pattern.structural.adapter;

/**
 * @author safeXuan
 * @version 1.0
 * description：
 * @date 2020/3/27 3:02 下午
 */
public class PowerAdapter implements DC5 {
    private AC220 ac220 = new AC220();

    @Override
    public int output5v() {
        int adapterInput = ac220.outputAc220V();
        //变压器
        int adapterOutput = adapterInput/44;
        System.out.println("使用PowerAdapter输入AC:"+adapterInput+"V"+"输出DC:"+adapterOutput+"V");
        return adapterOutput;
    }
}
