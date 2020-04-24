package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author qiutiangui
 * @create 2020-04-24 22:00
 */

@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void teacher1(){
        System.out.println("GroupsOnClass3中的teacher1运行");
    }

    public void teacher2(){
        System.out.println("GroupsOnClass3中teacher2运行");
    }
}
