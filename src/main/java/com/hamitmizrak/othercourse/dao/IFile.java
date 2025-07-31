package com.hamitmizrak.othercourse.dao;

import java.util.List;

public interface IFile<T> {

    // FILE CREATE
    public void save(T t);

    // FILE READ
    public List<T> findAll();
}
