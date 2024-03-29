package com.zsq.provider.entity;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author zsq
 * @date 2019/6/10 - 0:12
 */
@Table(name="t_user")
public class User {
    @Id
    private Integer id;
    private String username;
    private String password;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
