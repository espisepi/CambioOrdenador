/*
 * NoteService.java
 * 
 * Copyright (C) 2017 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the
 * TDG Licence, a copy of which you may download from
 * http://www.tdg-seville.info/License.html
 */

package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import repositories.NoteRepository;
import domain.Customer;
import domain.Note;

@Service
@Transactional
public class NoteService {

	//managed repository-----------
	@Autowired
	private NoteRepository	noteRepository;


	public Note create(final Customer customer) {
		final Note result;

		return null;
	}

	public Note save(final Note note) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(final Note note) {
		// TODO Auto-generated method stub
	}

	public Collection<Note> findByPrincipal() {
		// TODO Auto-generated method stub
		return null;
	}

	public Note findOneToEdit(final int noteId) {
		// TODO Auto-generated method stub
		return null;
	}

}
