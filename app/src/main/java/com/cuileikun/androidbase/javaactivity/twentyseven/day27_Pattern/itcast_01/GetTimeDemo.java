package com.cuileikun.androidbase.javaactivity.twentyseven.day27_Pattern.itcast_01;

/**
 * 作者：popular cui
 * 时间：2017/7/3 21:05
 * 功能:
 */
public class GetTimeDemo {
    public static void main(String[] args) {
        // GetTime gt = new GetTime();
        // System.out.println(gt.getTime() + "毫秒");

        GetTime gt = new ForDemo();
        System.out.println(gt.getTime() + "毫秒");

        gt = new IODemo();
        System.out.println(gt.getTime() + "毫秒");
    }
}
