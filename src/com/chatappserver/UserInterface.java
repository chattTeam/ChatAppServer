/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chatappserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author HMA
 */
public interface UserInterface extends Remote{
    //user login return 1 if email and password are true else return 0 and send notifacation to all his/her friends
    //note:- when user login successfuly call sendUserOnlineNotif() function
    public int signIn()throws RemoteException;
    //a new user can registery for first time 
    public int signup(UserDB user)throws RemoteException;
    //add new friend and wait while friend accept
    public void addFriend(String friend_email)throws RemoteException;
    //when user login successfuly display his/her friends with his/her status
    public void showFriendList(String user_email)throws RemoteException;
    //send notifacation to all his/her friends when user login successfuly
    public void sendUserOnlineNotif(String user_email)throws RemoteException;
    //to change user status ex: available,busy,...
    public void changeStatus(String user_email);
    //user logout disconnnect and show login form and change status to offline status
    public int logout(UserDB user)throws RemoteException;
    
}
