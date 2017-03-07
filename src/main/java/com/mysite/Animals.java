package com.mysite;

/**
 * Created by LuMoR on 06.03.2017.
 */
class Animals{
    String name;
    int age;
    void voice(){
    }
}

class Dog extends Animals{
    void voice(){
        System.out.print("Gav");
    }
}

class Cat extends Animals{
    void voice(){
        System.out.print("Mya");
    }
}