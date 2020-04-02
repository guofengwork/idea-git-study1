package com.server.test;

import org.junit.Test;

public class BugFix {

    public static void main(String[] args) {
        System.out.println("修复了1.0版本的bug");
    }

    @Test
    public void test1(){
        System.out.println("偷偷又修复了1次bug");
    }

    @Test
    public void test2(){
        System.out.println("还偷偷又修复了1次bug");
    }

}
