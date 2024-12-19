package com.secure.note.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
public class NoteRequest {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
