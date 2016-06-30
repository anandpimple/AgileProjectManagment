package com.objectmantra.apm.entity;

import com.objectmantra.apm.base.entity.User;
import com.objectmantra.apm.base.entity.Versioned;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

/**
 * Created by dev on 30/06/16.
 */
@Entity
@Table(name = "PROJECTS")
@XStreamAlias("Project")
public class Project extends Versioned<Project> {
    private String projectName;
    private String projectDescription;
    private Set<ProjectUser> users;
    private Set<Story> stories;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public Set<ProjectUser> getUsers() {
        return users;
    }

    public void setUsers(Set<ProjectUser> users) {
        this.users = users;
    }
}
