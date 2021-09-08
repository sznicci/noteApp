package com.sznicci.noteApp.data.repositories;

import com.sznicci.noteApp.data.entity.Owner;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OwnerRepository extends MongoRepository<Owner, String> {
}
