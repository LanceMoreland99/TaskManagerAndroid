package com.example.lancemoreland.taskmanagerproject;

import java.util.Date;

public class TaskInfo {

    private String title;
    private String details;
    private Date dueDate;
    private Date dateCreated;
    private Date dateCompleted;

    public TaskInfo(String title, String details, Date dueDate, Date dateCreated, Date dateCompleted) {
        this.title = title;
        this.details = details;
        this.dueDate = dueDate;
        this.dateCreated = dateCreated;
        this.dateCompleted = dateCompleted;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }
}
