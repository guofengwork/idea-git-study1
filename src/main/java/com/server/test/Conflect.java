package com.server.test;

import org.junit.Test;

public class Conflect {

    public static void main(String[] args) {
        System.out.println("用户进行了修改");
        System.out.println("管理员进行了修改");
    }

    @Test
    public void test1(){
        System.out.println("牡丹江流川枫");
    }


    @Test
    public void test3(){
        System.out.println("匈牙利大猩猩" );
    }

}
