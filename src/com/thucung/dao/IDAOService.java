package com.thucung.dao;

import java.util.List;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public interface IDAOService<O, I> {

    void insert(O o);

    void update(O o);

    void delete(I i);

    List<O> selectAll();

    O selectID(I i);
}
