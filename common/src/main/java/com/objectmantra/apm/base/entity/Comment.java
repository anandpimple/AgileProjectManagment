package com.objectmantra.apm.base.entity;

import com.objectmantra.apm.entity.ProjectUser;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by dev on 30/06/16.
 */
@Entity
@Table(name="COMMENTS")
public class Comment extends BaseEntity{
    private String comment;
    private ProjectUser commentedBy;
    private Date commentedOn;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ProjectUser getCommentedBy() {
        return commentedBy;
    }

    public void setCommentedBy(ProjectUser commentedBy) {
        this.commentedBy = commentedBy;
    }

    public Date getCommentedOn() {
        return commentedOn;
    }

    public void setCommentedOn(Date commentedOn) {
        this.commentedOn = commentedOn;
    }
}
