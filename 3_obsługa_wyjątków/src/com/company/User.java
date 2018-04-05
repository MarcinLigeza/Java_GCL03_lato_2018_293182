package com.company;

import com.sun.webkit.Timer;

import java.util.Comparator;

/**
 * Created by mligeza6 on 2018-03-13.
 */
public class User{
    Long id;
    String name;
    long createdAt;
    int numberofSentMessages;

    public User( String name) {
        this.id = id;
        this.name = name;
        this.numberofSentMessages = 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public int getNumberofSentMessages() {
        return numberofSentMessages;
    }

    public void setNumberofSentMessages(int numberofSentMessages) {
        this.numberofSentMessages = numberofSentMessages;
    }




}
