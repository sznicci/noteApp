package com.sznicci.noteApp.data.repositories;

import com.sznicci.noteApp.data.entity.Tag;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TagRepository extends MongoRepository<Tag, String> {
}
