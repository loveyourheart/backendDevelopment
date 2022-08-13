package com.example.backenddevelopment.daoimp;

public class Collect {
    private Integer aid;
    private Integer id;
    private String add_data;
    private String context;
    private String poster;
    private String title;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdd_data() {
        return add_data;
    }

    public void setAdd_data(String add_data) {
        this.add_data = add_data;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Collect{" +
                "aid=" + aid +
                ", id=" + id +
                ", add_data='" + add_data + '\'' +
                ", context='" + context + '\'' +
                ", poster='" + poster + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
