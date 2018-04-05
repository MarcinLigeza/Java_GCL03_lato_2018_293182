package com.company;

public class Main {

    public static void main(String[] args) throws UserAddException {

        ChatEngine chatEngine = new ChatEngine();
        User user = new User("ja");
        chatEngine.addUser(user);

        System.out.println();
    }
}
