package com.man.pojo;

public class Stylecocolum {
    private Integer id;

    private Integer styleid;

    private Integer columnid;

    private String stylename;

    private String takeimgurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStyleid() {
        return styleid;
    }

    public void setStyleid(Integer styleid) {
        this.styleid = styleid;
    }

    public Integer getColumnid() {
        return columnid;
    }

    public void setColumnid(Integer columnid) {
        this.columnid = columnid;
    }

    public String getStylename() {
        return stylename;
    }

    public void setStylename(String stylename) {
        this.stylename = stylename == null ? null : stylename.trim();
    }

    public String getTakeimgurl() {
        return takeimgurl;
    }

    public void setTakeimgurl(String takeimgurl) {
        this.takeimgurl = takeimgurl == null ? null : takeimgurl.trim();
    }
}