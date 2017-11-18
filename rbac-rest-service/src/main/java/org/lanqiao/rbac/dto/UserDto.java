package org.lanqiao.rbac.dto;

import org.lanqiao.rbac.entity.Account;
import org.lanqiao.rbac.entity.UserProfile;

public class UserDto extends Account {
    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    private UserProfile userProfile;

}
