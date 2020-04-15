package com.yisu.shardingsphere.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yisu.shardingsphere.common.model.SysUser;
import org.apache.ibatis.annotations.Param;

/**
 * @description 系统用户表-Mapper
 * @author xuyisu
 * @date '2020-03-22'
 */
public interface SysUserPublicMapper extends BaseMapper<SysUser> {


    /**
     * 根据用户名查询关联广播表的查询测试
     * @param username
     * @return
     */
    SysUser getUserUnionCommon(@Param("username") String username,@Param("id") Long id);

    /**
     * 根据用户名查询关联广播表的查询测试
     * @param username
     * @return
     */
    SysUser getUserUnionCommonByTenant(@Param("username") String username,@Param("tenant") String tenant);


    /**
     * 根据用户名仅测试关联查询
     * @param username
     * @return
     */
    SysUser getUserUnionByUserName(@Param("username") String username,@Param("tenant") String tenant);

}
