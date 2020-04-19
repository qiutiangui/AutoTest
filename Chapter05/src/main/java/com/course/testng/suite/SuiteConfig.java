package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @author qiutiangui
 * @create 2020-04-19 22:52
 */
public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite 运行了");
    }

    @AfterSuite
    public void afterSuite(){

        System.out.println("after suite 运行了");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest 整个测试类开始前, 被执行, 主要用户塞值, 或者进行mock(Object)的初始化, 此方法只会运行一次 ");
    }

    @AfterTest
    public void  afterTest(){
        System.out.println("afterTest 整个测试类结束后, 被执行, 主要用户塞值, 或者进行mock(Object)的初始化, 此方法只会运行一次");
    }
}
