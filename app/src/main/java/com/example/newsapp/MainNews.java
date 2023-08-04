package com.example.newsapp;

import java.util.ArrayList;

public class MainNews {

    private String status;
    private String totalResult;
    ArrayList<ModelClass> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(String totalResult) {
        this.totalResult = totalResult;
    }

    public ArrayList<ModelClass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ModelClass> articles) {
        this.articles = articles;
    }

    public MainNews(String status, String totalResult, ArrayList<ModelClass> articles) {
        this.status = status;
        this.totalResult = totalResult;
        this.articles = articles;
    }
}
