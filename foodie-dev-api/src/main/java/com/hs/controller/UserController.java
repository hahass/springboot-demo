package com.hs.controller;

import com.hs.bean.ServerResponse;
import com.hs.model.UserInfo;
import com.hs.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author RS
 */
@Api(value = "用户管理",tags = "用户管理controller")
@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取用户信息" , notes = "获取用户信息，notes",httpMethod = "GET")
    @GetMapping("get_user")
    public ServerResponse<List<UserInfo>> getUserInfo(){
        return userService.getUserInfo();

    }

    @ApiOperation(value = "获取用户信息" , notes = "获取用户信息，notes",httpMethod = "GET")
    @GetMapping("insert_user")
    public ServerResponse insertUserInfo(){
        return userService.insertUserInfo();
    }


}
