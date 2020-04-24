package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author qiutiangui
 * @create 2020-04-24 22:00
 */

@Test(groups="stu")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("GroupsOnClass1中的stu1111运行");
    }

    public void stu2(){
        System.out.println("GroupsOnClass1中的stu2222运行");
    }
}
