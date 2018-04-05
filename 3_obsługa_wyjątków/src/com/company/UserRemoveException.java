package com.company;

/**
 * Created by mligeza6 on 2018-03-13.
 */
public class UserRemoveException extends ChatException {
    public UserRemoveException()
    {
        super("Nie udało się usunąć użytkowanika");
    }
}
