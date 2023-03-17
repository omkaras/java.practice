package com.os.java.practice;

public class APIInfo {
    private String name;
    private String url;
    private String context;

    public APIInfo() {
    }

    public APIInfo(String name, String url, String context) {
        this.name = name;
        this.url = url;
        this.context = context;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
