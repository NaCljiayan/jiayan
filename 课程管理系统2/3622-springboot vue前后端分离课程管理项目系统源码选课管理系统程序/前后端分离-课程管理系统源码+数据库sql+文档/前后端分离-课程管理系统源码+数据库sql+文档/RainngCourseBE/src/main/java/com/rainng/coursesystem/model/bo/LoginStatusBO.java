package com.rainng.coursesystem.model.bo;

import com.rainng.coursesystem.model.constant.UserType;
import lombok.Data;

import java.io.Serializable;

@Data
public class LoginStatusBO implements Serializable {
    private Boolean loggedIn = false;
    private Integer userId;
    private String username;
    private Integer userType = UserType.NO;
    private Integer permission = 0;

    public static LoginStatusBO fromAuthInfo(AuthInfoBO authInfo) {
        LoginStatusBO loginStatus = new LoginStatusBO();
        loginStatus.loggedIn = true;
        loginStatus.userId = authInfo.getId();
        loginStatus.username = authInfo.getUsername();
        loginStatus.userType = authInfo.getUserType();
        loginStatus.permission = authInfo.getPermission();

        return loginStatus;
    }

	public Boolean getLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(Boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Integer getPermission() {
		return permission;
	}

	public void setPermission(Integer permission) {
		this.permission = permission;
	}
    
    
}
