package com.man.pojo;

public class Music {
    private Integer id;

    private String songname;

    private String songimg;

    private String musicurl;

    private String songwords;

    private Integer styleid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSongname() {
        return songname;
    }

    public void setSongname(String songname) {
        this.songname = songname == null ? null : songname.trim();
    }

    public String getSongimg() {
        return songimg;
    }

    public void setSongimg(String songimg) {
        this.songimg = songimg == null ? null : songimg.trim();
    }

    public String getMusicurl() {
        return musicurl;
    }

    public void setMusicurl(String musicurl) {
        this.musicurl = musicurl == null ? null : musicurl.trim();
    }

    public String getSongwords() {
        return songwords;
    }

    public void setSongwords(String songwords) {
        this.songwords = songwords == null ? null : songwords.trim();
    }

    public Integer getStyleid() {
        return styleid;
    }

    public void setStyleid(Integer styleid) {
        this.styleid = styleid;
    }
}