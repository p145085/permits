package org.example.data;

import java.util.List;

public interface GenericCRUD<T, ID> {

    T create(T t);
    List<T> findAll();
    T findByID(ID id);
    boolean delete(ID id);


}
