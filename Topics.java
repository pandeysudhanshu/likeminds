package com;

import java.util.ArrayList;
import java.util.HashMap;

public class Topics {
    Topic addTopic;
    ArrayList<Topic> topicArrayList = new ArrayList();


    void addTopic(String Topic){
        addTopic.setTopicName(Topic);
        topicArrayList.add(addTopic);
    }

    public HashMap<Topic, ArrayList<user>> getTopicArrayListHashMap() {
        return topicArrayListHashMap;
    }

    public void setTopicArrayListHashMap(HashMap<Topic, ArrayList<user>> topicArrayListHashMap) {
        this.topicArrayListHashMap = topicArrayListHashMap;
    }

    HashMap<Topic,ArrayList<user>> topicArrayListHashMap = new HashMap<>();


    public  void assingUsersToTopic(String topic, String username, String role) {

       if(topicArrayListHashMap.containsKey(topic)){
           ArrayList<user> userList = topicArrayListHashMap.get(topic);
           user user =  new user();
           user.setUserRole(role);
           user.setUserName(username);
           userList.add(user);
       }

    }

    public void sendmessage(String topic, String message) {

        if(topicArrayListHashMap.containsKey(topic)){
            ArrayList<user> userList = topicArrayListHashMap.get(topic);
            for(int i=0;i<userList.size();i++){
                System.out.println("Message sent to " + userList.get(i).getUserName() + " " + message);
            }
        }

    }
}
