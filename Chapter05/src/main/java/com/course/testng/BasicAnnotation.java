package com.course.testng;

import org.testng.annotations.*;

/**
 * @author qiutiangui
 * @create 2020-04-19 22:36
 */
public class BasicAnnotation {

    //最基本额注解，用例吧方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("Test这是测试用例1");

    }

    @Test
    public void testCase2(){
        System.out.println("Test这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod 这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod 这是在测试方法之后运行的方法");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass 这是在测试类之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass 这是在测试类运行之后运行的方法");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite 测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite 测试套件");
    }


}
