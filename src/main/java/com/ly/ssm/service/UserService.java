package com.ly.ssm.service;

import com.ly.ssm.model.User;
import com.ly.ssm.service.vo.UserVo;

import java.util.List;

/**
 * Created by ly on 2017/11/30.
 */
public interface UserService {

//    List<User> getAllUser();

//    User getUserById(Long userId);

    void save(User user);

    void update(User user);

    User checkLogin(UserVo userVo);

    boolean checkRegister(String userName,String userPWd,String email);

    boolean updatePass(String newPass,String username);
}
