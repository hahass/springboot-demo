package com.hs.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author RS
 */
@ApiModel(value = "用户管理返回参数" , description = "从客户端，获取用户西您先")
public class UserRsp {

    @ApiModelProperty(value = "用户名" , name = "username",example = "hs" , required = true)
    private String name;

    @ApiModelProperty(value = "密码" , name = "password",example = "hs1234" , required = true)
    private String password;
}
