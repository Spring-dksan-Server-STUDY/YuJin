package com.dksaServer.yujindonut.Week2.Assign2.controller;

import com.dksaServer.yujindonut.Week2.Assign2.model.ToDoDTO;
import com.dksaServer.yujindonut.Week2.Assign2.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Rest전용 Controller 기능을 부여하는 Annotation
// @Controller + @ResponseBody
@RequestMapping("todo")
@RequiredArgsConstructor
public class ToDoController {

    private final TodoService todoService;

    @RequestMapping(value = "", method = {RequestMethod.GET})
    public List<ToDoDTO> findAll() {
        System.out.println("FIND ALL");
        List<ToDoDTO> list = this.todoService.findAll();
        return list;
    }

    @PostMapping("insert")
    public Long insert(@RequestBody final ToDoDTO toDoDTO){
        Long todoIdx = this.todoService.insertTodo(toDoDTO);
        return todoIdx;
    }

    @PutMapping("update/{idx}")
    public ResponseEntity<Long> update(@PathVariable("idx") Long idx, @RequestBody final ToDoDTO request) {
        System.out.println("UPDATE");
        System.out.println(idx);
        Long result = this.todoService.updateTodo(idx, request);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("delete/{idx}")
    public ResponseEntity<Long> deleteOne(@PathVariable("idx") Long idx) {
        System.out.println("DELETE");
        this.todoService.deleteById(idx);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("delete")
    public ResponseEntity<?> deleteAll() {
        System.out.println("DELETE ALL");
        this.todoService.deleteAll();
        return ResponseEntity.ok().build();
    }

}
