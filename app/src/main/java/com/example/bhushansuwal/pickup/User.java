package com.example.bhushansuwal.pickup;

import java.util.ArrayList;



public class User {
    int id;
    String username;
    String sports;
    int rep;

    public User(int id, String username, String sports_pref){
        this.id = id;
        this.username = username;
        this.sports = sports_pref;
        rep = 0;
    }

    public String getSports_Pref(){
        return this.sports;
    }


    public void remove_pref(String pref){
        if(sports.contains(pref)){
            sports = pref;
        }
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getRep() {
        return rep;
    }

    public void incrementRep() {
        rep++;
    }
}
