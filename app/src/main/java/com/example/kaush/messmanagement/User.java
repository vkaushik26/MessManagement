package com.example.kaush.messmanagement;

/**
 * Created by kaush on 20-03-2018.
 */

public class User {
    private String Name;
    private String Roll_no;
    private String Email;
    private String Password;

    public User() {
    }

    public User(String name, String roll_no, String email, String password) {
        Name = name;
        Roll_no = roll_no;
        Email = email;
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRoll_no() {
        return Roll_no;
    }

    public void setRoll_no(String roll_no) {
        Roll_no = roll_no;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
