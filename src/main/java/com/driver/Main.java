package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();
//        rwOnly.privateVal = 10;
//        System.out.println(rwOnly.privateVal);
//        java: privateVal has private access in com.driver.RWOnly
        rwOnly.setPrivateVal(10);
        System.out.println(rwOnly.getPrivateVal());
    }

}