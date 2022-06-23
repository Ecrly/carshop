package com.karl.carshop.entity;

import java.io.Serializable;

public class Comment extends BaseEntity implements Serializable {

    private Integer cid;
    private Integer fkGoodsComment;
    private Integer fkUserComment;
    private Double score;
    private String content;
    private String commentState;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getFkGoodsComment() {
        return fkGoodsComment;
    }

    public void setFkGoodsComment(Integer fkGoodsComment) {
        this.fkGoodsComment = fkGoodsComment;
    }

    public Integer getFkUserComment() {
        return fkUserComment;
    }

    public void setFkUserComment(Integer fkUserComment) {
        this.fkUserComment = fkUserComment;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCommentState() {
        return commentState;
    }

    public void setCommentState(String commentState) {
        this.commentState = commentState;
    }
}
