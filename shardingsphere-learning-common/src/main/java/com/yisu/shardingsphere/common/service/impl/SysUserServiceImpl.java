package com.yisu.shardingsphere.common.service.impl;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import com.yisu.shardingsphere.common.mapper.SysUserMapper;
import com.yisu.shardingsphere.common.model.SysUser;
import com.yisu.shardingsphere.common.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Random;

/**
 * @description 系统用户表-业务实现
 * @author xuyisu
 * @date '2020-03-22'
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;


    @Override
    @Transactional
    public void insertTemplate() {

        List<String> tenantList = Lists.newArrayList("nike", "adidas", "converse");
        for (int i = 0; i <100 ; i++) {


            SysUser sysUser=new SysUser();
            sysUser.setAvatar("/home/avatar");
            sysUser.setCreateTime(DateUtil.date());
            sysUser.setCreateUser("sys"+i);
            sysUser.setDeleteFlag(0);
            sysUser.setDeptCode("depe"+i);
            sysUser.setDisableFlag(0);
            sysUser.setEmail("***@123.com"+i);
            sysUser.setPassword("123456");
            sysUser.setPosCode("pos");
            sysUser.setRealName("realname"+i);
            sysUser.setUpdateTime(DateUtil.date());
            sysUser.setUserName("fwcloud"+i);
            sysUser.setUpdateUser("sys"+i);
            sysUser.setUserPhone("12345678912"+i);
            sysUser.setTenant(tenantList.get(new Random().nextInt(tenantList.size())));
            sysUserMapper.insert(sysUser);

        }
        throw  new  RuntimeException("111111");
    }
}
