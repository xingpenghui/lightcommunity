package com.man.pojo;

public class Button {
    private Integer id;

    private String share;

    private String collect;

    private Integer givenum;

    private Integer comment;

    private Integer columnid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share == null ? null : share.trim();
    }

    public String getCollect() {
        return collect;
    }

    public void setCollect(String collect) {
        this.collect = collect == null ? null : collect.trim();
    }

    public Integer getGivenum() {
        return givenum;
    }

    public void setGivenum(Integer givenum) {
        this.givenum = givenum;
    }

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }

    public Integer getColumnid() {
        return columnid;
    }

    public void setColumnid(Integer columnid) {
        this.columnid = columnid;
    }
}