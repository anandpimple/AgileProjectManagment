package com.objectmantra.apm.base.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by dev on 30/06/16.
 */
@Entity
@Table(name = "USERS")
public class User extends Versioned<User> {
    @Column(name="USER_NAME")
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
