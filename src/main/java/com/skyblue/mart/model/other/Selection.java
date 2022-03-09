package com.skyblue.mart.model.other;

import java.util.ArrayList;
import java.util.List;

public class Selection {
    private List<String> options;

    public Selection(){
       options = new ArrayList<String>();
       options.add("Apple");
       options.add("Banana");
       options.add("Orange");
    }

    @Override
    public String toString() {
        return "Selection{" +
                "options=" + options +
                '}';
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
}
