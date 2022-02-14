package com.thucung.event;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN  💖
 *
 */
public interface IEventControI {
    public enum Chose{
        ADD, UPDATE, DELETE, ADDTOSHOPPINGCART, CLEAR, FILTER, NULL, BAN, ACTIVE,
        STOPCOOPERATE, COOPERATE, ACCEPT, TOP, EXPORT, MY, CHANGEPASSWORD, SHOW
    }
    
    public void selected(Chose chose);
}
