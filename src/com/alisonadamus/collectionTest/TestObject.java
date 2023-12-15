package com.alisonadamus.collectionTest;

import java.util.Random;

public class TestObject {
    private int id;
    private String name;

    public TestObject() {
        this.id = new Random().nextInt(10000);
        this.name = "test" + getId();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return getName();
    }
}
