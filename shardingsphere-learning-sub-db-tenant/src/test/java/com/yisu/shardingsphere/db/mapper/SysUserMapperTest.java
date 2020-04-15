package com.yisu.shardingsphere.db.mapper;

import cn.hutool.json.JSONUtil;
import com.yisu.shardingsphere.common.model.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SysUserMapperTest {

    @Autowired
    private SysUserPublicMapper sysUserMapper;

    @Test
    public void getUserUnionCommonTest(){
        SysUser unionCommon = sysUserMapper.getUserUnionCommon("fwcloud0",1L);
        log.info(JSONUtil.toJsonStr(unionCommon));
        System.out.println("ok");
    }

    @Test
    public void getUserUnionCommonByTenantTest(){
        SysUser unionCommon = sysUserMapper.getUserUnionCommonByTenant("fwcloud0","adidas");
        log.info(JSONUtil.toJsonStr(unionCommon));
        System.out.println("ok");
    }


    @Test
    public void getUserUnionByUserNameTest(){
        long start = System.currentTimeMillis();
        SysUser unionCommon = sysUserMapper.getUserUnionByUserName("fwcloud0","adidas");
        log.info(JSONUtil.toJsonStr(unionCommon));
        long end = System.currentTimeMillis();
        System.out.println("time:"+(end-start));
    }


}