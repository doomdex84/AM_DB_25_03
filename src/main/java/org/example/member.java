package org.example;

public class member {


    int loginid;
    String password;
    String name;

    public member(int loginid, String password, String name) {
        this.loginid = loginid;
        this.password = password;
        this.name = name;
    }

    public int getLoginid() {
        return loginid;
    }

    public void setLoginid(int loginid) {
        this.loginid = loginid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
