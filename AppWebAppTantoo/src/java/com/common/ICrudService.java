package com.common;

import java.util.List;

/**
 *
 * @author MARCELO
 */
public interface ICrudService<T> {

   void create(T x) throws Exception;

    void update(T x) throws Exception;

    void delete(int id) throws Exception;

    T findForId(T x) throws Exception;

    List<T> readAll() throws Exception;    
}
