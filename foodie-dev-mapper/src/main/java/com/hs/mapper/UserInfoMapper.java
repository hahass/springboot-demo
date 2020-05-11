package com.hs.mapper;

import com.hs.model.UserInfo;
import com.hs.model.UserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
*UserInfoMapper
* @author hs
* @since 2020/04/19
*/
public interface UserInfoMapper {
    /**
    * countByExample
    * @param example example
    * @return long long
    */
    long countByExample(UserInfoExample example);

    /**
    * deleteByExample
    * @param example example
    * @return int int
    */
    int deleteByExample(UserInfoExample example);

    /**
    * deleteByPrimaryKey
    * @param id id
    * @return int int
    */
    int deleteByPrimaryKey(String id);

    /**
    * insert
    * @param record record
    * @return int int
    */
    int insert(UserInfo record);

    /**
    * insertSelective
    * @param record record
    * @return int int
    */
    int insertSelective(UserInfo record);

    /**
    * selectByExample
    * @param example example
    * @return List<UserInfo> List<UserInfo>
    */
    List<UserInfo> selectByExample(UserInfoExample example);

    /**
    * selectByPrimaryKey
    * @param id id
    * @return UserInfo UserInfo
    */
    UserInfo selectByPrimaryKey(String id);

    /**
    * updateByExampleSelective
    * @param record record
    * @param example example
    * @return int int
    */
    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
    * updateByExample
    * @param record record
    * @param example example
    * @return int int
    */
    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
    * updateByPrimaryKeySelective
    * @param record record
    * @return int int
    */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
    * updateByPrimaryKey
    * @param record record
    * @return int int
    */
    int updateByPrimaryKey(UserInfo record);
}