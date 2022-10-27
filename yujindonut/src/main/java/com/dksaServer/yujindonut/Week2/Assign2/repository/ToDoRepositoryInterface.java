package com.dksaServer.yujindonut.Week2.Assign2.repository;

import com.dksaServer.yujindonut.Week2.Assign2.model.ToDoDTO;

import java.util.List;

public interface ToDoRepositoryInterface {

    public List<ToDoDTO> findAll();
    public Long insertTodo(ToDoDTO toDo);
    public Long updateTodo(Long idx, ToDoDTO toDo);
    public Long deleteTodoByIdx(Long idx);
    public void deleteAll();
}
