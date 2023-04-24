package com.fz.controller;

import com.fz.entity.TUser;
import com.fz.service.TUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TUser)表控制层
 *
 * @author makejava
 * @since 2023-04-20 11:45:40
 */
@RestController
@RequestMapping("tUser")
public class TUserController {
    /**
     * 服务对象
     */
    @Resource
    private TUserService tUserService;

    /**
     * 分页查询
     *
     * @param tUser 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TUser>> queryByPage(TUser tUser, PageRequest pageRequest) {

        return ResponseEntity.ok(this.tUserService.queryByPage(tUser, pageRequest));
    }
//    前端调用
//    $.ajax({
//        url: "/users", // 请求的 URL
//                type: "GET", // 请求方式
//                data: { // 请求参数
//            username: "张三",
//                    age: 18,
//                    pageIndex: 1,
//                    pageSize: 10
//        },
//        success: function(data) { // 成功回调函数
//            console.log(data); // 输出查询结果
//        },
//        error: function(error) { // 失败回调函数
//            console.log(error); // 输出错误信息
//        }
//    });

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TUser> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tUserService.queryById(id));
    }


//    查询所有
@GetMapping("queryByAll")
     public List<TUser> queryByAll(){
        return  tUserService.queryByAll();
     }
//根据tuser 表查询所有
    @GetMapping("queryByTusers")
     public List<TUser>  queryByTusers(TUser tusers){

        return tUserService.queryByTusers(tusers);
     }


    /**
     * 新增数据
     *
     * @param tUser 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TUser> add(TUser tUser) {
        return ResponseEntity.ok(this.tUserService.insert(tUser));
    }

    /**
     * 编辑数据
     *
     * @param tUser 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TUser> edit(TUser tUser) {
        return ResponseEntity.ok(this.tUserService.update(tUser));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tUserService.deleteById(id));
    }

}

