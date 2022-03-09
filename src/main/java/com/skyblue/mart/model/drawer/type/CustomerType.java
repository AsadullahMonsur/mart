package com.skyblue.mart.model.drawer.type;

import java.util.ArrayList;
import java.util.List;

public class CustomerType {
    private List<String> all_options;
    private List<String> options;
    private List<Boolean> options_check_flag;
    private List<Boolean> all_options_check_flag;

    public CustomerType() {
        all_options = new ArrayList<String>();
        all_options_check_flag = new ArrayList<Boolean>();

        options = new ArrayList<String>();
        options_check_flag = new ArrayList<Boolean>();

        all_options.add("Select All");
        all_options_check_flag.add(false);


        options.add("Male");
        options.add("Female");
        options.add("Children");
        options_check_flag.add(false);
        options_check_flag.add(false);
        options_check_flag.add(false);

    }

    @Override
    public String toString() {
        return "CustomerType{" +
                "all_options=" + all_options +
                ", options=" + options +
                '}';
    }

    public List<String> getAll_options() {
        return all_options;
    }

    public void setAll_options(List<String> all_options) {
        this.all_options = all_options;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public List<Boolean> getOptions_check_flag() {
        return options_check_flag;
    }

    public void setOptions_check_flag(List<Boolean> options_check_flag) {
        this.options_check_flag = options_check_flag;
    }

    public List<Boolean> getAll_options_check_flag() {
        return all_options_check_flag;
    }

    public void setAll_options_check_flag(List<Boolean> all_options_check_flag) {
        this.all_options_check_flag = all_options_check_flag;
    }
}
