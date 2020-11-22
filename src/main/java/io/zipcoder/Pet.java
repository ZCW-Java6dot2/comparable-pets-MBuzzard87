package io.zipcoder;
import java.lang.Comparable;
public class Pet {
    String name;
    String speak = "koo koo ka choo";


    public Pet(String name) {
        this.name = name;
    }

    public String speak() {
        return this.speak;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





}
