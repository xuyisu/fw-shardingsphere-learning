CREATE DATABASE tenant_nike;
USE tenant_nike;
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_time` datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间',
  `create_user` varchar(100) NOT NULL COMMENT '创建人编码',
  `update_user` varchar(100) NOT NULL COMMENT '修改人编码',
  `delete_flag` tinyint(4) NOT NULL DEFAULT '0' COMMENT '删除标记(1 删除 0未删除)',
  `pos_code` varchar(50) DEFAULT NULL COMMENT '职位编码',
  `disable_flag` tinyint(4) NOT NULL DEFAULT '0' COMMENT '启用标记(1 禁用 0启用)',
  `avatar` varchar(100) DEFAULT NULL COMMENT '头像地址',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  `real_name` varchar(50) DEFAULT NULL COMMENT '真实姓名',
  `dept_code` varchar(50) DEFAULT NULL COMMENT '部门编码',
  `user_phone` varchar(15) DEFAULT NULL COMMENT '手机号',
  `tenant` varchar(15) DEFAULT NULL COMMENT '租户',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `idx_email` (`email`) USING BTREE COMMENT '邮箱索引',
  UNIQUE KEY `idx_user_name` (`user_name`) USING BTREE COMMENT '用户名索引',
  KEY `idx_dept_code` (`dept_code`) USING BTREE COMMENT '部门编码索引',
  KEY `idx_position_code` (`pos_code`) USING BTREE COMMENT '职位编码索引'
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='系统用户表';
DROP TABLE IF EXISTS `sys_user_common`;
CREATE TABLE `sys_user_common` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_time` datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
  `create_user` varchar(100) NOT NULL COMMENT '创建人编码',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1248171346601271299 DEFAULT CHARSET=utf8 COMMENT='系统用户表';

CREATE DATABASE tenant_adidas;
USE tenant_adidas;
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_time` datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间',
  `create_user` varchar(100) NOT NULL COMMENT '创建人编码',
  `update_user` varchar(100) NOT NULL COMMENT '修改人编码',
  `delete_flag` tinyint(4) NOT NULL DEFAULT '0' COMMENT '删除标记(1 删除 0未删除)',
  `pos_code` varchar(50) DEFAULT NULL COMMENT '职位编码',
  `disable_flag` tinyint(4) NOT NULL DEFAULT '0' COMMENT '启用标记(1 禁用 0启用)',
  `avatar` varchar(100) DEFAULT NULL COMMENT '头像地址',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  `real_name` varchar(50) DEFAULT NULL COMMENT '真实姓名',
  `dept_code` varchar(50) DEFAULT NULL COMMENT '部门编码',
  `user_phone` varchar(15) DEFAULT NULL COMMENT '手机号',
  `tenant` varchar(15) DEFAULT NULL COMMENT '租户',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `idx_email` (`email`) USING BTREE COMMENT '邮箱索引',
  UNIQUE KEY `idx_user_name` (`user_name`) USING BTREE COMMENT '用户名索引',
  KEY `idx_dept_code` (`dept_code`) USING BTREE COMMENT '部门编码索引',
  KEY `idx_position_code` (`pos_code`) USING BTREE COMMENT '职位编码索引'
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='系统用户表';
DROP TABLE IF EXISTS `sys_user_common`;
CREATE TABLE `sys_user_common` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_time` datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
  `create_user` varchar(100) NOT NULL COMMENT '创建人编码',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1248171346601271299 DEFAULT CHARSET=utf8 COMMENT='系统用户表';


CREATE DATABASE tenant_converse;
USE tenant_converse;
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_time` datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间',
  `create_user` varchar(100) NOT NULL COMMENT '创建人编码',
  `update_user` varchar(100) NOT NULL COMMENT '修改人编码',
  `delete_flag` tinyint(4) NOT NULL DEFAULT '0' COMMENT '删除标记(1 删除 0未删除)',
  `pos_code` varchar(50) DEFAULT NULL COMMENT '职位编码',
  `disable_flag` tinyint(4) NOT NULL DEFAULT '0' COMMENT '启用标记(1 禁用 0启用)',
  `avatar` varchar(100) DEFAULT NULL COMMENT '头像地址',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  `real_name` varchar(50) DEFAULT NULL COMMENT '真实姓名',
  `dept_code` varchar(50) DEFAULT NULL COMMENT '部门编码',
  `user_phone` varchar(15) DEFAULT NULL COMMENT '手机号',
  `tenant` varchar(15) DEFAULT NULL COMMENT '租户',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `idx_email` (`email`) USING BTREE COMMENT '邮箱索引',
  UNIQUE KEY `idx_user_name` (`user_name`) USING BTREE COMMENT '用户名索引',
  KEY `idx_dept_code` (`dept_code`) USING BTREE COMMENT '部门编码索引',
  KEY `idx_position_code` (`pos_code`) USING BTREE COMMENT '职位编码索引'
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='系统用户表';

DROP TABLE IF EXISTS `sys_user_common`;
CREATE TABLE `sys_user_common` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_time` datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
  `create_user` varchar(100) NOT NULL COMMENT '创建人编码',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1248171346601271299 DEFAULT CHARSET=utf8 COMMENT='系统用户表';

CREATE DATABASE tenant_common;
USE tenant_common;
DROP TABLE IF EXISTS `sys_user_common`;
CREATE TABLE `sys_user_common` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_time` datetime(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
  `create_user` varchar(100) NOT NULL COMMENT '创建人编码',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1248171346601271299 DEFAULT CHARSET=utf8 COMMENT='系统用户表';