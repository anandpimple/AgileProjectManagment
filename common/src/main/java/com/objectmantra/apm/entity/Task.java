package com.objectmantra.apm.entity;

import com.objectmantra.apm.base.entity.Comment;
import com.objectmantra.apm.base.entity.Versioned;

import java.util.List;
import java.util.Set;

/**
 * Created by dev on 30/06/16.
 */
public class Task extends Versioned<Task>{
    private Story story;
    private Task parentTask;
    private Set<Task> subTasks;
    private Type type = Type.TASK;
    private Status status = Status.NEW;
    private Task dependsOn;
    private List<ProjectUser> assignedTo;
    private List<Comment> comments;
    public enum Type{
        TASK,DEFECT,ENHANCMENT
    }
    public enum Status{
        COMPLETE,PARKED,IN_PROGRESS,IN_TEST,NEW,REJECTED
    }

    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }

    public Task getParentTask() {
        return parentTask;
    }

    public void setParentTask(Task parentTask) {
        this.parentTask = parentTask;
    }

    public Set<Task> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(Set<Task> subTasks) {
        this.subTasks = subTasks;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Task getDependsOn() {
        return dependsOn;
    }

    public void setDependsOn(Task dependsOn) {
        this.dependsOn = dependsOn;
    }

    public List<ProjectUser> getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(List<ProjectUser> assignedTo) {
        this.assignedTo = assignedTo;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
