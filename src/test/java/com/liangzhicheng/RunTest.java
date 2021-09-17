package com.liangzhicheng;

import com.liangzhicheng.modules.entity.Member;
import com.liangzhicheng.modules.service.IMemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RunTest {

    @Resource
    private IMemberService emailService;

    @Test
    public void testInsert() {
        Member email =
                new Member("1", "yichengc3@163.com");
        emailService.save(email);
    }

}
