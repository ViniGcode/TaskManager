package br.tasks.dto;

import java.time.LocalDate;

public class TaskDTO {
    private String title;
    private String description;
    private Boolean completed;
    private LocalDate dateOfConclusion;

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Boolean getCompleted() { return completed; }
    public void setCompleted(Boolean completed) { this.completed = completed; }

    public LocalDate getDateOfConclusion() { return dateOfConclusion; }
    public void setDateOfConclusion(LocalDate dateOfConclusion) { this.dateOfConclusion = dateOfConclusion; }
}