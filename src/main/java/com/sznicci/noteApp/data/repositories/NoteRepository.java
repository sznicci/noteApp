package com.sznicci.noteApp.data.repositories;

import com.sznicci.noteApp.data.entity.Note;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface NoteRepository extends MongoRepository<Note, String> {

    @Query("{'owner.name': ?0}")
    public List<Note> findByOwner(String name);
    public List<Note> findByTitle(String title);
}
