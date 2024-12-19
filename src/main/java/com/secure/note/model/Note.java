package com.secure.note.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String content;

    private String ownerUsername;

    public void setContent(String content) {
        this.content = content;
    }
    public void setOwnerUsername (String ownerUsername) {
        this.ownerUsername = ownerUsername;
    }

}
