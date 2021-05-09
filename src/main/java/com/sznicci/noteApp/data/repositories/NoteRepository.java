package com.sznicci.noteApp.data.repositories;

import com.sznicci.noteApp.data.entity.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NoteRepository extends MongoRepository<Note, String> {

    public List<Note> findByTitle(String title);
}
