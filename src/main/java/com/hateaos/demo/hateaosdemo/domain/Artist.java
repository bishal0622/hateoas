package com.hateaos.demo.hateaosdemo.domain;

public class Artist {

    private final String id;
    private final String name;

    public Artist(final String id, final String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
