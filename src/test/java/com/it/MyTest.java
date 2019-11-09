package com.it;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyTest {
    @DataProvider (name = "Pay")
    public static Object [] [] Pay () {
        return new IPay [][] {{new Pay1()},{new Pay2()},{new Pay3()}, {()-> System.out.println("Pay4")}};
    }
    @Test (dataProvider = "Pay")
    public void test1(IPay pay) {
        System.out.println("goods");
        pay.pay();
        System.out.println("assert");
    }
}
