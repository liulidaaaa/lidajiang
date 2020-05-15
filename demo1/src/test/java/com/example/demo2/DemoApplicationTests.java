package com.example.demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.locks.ReentrantLock;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        ReentrantLock reentrantLock = new ReentrantLock();
        String s = "{\n" +
                "  \"id\": \"111111111\",\n" +
                "  \"name\": \"lida\"\n" +
                "}";
    }

}
