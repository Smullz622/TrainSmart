/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.Action;
import model.User;
import model.UserHashMap;
import view.UserDetailUI;
import view.UserLoginUI;

/**
 *
 * @author Sarah
 */
public class UserCtrl
{

    UserHashMap userHashMap;
    HashMap<String, User> userMap;
    UserLoginUI loginUI;
    User currentUser;
    String currentKey;
    UserDetailUI detailUI;
    boolean success;

    public UserCtrl()
    {
        userHashMap = new UserHashMap();
        userMap = userHashMap.getUserMap();
        loginUI = new UserLoginUI();

        loginButtons();

    }

    public void loginButtons()
    {
        loginUI.loginBtn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                currentKey = loginUI.usernameBox.getText();
                if (userMap.containsKey(currentKey))
                {
                    currentUser = userMap.get(currentKey);
                    if (!currentUser.getPassword().equals(loginUI.passwordBox.getText()))
                    {
                        loginUI.errorMsg.setText("Incorrect Password. Please try again.");
                    } else
                    {                        
                        loginUI.errorMsg.setText(" ");
                        detailUI = new UserDetailUI(currentUser);
                        //get rid of detailUI visible & detailButtons() and trigger workout controller
                        success = true;
//                        detailUI.setVisible(true);
//                        loginUI.setVisible(false);
//                        detailButtons();
                    }                   
                } else
                {
                    loginUI.errorMsg.setText("Error. Username not found.");
                }
            }

        });
        loginUI.newUserBtn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
//                userMap.put(" ", new User());
                currentUser = new User();
                detailUI = new UserDetailUI(currentUser);               
                detailUI.setVisible(true);
                loginUI.setVisible(false);
                detailButtons();
            }
            
        });
    }
    
    public void detailButtons()
    {
        currentKey = detailUI.usernameBox.getText();
        
        detailUI.deleteBtn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                currentKey = detailUI.usernameBox.getText();
                if (userMap.containsKey(currentKey)){
                    userMap.remove(currentKey);
                    detailUI.setVisible(false);
                    loginUI.setVisible(true);
                }
            }
            
        });
        detailUI.updateBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String previousKey = currentKey;
                currentKey = detailUI.usernameBox.getText();
                System.out.println(previousKey);
                System.out.println(currentKey);
                if (!userMap.containsKey(currentKey))
                {                    
                    userMap.put(currentKey, currentUser);
                    if (userMap.containsKey(previousKey))
                    {
                        userMap.remove(previousKey);
                    }
                }
                currentUser.setUsername(detailUI.usernameBox.getText());
                currentUser.setPassword(detailUI.passwordBox.getText());
                currentUser.setName(detailUI.nameBox.getText());
                currentUser.setBirthDate(detailUI.birthdateBox.getText());
                System.out.println(userMap);
            }
            
        });
        detailUI.backBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
               detailUI.setVisible(false);
               loginUI.setVisible(true);
               loginUI.usernameBox.setText("");
               loginUI.passwordBox.setText("");
            }
            
        });
    }
    
    public boolean getSuccess(){
        return success;
    }
    
    public UserLoginUI getLoginUI(){
        return loginUI;
    }

}
