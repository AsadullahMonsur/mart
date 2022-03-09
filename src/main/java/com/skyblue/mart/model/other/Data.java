package com.skyblue.mart.model.other;

public class Data {
    private  String search_txt;

    public String getSearch_txt() {
        return search_txt;
    }

    public void setSearch_txt(String search_txt) {
        this.search_txt = search_txt;
    }

    @Override
    public String toString() {
        return "Data{" +
                "search_txt='" + search_txt + '\'' +
                '}';
    }
}
