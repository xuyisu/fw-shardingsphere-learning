package com.yisu.shardingsphere.sub.dbtable.service.impl;

import com.yisu.shardingsphere.sub.dbtable.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SysUserServiceImplTest {
    @Autowired
    private SysUserService sysUserService;

    @Test
    public void testSelect(){
        int count = sysUserService.count();
        System.out.println(count);
    }


}