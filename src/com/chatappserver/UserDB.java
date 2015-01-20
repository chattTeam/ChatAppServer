package com.chatappserver;

public class UserDB {
    private String user_email;
    private String user_fName;
    private String user_lName;
    private String user_password;
    private String user_bod;
    private char user_gender;
    private int user_status;

    public UserDB(String email,String password) {
        this.user_email=email;
        this.user_password=password;
    }
    public UserDB(String email,String fName,String lName,String password,String bod,char gender) {
        this.user_email=email;
        this.user_fName=fName;
        this.user_lName=lName;
        this.user_password=password;
        this.user_bod=bod;
        this.user_gender=gender;
        this.user_status=1;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_fName() {
        return user_fName;
    }

    public void setUser_fName(String user_fName) {
        this.user_fName = user_fName;
    }

    public String getUser_lName() {
        return user_lName;
    }

    public void setUser_lName(String user_lName) {
        this.user_lName = user_lName;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_bod() {
        return user_bod;
    }

    public void setUser_bod(String user_bod) {
        this.user_bod = user_bod;
    }

    public char getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(char user_gender) {
        this.user_gender = user_gender;
    }

    public int getUser_status() {
        return user_status;
    }

    public void setUser_status(int user_status) {
        this.user_status = user_status;
    }
    
}
