package com.yisu.shardingsphere.db.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @description 系统用户表-实体-common 测试
 * @author xuyisu
 * @date '2020-03-22 10:04:27'.
 */
@Data
@TableName("sys_user_common")
@EqualsAndHashCode(callSuper=false)
public class SysUserCommon {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人编码
     */
    private String createUser;

    /**
     * 用户名
     */
    private String userName;
}
