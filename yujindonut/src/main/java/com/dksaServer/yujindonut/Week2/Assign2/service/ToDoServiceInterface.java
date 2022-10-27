package com.dksaServer.yujindonut.Week2.Assign2.service;

import com.dksaServer.yujindonut.Week2.Assign2.model.ToDoDTO;

import java.util.List;

public interface ToDoServiceInterface {
    public List<ToDoDTO> findAll();
    public Long insertTodo(ToDoDTO toDo);
    public Long updateTodo(Long idx, ToDoDTO toDo);
    public Long deleteById(Long idx);
    public void deleteAll();
}
