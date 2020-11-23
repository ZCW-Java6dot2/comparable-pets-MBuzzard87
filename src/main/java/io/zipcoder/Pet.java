package io.zipcoder;
import java.lang.Comparable;
public abstract class Pet implements Comparable<Pet>{
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

    public int compareTo(Pet o) {
        if(this.name.compareTo(o.getName()) > 0) {
            return 1;
        } else if (this.name.compareTo(o.getName()) < 0) {
            return -1;
        } else {
            return this.speak().compareTo(o.speak());
        }
    }
}