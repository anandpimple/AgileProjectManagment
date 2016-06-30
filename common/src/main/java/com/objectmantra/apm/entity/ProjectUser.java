package com.objectmantra.apm.entity;

import com.objectmantra.apm.base.entity.Role;
import com.objectmantra.apm.base.entity.User;
import com.objectmantra.apm.base.entity.Versioned;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by dev on 30/06/16.
 */
@Entity
@Table(name = "PROJECT_USERS",
        uniqueConstraints= @UniqueConstraint(columnNames={"PROJECT", "USER"}))
public class ProjectUser extends Versioned<ProjectUser> {
    @ManyToOne
    @JoinColumn(name = "PROJECT")
    private Project project;
    @ManyToOne
    @JoinColumn(name = "USER")
    private User user;
    @ManyToMany
    private Set<Role> roles;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
