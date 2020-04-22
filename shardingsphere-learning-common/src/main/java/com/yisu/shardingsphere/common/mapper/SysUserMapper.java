package com.yisu.shardingsphere.common.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yisu.shardingsphere.common.model.SysUser;

import java.util.List;

/**
 * @description 系统用户表-Mapper
 * @author xuyisu
 * @date '2020-03-22'
 */
public interface SysUserMapper  extends BaseMapper<SysUser> {

    /**
     * 自定义批量插入
     * @param sysUsers
     * @return
     */
    int  insertBatch(List<SysUser> sysUsers);

}
