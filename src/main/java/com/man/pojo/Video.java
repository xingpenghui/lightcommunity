package com.man.pojo;

public class Video {
    private Integer id;

    private String videourl;

    private String videoname;

    private Integer styleid;

    private String voidimgurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl == null ? null : videourl.trim();
    }

    public String getVideoname() {
        return videoname;
    }

    public void setVideoname(String videoname) {
        this.videoname = videoname == null ? null : videoname.trim();
    }

    public Integer getStyleid() {
        return styleid;
    }

    public void setStyleid(Integer styleid) {
        this.styleid = styleid;
    }

    public String getVoidimgurl() {
        return voidimgurl;
    }

    public void setVoidimgurl(String voidimgurl) {
        this.voidimgurl = voidimgurl == null ? null : voidimgurl.trim();
    }
}