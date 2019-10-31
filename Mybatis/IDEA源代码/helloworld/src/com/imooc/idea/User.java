package com.imooc.idea;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

    }

    public User(String username) {
        this.username = username;
    }

    private String password;

    @Override
    public int hashCode() {
        //生成HashCode代码
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
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

    public static final String USERNAME ="";
    
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

        }
        List list = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            List<String> arrayList = new ArrayList();
        }
    }
}
