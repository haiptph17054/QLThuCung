package com.thucung.event;

/**
 *
 * @author ๐ Trแบงn Lแบกi ๐
 * @copyright ๐ GirlkuN  ๐
 *
 */
public interface IEventControI {
    public enum Chose{
        ADD, UPDATE, DELETE, ADDTOSHOPPINGCART, CLEAR, FILTER, NULL, BAN, ACTIVE,
        STOPCOOPERATE, COOPERATE, ACCEPT, TOP, EXPORT, MY, CHANGEPASSWORD, SHOW
    }
    
    public void selected(Chose chose);
}
