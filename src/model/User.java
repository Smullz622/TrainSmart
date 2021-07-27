/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Sarah
 */
public class User extends Person
{

    private String username;
    private String password;

    public User(String username, String password, String name, String birthDate, String gender, String email)
    {
        super(name, birthDate, gender, email);
        this.username = username;
        this.password = password;
    }

    public User()
    {
        super();
        this.username = "User";
        this.password = "t3mPD3f@u1t";
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    //check if username exists in existing users. All usernames must be unique.
    public boolean exists(ArrayList<User> registeredUsers, String desiredUsername)
    {
        boolean check = false;
        for (int i = 0; i < registeredUsers.size(); ++i)
        {
            if (registeredUsers.get(i).getUsername().compareTo(desiredUsername) == 0)
            {
                check = true;
                System.out.println("An account with this username already exists. Please use a different username");
            }
        }
        return check;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nUser{" + "username: " + username + ", password: " + password + '}';
    }

    //needed methods:
        //check password for strength
}
