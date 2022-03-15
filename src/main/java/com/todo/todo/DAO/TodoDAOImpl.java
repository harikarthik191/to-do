package com.todo.todo.DAO;
import com.todo.todo.entity.Todo;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class TodoDAOImpl implements TodoDAO {

    private EntityManager entityManager;

    public TodoDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    public List<Todo> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<Todo> theQuery = currentSession.createQuery("from Todo", Todo.class);
        List<Todo> todos = theQuery.getResultList();
        return todos;
    }


}











