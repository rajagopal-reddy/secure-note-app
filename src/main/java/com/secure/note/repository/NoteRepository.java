package com.secure.note.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.secure.note.model.Note;
import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findByOwnerUsername(String ownerUsername);
}

