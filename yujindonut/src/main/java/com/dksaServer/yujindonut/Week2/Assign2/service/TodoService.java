package com.dksaServer.yujindonut.Week2.Assign2.service;

import com.dksaServer.yujindonut.Week2.Assign2.model.ToDoDTO;
import com.dksaServer.yujindonut.Week2.Assign2.repository.ToDoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class TodoService implements ToDoServiceInterface{

    private ToDoRepository toDoRepository;

    @Autowired
    public TodoService(ToDoRepository toDoRepository){
        this.toDoRepository = toDoRepository;
    }

    @Override
    public List<ToDoDTO> findAll() {
        List<ToDoDTO> todoList = toDoRepository.findAll();
        return todoList;
    }

    @Override
    public Long insertTodo(ToDoDTO toDo) {
        return toDoRepository.insertTodo(toDo);
    }

    @Override
    public Long updateTodo(Long idx, ToDoDTO toDo) {
        return toDoRepository.updateTodo(idx, toDo);
    }

    @Override
    public Long deleteById(Long idx) {
        return toDoRepository.deleteTodoByIdx(idx);
    }

    @Override
    public void deleteAll() {
        toDoRepository.deleteAll();
    }
}
