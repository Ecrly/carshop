package com.karl.carshop.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * 商品评价实体类
 */
public class Comment extends BaseEntity implements Serializable {

    /**
     * 评价id
     */
    private Integer cid;

    /**
     * 关联商品id
     */
    private Integer gid;

    /**
     * 关联用户id
     */
    private Integer uid;

    /**
     * 评分
     */
    private Double score;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论状态
     */
    private String commentState;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Comment comment = (Comment) o;
        return Objects.equals(cid, comment.cid) && Objects.equals(gid, comment.gid) && Objects.equals(uid, comment.uid) && Objects.equals(score, comment.score) && Objects.equals(content, comment.content) && Objects.equals(commentState, comment.commentState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cid, gid, uid, score, content, commentState);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "cid=" + cid +
                ", gid=" + gid +
                ", uid=" + uid +
                ", score=" + score +
                ", content='" + content + '\'' +
                ", commentState='" + commentState + '\'' +
                '}';
    }
}
