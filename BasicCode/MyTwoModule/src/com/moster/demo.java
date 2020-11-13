package com.moster;

import com.monster_01.Student;
import com.monster_02.Tearch;
import com.monster_03.MyService;
//import com.monster_03.MyService;

import java.util.ServiceLoader;

public class demo {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.study();
//        Tearch tearch = new Tearch();
//        tearch.work();


        System.out.println("ssf");

        ServiceLoader<MyService> services = ServiceLoader.load(MyService.class);
        for (MyService my:
             services) {
           my.service();
        }
    }
}
