package com.fz.service.impl;

import com.fz.entity.TUser;
import com.fz.dao.TUserDao;
import com.fz.service.TUserService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TUser)表服务实现类
 *
 * @author makejava
 * @since 2023-04-20 11:45:41
 */
@Service("tUserService")
public class TUserServiceImpl implements TUserService {
    @Resource
    private TUserDao tUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Override
    public TUser queryById(Integer userId) {
        return this.tUserDao.queryById(userId);
    }
/*
* 查询所有
 */
    @Override
    public List<TUser> queryByAll() {
        return tUserDao.queryByAll();
    }

//    根据tUser 属性查询所有
    @Override
    public List<TUser> queryByTusers(TUser tuser) {
        return tUserDao.queryByTusers(tuser);
    }

    /**
     * 分页查询
     *
     * @param tUser 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TUser> queryByPage(TUser tUser, PageRequest pageRequest) {
        long total = this.tUserDao.count(tUser);
        return new PageImpl<>(this.tUserDao.queryAllByLimit(tUser, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @Override
    public TUser insert(TUser tUser) {
        this.tUserDao.insert(tUser);
        return tUser;
    }

    /**
     * 修改数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @Override
    public TUser update(TUser tUser) {
        this.tUserDao.update(tUser);
        return this.queryById(tUser.getUserId());
    }

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer userId) {
        return this.tUserDao.deleteById(userId) > 0;
    }
}
