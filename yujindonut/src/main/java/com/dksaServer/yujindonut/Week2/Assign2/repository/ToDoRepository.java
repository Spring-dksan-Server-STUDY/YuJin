package com.dksaServer.yujindonut.Week2.Assign2.repository;

import com.dksaServer.yujindonut.Week2.Assign2.model.ToDoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class ToDoRepository implements ToDoRepositoryInterface {

    private final EntityManager em;

    public ToDoDTO findOne(Long idx) {
        return em.find(ToDoDTO.class, idx);
    }
    @Override
    public List<ToDoDTO> findAll() {
        return em.createQuery("select t from ToDoDTO t", ToDoDTO.class).getResultList();
    }

    @Override
    public Long insertTodo(@RequestBody final ToDoDTO toDo) {
        System.out.println("Todo: " + toDo);
        ToDoDTO data = new ToDoDTO();
        data.setContent(toDo.getContent());
        data.setCompleted(toDo.getCompleted());
        data.setWrite_date(new Date());
        em.persist(data);
        return toDo.getIdx();
    }

    @Override
    public Long updateTodo(Long idx, ToDoDTO toDo) {
        em.createQuery("UPDATE ToDoDTO t " + "SET t.content = :content, t.write_date = :date, t.completed = :completed "
                + "WHERE t.idx = :idx")
                .setParameter("idx", idx)
                .setParameter("content",toDo.getContent())
                .setParameter("date", new Date())
                .setParameter("completed", toDo.getCompleted())
                .executeUpdate();
        return toDo.getIdx();
    }

    @Override
    public Long deleteTodoByIdx(Long idx) {
        em.createQuery("DELETE FROM ToDoDTO WHERE idx = :idx")
                .setParameter("idx", idx).executeUpdate();
        return idx;
    }

    @Override
    public void deleteAll() {
        em.createQuery("DELETE FROM ToDoDTO ").executeUpdate();
    }
}
