package com.FreshermanManagementSystem.Entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name ="Project")
public class Project {
    @Id
    @Column(name = "project")
    private String project;
    @Column(name = "start_date")
    private LocalDate startDate;
    @Column(name = "last_date")
    private LocalDate lastDate;
    @Column(name = "mentor")
    private String mentor;
    @Column(name = "language")
    private String language;
    @Column(columnDefinition = "ENUM('NOT_START', 'ONGOING', 'CANCELED', 'CLOSED')")
    private Status status;

    public Project(String language, LocalDate lastDate, String mentor, String project, LocalDate startDate, Status status) {
        this.language = language;
        this.lastDate = lastDate;
        this.mentor = mentor;
        this.project = project;
        this.startDate = startDate;
        this.status = status;
    }

    public Project() {
        super();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public LocalDate getLastDate() {
        return lastDate;
    }

    public void setLastDate(LocalDate lastDate) {
        this.lastDate = lastDate;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public enum Status {
        NOT_START, ONGOING, CANCELED, CLOSED
    }
}
