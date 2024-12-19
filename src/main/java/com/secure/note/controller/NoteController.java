package com.secure.note.controller;

import com.secure.note.dto.NoteRequest;
import com.secure.note.model.Note;
import com.secure.note.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @PostMapping("/create")
    public ResponseEntity<Note> createNoteForUser(
            @RequestBody NoteRequest noteRequest,
            @AuthenticationPrincipal UserDetails userDetails) {
        String username = userDetails.getUsername();
        Note newNote = noteService.createNoteForUser(username, noteRequest.getContent());
        return ResponseEntity.ok(newNote);
    }

    @PutMapping("/update/{noteId}")
    public ResponseEntity<Note> updateNoteForUser(
            @PathVariable Long noteId,
            @RequestBody NoteRequest noteRequest,
            @AuthenticationPrincipal UserDetails userDetails) {
        String username = userDetails.getUsername();
        Note updatedNote = noteService.updateNoteForUser(noteId, noteRequest.getContent(), username);
        return ResponseEntity.ok(updatedNote);
    }

    @DeleteMapping("/delete/{noteId}")
    public ResponseEntity<Void> deleteNoteForUser(
            @PathVariable Long noteId,
            @AuthenticationPrincipal UserDetails userDetails) {
        String username = userDetails.getUsername();
        noteService.deleteNoteForUser(noteId, username);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/user")
    public ResponseEntity<List<Note>> getNotesForUser(@AuthenticationPrincipal UserDetails userDetails) {
        String username = userDetails.getUsername();
        List<Note> notes = noteService.getNotesForUser(username);
        System.out.println("Notes returned: " + notes);  // Log the response object
        return ResponseEntity.ok(notes);
    }

}