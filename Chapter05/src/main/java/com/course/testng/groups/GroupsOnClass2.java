package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author qiutiangui
 * @create 2020-04-24 22:00
 */

@Test(groups = "stu")
public class GroupsOnClass2 {

    public void stu1(){
        System.out.println("GroupsOnClass2中运行stu1");
    }

    public void stu2(){
        System.out.println("GroupsOnClass2中运行stu2");
    }
}
