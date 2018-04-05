package com.company;

import java.util.*;

/**
 * Created by mligeza6 on 2018-03-13.
 */
public class ChatEngine implements Comparator<User>{
    HashMap<Long, User> usersID;
    HashMap<String, User> usersName;
    ArrayList<String> ban;
    Queue<String> messages;

    int idcount;

    public ChatEngine() {
        this.usersID = new HashMap<Long, User>();
        this.usersName = new HashMap<String, User>();
        ban = new ArrayList<String>();
        idcount = 0;
    }

    public void addUser(User user) throws UserAddException
    {

        if(usersName.get(user.getName()) != null)
        {
            throw new UserAddException();
        }
        else
        {
            String newName = user.getName();
            user.setCreatedAt(System.currentTimeMillis());
            idcount++;
            user.setId(idcount);
            usersID.put(user.getId(), user);
            usersName.put(user.getName(), user);
        }
    }

    public void removeUser(Long userID) throws UserRemoveException
    {
        String name = usersID.get(userID).getName();
        if(usersID.remove(userID) == null)
            throw new UserRemoveException();
        else
            usersName.remove(usersName);
    }

    public int getNumberOfUsers(){
        return usersID.size();
    }

    public void createBan(String userName)
    {
        if(usersName.containsKey(userName))
        {
            Long toDelete = usersName.get(userName).getId();
            usersName.remove(userName);
            usersID.remove(toDelete);
        }
        ban.add(userName);
    }

    public void removeBan(String userName)
    {
        ban.remove(userName);
    }

    public boolean hasUser(Long userID)
    {
        return (usersID.containsKey(userID));
    }

    public boolean hasUser(String userName)
    {
        return (usersName.containsKey(userName));
    }

    public boolean broadcastMessage(Long userID, String message)
    {
        return true;
    }

    @Override
    public int compare(User o1, User o2) {
        if(o1.getName() == o2.getName())
            return 0;
        else
            return 1;
    }
}
