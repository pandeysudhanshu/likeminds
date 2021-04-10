package com;

import java.util.ArrayList;


public class users {
    user addUser;
    ArrayList<user> userArrayList = new ArrayList();


    public void adduser(String userName, String Role){
        addUser.setUserName(userName);
        addUser.setUserRole(Role);
        userArrayList.add(addUser);
    }


    public boolean checkifAdmin(String username) {
        for(int i=0;i<userArrayList.size();i++){

            if(userArrayList.get(i).getUserName()==username){
                if(userArrayList.get(i).getUserRole()=="ADMIN"){
                    return true;
                }
            }

        }
        return false;
    }
}
