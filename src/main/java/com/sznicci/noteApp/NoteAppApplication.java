package com.sznicci.noteApp;

import com.sznicci.noteApp.data.entity.Note;
import com.sznicci.noteApp.data.entity.Owner;
import com.sznicci.noteApp.data.entity.Tag;
import com.sznicci.noteApp.data.repositories.NoteRepository;
import com.sznicci.noteApp.data.repositories.OwnerRepository;
import com.sznicci.noteApp.data.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.ArrayList;

@SpringBootApplication
public class NoteAppApplication implements CommandLineRunner {

	@Autowired
	private NoteRepository noteRepository;
	@Autowired
	private TagRepository tagRepository;
	@Autowired
	private OwnerRepository ownerRepository;

	public static void main(String[] args) {
		SpringApplication.run(NoteAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		noteRepository.deleteAll();
		tagRepository.deleteAll();
		ownerRepository.deleteAll();

		Tag redTag = new Tag("personal", "red");
		Tag blueTag = new Tag("work", "blue");
		tagRepository.save(redTag);
		tagRepository.save(blueTag);
		ArrayList<Tag> tags1 = new ArrayList<>();
		tags1.add(redTag);
		tags1.add(blueTag);

		ArrayList<Tag> tags2 = new ArrayList<>();
		tags2.add(blueTag);

		Owner owner1 = new Owner("Alan");
		Owner owner2 = new Owner("Aang");
		ownerRepository.save(owner1);
		ownerRepository.save(owner2);

		noteRepository.save(new Note(owner1,"title1", "some content", tags1, LocalDateTime.now(), LocalDateTime.now()));
		noteRepository.save(new Note(owner2, "title2", "content for second note", tags2, LocalDateTime.now().plusMinutes(2), LocalDateTime.now().plusMinutes(2).plusSeconds(5)));

		// all
		System.out.println("findAll()");
		for (Note note : noteRepository.findAll()) {
			System.out.println(note + "\n");
		}

		// by owner
		System.out.println("findByOwner()");
		for (Note note : noteRepository.findByOwner("Alan")) {
			System.out.println(note + "\n");
		}

		// by title
		System.out.println("findByTitle()");
		for (Note note : noteRepository.findByTitle("title1")) {
			System.out.println(note + "\n");
		}
	}
}
