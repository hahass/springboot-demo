package com.hs.service;

import com.google.gson.Gson;
import com.hs.bean.ServerResponse;
import com.hs.mapper.UserInfoMapper;
import com.hs.model.UserInfo;
import com.hs.model.UserInfoExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author RS
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService{


    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserService userService;

    @Override
    public ServerResponse<List<UserInfo>> getUserInfo() {


        UserInfoExample example = new UserInfoExample();

        List<UserInfo>  infos = userInfoMapper.selectByExample(example);


        log.info("查询用户：{}", (new Gson()).toJson(infos) );

        return ServerResponse.createBySuccess(infos);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ServerResponse insertUserInfo() {

        userService.insertUserInfo("name"+System.currentTimeMillis());
        userService.insertUserInfo1("name"+System.currentTimeMillis());

        return ServerResponse.createBySuccess();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ServerResponse insertUserInfo(String name) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername(name);
        userInfo.setId(""+System.currentTimeMillis());
        userInfoMapper.insertSelective(userInfo);
        return ServerResponse.createBySuccess();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ServerResponse insertUserInfo1(String name) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername(name);
        userInfo.setId(""+System.currentTimeMillis());
        userInfoMapper.insertSelective(userInfo);
        int i = 1/0;
        return ServerResponse.createBySuccess();
    }
}
