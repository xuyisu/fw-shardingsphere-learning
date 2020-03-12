package com.yisu.shardingaphere.readwrite.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.yisu.shardingaphere.FwShardingsphereReadWrite;
import com.yisu.shardingaphere.readwrite.model.Userinfo;
import com.yisu.shardingaphere.readwrite.service.UserinfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = {FwShardingsphereReadWrite.class})
public class UserinfoServiceImplTest {

    @Autowired
    private UserinfoService userinfoService;

    @Test
    public void testBatchInsert(){

        List<Userinfo> list=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(new Userinfo(i+1,"test"+i,new Date()));
        }
        userinfoService.saveBatch(list);

    }
    @Test
    public void testSlectAll(){

        LambdaQueryWrapper<Userinfo> wrapper = new LambdaQueryWrapper();
        // 商家图片，未删除，可用状态
        wrapper.select(Userinfo::getId,Userinfo::getUsername,Userinfo::getAddtime);
        List<Userinfo> list = userinfoService.list(wrapper);
//        List<Userinfo> list = userinfoService.list();
        System.out.println(list);

//        System.out.println(userinfoService.count());
    }

}