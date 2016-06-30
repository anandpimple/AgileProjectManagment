package com.objectmantra.apm.base.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by dev on 30/06/16.
 */
@MappedSuperclass
public abstract class Versioned<T extends Serializable> extends BaseEntity {
    @Version
    private Integer version;
    @Column(name="CREATED_ON",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn = new Date();
    @Column(name="MODIFIED_ON",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn = new Date();
    @Column(name="CREATED_BY",nullable = false)
    private User createdBy;
    @Column(name="MODIFIED_BY")
    private User modifiedBy;
//    @OneToMany
//    private List<T> history;
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public User getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(User modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}
