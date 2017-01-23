package com.xwtech.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table t_pic_cache.
 */
public class PicCache {

    private Long id;
    private Long time;
    private String url;
    private String hashCode;
    private String filePath;

    public PicCache() {
    }

    public PicCache(Long id) {
        this.id = id;
    }

    public PicCache(Long id, Long time, String url, String hashCode, String filePath) {
        this.id = id;
        this.time = time;
        this.url = url;
        this.hashCode = hashCode;
        this.filePath = filePath;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHashCode() {
        return hashCode;
    }

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

}
