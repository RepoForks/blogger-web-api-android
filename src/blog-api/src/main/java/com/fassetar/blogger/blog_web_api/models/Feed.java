package com.fassetar.blogger.blog_web_api.models;

import java.util.ArrayList;
import java.util.List;

public class Feed {
    public String xmlns;
    public String xmlns$openSearch;
    public String xmlns$blogger;
    public String xmlns$georss;
    public String xmlns$gd;
    public String xmlns$thr;
    public Id id;
    public Updated updated;
    public List<Category> category = new ArrayList<Category>();
    public Title title;
    public Subtitle subtitle;
    public List<Link> link = new ArrayList<Link>();
    public List<Author> author = new ArrayList<Author>();
    public Generator generator;
    public OpenSearch$totalResults openSearch$totalResults;
    public OpenSearch$startIndex openSearch$startIndex;
    public OpenSearch$itemsPerPage openSearch$itemsPerPage;
    public List<Entry> entry = new ArrayList<Entry>();
}
