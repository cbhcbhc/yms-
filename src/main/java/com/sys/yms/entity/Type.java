package com.sys.yms.entity;

import java.io.Serializable;

public class Type implements Serializable {
    private Integer id;
    private String typeName;
    private String tImageUrl;
    private Integer tState;

    public Type() {
    }

    public Type(Integer id, String typeName, String tImageUrl, Integer tState) {
        this.id = id;
        this.typeName = typeName;
        this.tImageUrl = tImageUrl;
        this.tState = tState;
    }

    @Override
    public String toString() {
        return "type{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", tImageUrl='" + tImageUrl + '\'' +
                ", tState=" + tState +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String gettImageUrl() {
        return tImageUrl;
    }

    public void settImageUrl(String tImageUrl) {
        this.tImageUrl = tImageUrl;
    }

    public Integer gettState() {
        return tState;
    }

    public void settState(Integer tState) {
        this.tState = tState;
    }
}
