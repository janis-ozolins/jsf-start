package com.corejsf;

import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named("user")
@SessionScoped
public class UserBean implements Serializable {
    private String name;
    private String password;

    public String getName() { return name; }
    public void setName(String newValue) { name = newValue; }

    public String getPassword() { return password; }
    public void setPassword(String newValue) { password = newValue; }
}
