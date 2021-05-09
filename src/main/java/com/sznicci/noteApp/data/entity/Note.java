package com.sznicci.noteApp.data.entity;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Note {

    @Id
    private String id;

    private String title;
    private String content;
    private ArrayList<String> tags;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;

    public Note(String title, String content, ArrayList<String> tags, LocalDateTime createdAt, LocalDateTime lastModifiedAt) {
        this.title = title;
        this.content = content;
        this.tags = tags;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getLastModifiedAt() {
        return lastModifiedAt;
    }

    public void setLastModifiedAt(LocalDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", tags=" + tags +
                ", createdAt=" + createdAt +
                ", lastModifiedAt=" + lastModifiedAt +
                '}';
    }
}
