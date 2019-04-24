package com.pl.product.repository;

import com.pl.product.entity.User;

import java.util.List;

public interface UserMapper {

    /**
     * 新增用户
     * @param user
     * @return
     */
    int save(User user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    int update(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteById(int id);

    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    User selectById(int id);

    /**
     * 根据账号查找用户
     * @param username
     * @param password
     * @return
     */
    User selectByAcounnt(String username,String password);

    List<User> selectAll();
}
