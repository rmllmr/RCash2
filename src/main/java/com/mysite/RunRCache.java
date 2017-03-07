package com.mysite;

/**
 * Created by user on 07.03.2017.
 */
public class RunRCache {
    public static void main(String[] args){
        RCach testRChache = new RCach();
        testRChache.putRCache("1", 7, 200);
        testRChache.putRCache("2", new Dog(), 1);

        Object test = null;
        test = testRChache.getRCache("1");
        System.out.print(test.toString());



    }
}



