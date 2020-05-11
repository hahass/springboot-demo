package com.hs.service;

import com.hs.bean.ServerResponse;
import com.hs.model.UserInfo;

import java.util.List;

/**
 * @author RS
 */
public interface UserService {

     ServerResponse<List<UserInfo>>  getUserInfo();


     ServerResponse insertUserInfo();

     ServerResponse insertUserInfo(String name);

     ServerResponse insertUserInfo1(String name);
}
