package com.hs.model;

import java.io.Serializable;
import java.util.Date;

/**
*UserInfo
* @author hs
* @since 2020/04/19
*/
public class UserInfo implements Serializable {
    /**
    *id
    */
    private String id;

    /**
    *username
    */
    private String username;

    /**
    *password
    */
    private String password;

    /**
    *微信openid
    */
    private String openid;

    /**
    *1买家2卖家
    */
    private Boolean role;

    /**
    *创建时间
    */
    private Date createTime;

    /**
    *修改时间
    */
    private Date updateTime;

    /**
    *serialVersionUID
    */
    private static final long serialVersionUID = 1L;

    /**
    * getId
    * @return String String
    */
    public String getId() {
        return id;
    }

    /**
    * setId
    * @param id id
    */
    public void setId(String id) {
        this.id = id;
    }

    /**
    * getUsername
    * @return String String
    */
    public String getUsername() {
        return username;
    }

    /**
    * setUsername
    * @param username username
    */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
    * getPassword
    * @return String String
    */
    public String getPassword() {
        return password;
    }

    /**
    * setPassword
    * @param password password
    */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
    * getOpenid
    * @return String String
    */
    public String getOpenid() {
        return openid;
    }

    /**
    * setOpenid
    * @param openid openid
    */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
    * getRole
    * @return Boolean Boolean
    */
    public Boolean getRole() {
        return role;
    }

    /**
    * setRole
    * @param role role
    */
    public void setRole(Boolean role) {
        this.role = role;
    }

    /**
    * getCreateTime
    * @return Date Date
    */
    public Date getCreateTime() {
        return createTime;
    }

    /**
    * setCreateTime
    * @param createTime createTime
    */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
    * getUpdateTime
    * @return Date Date
    */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
    * setUpdateTime
    * @param updateTime updateTime
    */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
    * equals
    * @param that that
    * @return boolean boolean
    */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserInfo other = (UserInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getRole() == null ? other.getRole() == null : this.getRole().equals(other.getRole()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
    * hashCode
    * @return int int
    */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
    * toString
    * @return String String
    */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", openid=").append(openid);
        sb.append(", role=").append(role);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}