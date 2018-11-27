package com.sun.project.entity;

public class QmTs {
    private Long id;

    private Long musicId;

    private Integer musicType;

    private Integer tsType;

    private String tsFileUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMusicId() {
        return musicId;
    }

    public void setMusicId(Long musicId) {
        this.musicId = musicId;
    }

    public Integer getMusicType() {
        return musicType;
    }

    public void setMusicType(Integer musicType) {
        this.musicType = musicType;
    }

    public Integer getTsType() {
        return tsType;
    }

    public void setTsType(Integer tsType) {
        this.tsType = tsType;
    }

    public String getTsFileUrl() {
        return tsFileUrl;
    }

    public void setTsFileUrl(String tsFileUrl) {
        this.tsFileUrl = tsFileUrl == null ? null : tsFileUrl.trim();
    }
}