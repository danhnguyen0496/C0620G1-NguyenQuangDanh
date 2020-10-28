package com.dem_so_luot_view_trang.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyCounter {

    @Id
    private int count;

    public MyCounter() {
    }

    public MyCounter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int increment() {
        return count++;
    }
}
