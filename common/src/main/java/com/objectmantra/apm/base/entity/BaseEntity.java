package com.objectmantra.apm.base.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;

/**
 * Created by dev on 29/06/16.
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;
    @Version
    private Integer version;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
