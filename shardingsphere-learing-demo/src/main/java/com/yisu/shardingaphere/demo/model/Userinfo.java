package com.yisu.shardingaphere.demo.model;


import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @description 用户信息-实体
 * @author xuyisu
 * @date '2020-03-10 18:37:40'.
 */
@Data
@TableName("userinfo")
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
public class Userinfo extends Model<Userinfo> {

    /**
     * 主键
     */
    private int id;

    /**
     * 用户名
     */
    private String username;
    /**
     * 创建时间
     */
    private Date addtime;


}
