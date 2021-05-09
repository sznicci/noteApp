package com.sznicci.noteApp;

import com.sznicci.noteApp.data.entity.Note;
import com.sznicci.noteApp.data.repositories.NoteRepository;
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

	public static void main(String[] args) {
		SpringApplication.run(NoteAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		noteRepository.deleteAll();

		noteRepository.save(new Note("title1", "some content", new ArrayList<>(), LocalDateTime.now(), LocalDateTime.now()));
		noteRepository.save(new Note("title2", "content for second note", new ArrayList<>(), LocalDateTime.now().plusMinutes(2), LocalDateTime.now()));

		// all
		System.out.println("findAll()");
		for (Note note : noteRepository.findAll()) {
			System.out.println(note + "\n");
		}

		// by title
		System.out.println("findByTitle()");
		for (Note note : noteRepository.findByTitle("title1")) {
			System.out.println(note + "\n");
		}
	}
}
