package com.objectmantra.apm.entity;

import com.objectmantra.apm.base.entity.Versioned;

import java.util.Set;

/**
 * Created by dev on 30/06/16.
 */

public class Story extends Versioned<Story>{
    private String storyDescription;
    private String storyName;
    private Project project;
    private Set<Task> tasks;

    public String getStoryDescription() {
        return storyDescription;
    }

    public void setStoryDescription(String storyDescription) {
        this.storyDescription = storyDescription;
    }

    public String getStoryName() {
        return storyName;
    }

    public void setStoryName(String storyName) {
        this.storyName = storyName;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }
}
