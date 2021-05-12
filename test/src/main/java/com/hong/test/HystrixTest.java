package com.hong.test;

import com.hong.service.UserService;
import lombok.extern.java.Log;
import org.databene.contiperf.PerfTest;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@Log
public class HystrixTest {

    @Autowired
    private UserService userService;

    @Rule
    public ContiPerfRule i = new ContiPerfRule();

    @Test
    @PerfTest(threads = 10,invocations = 10)
    public void test(){
        log.info(Thread.currentThread().getId()+userService.getUser(9).toString());

    }

}
