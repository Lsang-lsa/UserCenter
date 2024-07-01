package com.lsang.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lsang.usercenter.model.domain.User;

import javax.servlet.http.HttpServletRequest;

/**
* @author lsa_1
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2024-03-14 16:41:10
*/
public interface UserService extends IService<User> {
    /**
     * 用户注册
     *
     * @param userAccount   用户账号
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount 用户账号
     * @param userPassword 用户密码
     * @param request 请求
     * @return 用户
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);

    /**
     * 用户脱敏
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);
}
