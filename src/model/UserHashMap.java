/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;

/**
 *
 * @author Sarah
 */
public class UserHashMap
{
    private HashMap<String, User> userMap = new HashMap();

    public UserHashMap()
    {
       userMap.put("smulligan622", new User("smulligan622", "p@ssw0rd", "Sarah Smulligan", "06-22-93", "smm5878@psu.edu"));
       userMap.put("user123", new User("user123", "passphrase", "Jane Doe", "01-01-80", "jad123@psu.edu"));
    }

//    private void createMap()
//    {
//        userMap.put("smulligan622", new User("smulligan622", "p@ssw0rd", "Sarah Smulligan", "06-22-93", "smm5878@psu.edu"));
//        userMap.put("user123", new User("user123", "passphrase", "Jane Doe", "01-01-80", "jad123@psu.edu"));
//    }

    public HashMap<String, User> getUserMap()
    {
        return userMap;
    }

    public void setUserMap(HashMap<String, User> userMap)
    {
        this.userMap = userMap;
    }
    
    
    
    
}
