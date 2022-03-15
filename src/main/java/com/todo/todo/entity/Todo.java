package com.todo.todo.entity;
import javax.persistence.*;

@Entity
@Table(name="todo")
public class Todo{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "description")
    private String description;

    @Column(name = "is_done")
    private String is_done;

    @Column(name = "target_date")
    private String target_date;

    public Todo(){};//No arg constructor

    public Todo(String description, String is_done, String target_date) {
        this.description = description;
        this.is_done = is_done;
        this.target_date = target_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIs_done() {
        return is_done;
    }

    public void setIs_done(String is_done) {
        this.is_done = is_done;
    }

    public String getTarget_date() {
        return target_date;
    }

    public void setTarget_date(String target_date) {
        this.target_date = target_date;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", is_done='" + is_done + '\'' +
                ", target_date='" + target_date + '\'' +
                '}';
    }
}
