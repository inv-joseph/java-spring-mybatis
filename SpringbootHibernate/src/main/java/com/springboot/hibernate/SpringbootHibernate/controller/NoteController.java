package com.springboot.hibernate.SpringbootHibernate.controller;

import com.springboot.hibernate.SpringbootHibernate.exception.ResourceNotFoundException;
import com.springboot.hibernate.SpringbootHibernate.Model.Note;
import com.springboot.hibernate.SpringbootHibernate.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/api")
public class NoteController {
	//@Autowired
	NoteRepository noteRepository;
    
	//Get All Notes
    @GetMapping("/start")
    public String startNotes() {
        return "Controller started successfully...";
    }
    
	//Get All Notes
    @GetMapping("/notes")
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }
	
	@GetMapping("/notes/{id}")
	public String getNoteById(@PathVariable(value = "id") Long noteId) {
		Note n = noteRepository.findById(noteId).orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
		return n.toString();
	    //return noteRepository.findById(noteId).orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
	}

    // Get All Notes

    // Create a new Note

    // Get a Single Note

    // Update a Note

    // Delete a Note
}
