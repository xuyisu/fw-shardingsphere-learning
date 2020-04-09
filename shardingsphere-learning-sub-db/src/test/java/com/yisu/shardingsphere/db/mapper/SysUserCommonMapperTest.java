package com.yisu.shardingsphere.db.mapper;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.json.JSONUtil;
import com.yisu.shardingsphere.db.model.SysUserCommon;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SysUserCommonMapperTest {

    @Autowired
    private SysUserCommonMapper sysUserCommonMapper;

    /**
     *测试广播表保存
     */
    @Test
    public void saveCommonTest(){


        for (int i = 0; i <10 ; i++) {
            sysUserCommonMapper.insert(initSysCommon());
        }
        log.info("save  ok");

    }

    public SysUserCommon initSysCommon(){
        SysUserCommon sysUserCommon=new SysUserCommon();
        sysUserCommon.setCreateTime(DateUtil.date());
        sysUserCommon.setCreateUser("sys");
        sysUserCommon.setUserName("user_name"+ RandomUtil.randomNumbers(1));
        return sysUserCommon;
    }

    /**
     * 测试单表查询
     */
    @Test
    public void testSelect(){
        List<SysUserCommon> sysUserCommons = sysUserCommonMapper.selectList(null);
        log.info(JSONUtil.toJsonStr(sysUserCommons));
    }

}
