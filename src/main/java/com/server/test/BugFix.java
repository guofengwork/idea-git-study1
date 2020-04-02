package com.server.test;

import org.junit.Test;

public class BugFix {

    public static void main(String[] args) {
        System.out.println("修复了1.0版本的bug");
    }

    @Test
    public void test3(){
        System.out.println("否定了用户修改，管理员重新修改");
    }

}
