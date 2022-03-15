package com.todo.todo.service;
import com.todo.todo.DAO.TodoDAO;
import com.todo.todo.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
@Service
public class TodoserviceImpl implements Todoservice{

    private TodoDAO todoDAO;
    @Autowired
    public TodoserviceImpl(TodoDAO theTodoDAO){
        todoDAO=theTodoDAO;
    }
    @Transactional
    public List<Todo> findAll() {
        return todoDAO.findAll();
    }


}
