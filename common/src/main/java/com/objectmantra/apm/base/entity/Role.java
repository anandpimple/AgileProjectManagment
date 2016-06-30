package com.objectmantra.apm.base.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by dev on 30/06/16.
 */
@Entity
@Table(name="ROLES")
public class Role extends Versioned<Role> {
    @Column(name="ROLE_NAME")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
