package com.example.demo2;


public class DemoTestApplication {

    public static void main(String[] args) {
        for (int i = 0; i < 99; i++) {
            if (i==98) {
                throw new NullPointerException("RuntimeException");
            }
            System.out.println("i="+i);
        }
    }

}
