package com.company;

/**
 * Created by mligeza6 on 2018-03-13.
 */
public class UserAddException extends ChatException {

    public UserAddException()
    {
        super("Nie udało się dodać użytkownika");
    }
}
