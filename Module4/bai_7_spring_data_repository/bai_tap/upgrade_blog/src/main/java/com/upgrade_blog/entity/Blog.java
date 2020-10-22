package com.upgrade_blog.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private String name;
    private String description;
    private LocalDateTime localDateTime;

    @ManyToOne
    @JoinColumn(name = "blog_id", referencedColumnName = "id")
    private Category category;

    public Blog() {
    }

    public Blog(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDateTime getLocalDateTime() {
        return LocalDateTime.now();
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
