package com.thucung.dao;

import java.util.List;

/**
 *
 * @author ๐ Trแบงn Lแบกi ๐
 * @copyright ๐ GirlkuN ๐
 *
 */
public interface IDAOService<O, I> {

    void insert(O o);

    void update(O o);

    void delete(I i);

    List<O> selectAll();

    O selectID(I i);
}
