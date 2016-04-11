package com.fassetar.blogger.blog_web_api.models;

import java.util.ArrayList;
import java.util.List;

public class Entry {
    public Id id;
    public Published published;
    public Updated updated;
    public List<Category> category = new ArrayList<>();
    public Title title;
    public Summary summary;
    public List<Link> link = new ArrayList<>();
    public List<Author> author = new ArrayList<>();
    public Georss$featurename georss$featurename;
    public Georss$point georss$point;
    public Georss$box georss$box;
}
