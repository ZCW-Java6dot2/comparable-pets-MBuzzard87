package io.zipcoder;
import java.lang.Comparable;
public class Duck extends Pet{



    public Duck(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Quack";
    }



}
