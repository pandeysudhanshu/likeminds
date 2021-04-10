package com;

import java.io.IOException;

import static javafx.application.Platform.exit;

public class MainClass {

    Topics topics;
    users users;

    int c =1;
    int k =1;
    do{

        System.out.println("Begin");
        System.out.println("1. Enter one to add user");
        System.out.println("2. Enter two to add topic");
        System.out.println("3. Enter three to assign topic");
        System.out.println("4. Enter four to send message to subs");
        System.out.println("5. Enter five to exit");
        try {
            c = System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }


        if(c==1){
            String username = null,role = null;
            System.out.println("Enter the role");
            try {
                role = String.valueOf(System.in.read());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Enter the userName");
            try {
                username = String.valueOf(System.in.read());
            } catch (IOException e) {
                e.printStackTrace();
            }
            users.adduser(username,role);
            System.out.println("User was added successfully");
        }

        else if(c==2){
           String topic = null,username=null;
           System.out.println("Enter the topic name");
            try {
                topic = String.valueOf(System.in.read());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Enter the user name");
            try {
                username = String.valueOf(System.in.read());
            } catch (IOException e) {
                e.printStackTrace();
            }

            if(users.checkifAdmin(username)){
                topics.addTopic(topic);
            }


        }

        else if(c==3){
            String topic = null,username=null,role=null;
            System.out.println("Enter the topic name");
            try {
                topic = String.valueOf(System.in.read());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Enter the user name");
            try {
                username = String.valueOf(System.in.read());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Enter the role");
            try {
                role = String.valueOf(System.in.read());
            } catch (IOException e) {
                e.printStackTrace();
            }

            topics.assingUsersToTopic(topic,username,role);


        }


        else if(c==4){
            String topic = null,message=null;
            System.out.println("Enter the topic name");
            try {
                topic = String.valueOf(System.in.read());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Enter the message");
            try {
                message = String.valueOf(System.in.read());
            } catch (IOException e) {
                e.printStackTrace();
            }

            topics.sendmessage(topic,message);


        }

        else if(c==5){
            exit();
        }

    }while(true);



}
