package com.yisu.shardingaphere.demo.controller;

import com.yisu.shardingaphere.demo.model.Userinfo;
import com.yisu.shardingaphere.demo.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description 用户信息-控制层
 * @author xuyisu
 * @date '2020-03-10'
 */
@RestController
public class UserinfoController {

    @Autowired
    private UserinfoService userinfoService;


    /**
     * 分页查询
     */
    @PostMapping("/pageList")
    public List<Userinfo> pageList() {
        return userinfoService.list();
    }

    /**
     * 新增
     */
    @PostMapping("/insert")
    public boolean insert(@RequestBody Userinfo userinfo){
        return userinfoService.save(userinfo);
    }

    /**
     * 根据主键删除
     */
    @DeleteMapping("/{id}")
    public boolean deleteByPrimaryKey(@PathVariable Long id){
        return userinfoService.removeById(id);
    }

    /**
     * 根据主键更新
     */
    @PutMapping("/updateByPrimaryKey")
    public boolean updateByPrimaryKey(@RequestBody Userinfo userinfo){
        return userinfoService.updateById(userinfo);
    }

    /**
     * 根据主键查询
     */
    @GetMapping("/{id}")
    public Userinfo selectByPrimaryKey(@PathVariable Long id){
        return userinfoService.getById(id);
    }



}