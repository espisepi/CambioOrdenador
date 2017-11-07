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
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import repositories.NoteRepository;
import domain.Customer;
import domain.Note;

@Service
@Transactional
public class NoteService {

	//managed repository-----------
	@Autowired
	private NoteRepository	noteRepository;

	//Supporting services---------
	@Autowired
	private CustomerService	customerService;


	public Note create(final Customer customer) {
		final Note result;
		result = new Note();
		//Habría que añadir a customer la note y guardar ese customer en la bd?
		result.setCustomer(customer);

		return result;
	}

	public Note save(final Note note) {
		Note result;
		Assert.notNull(note);
		note.setMoment(new Date(System.currentTimeMillis() - 1000));
		result = this.noteRepository.save(note);
		Assert.notNull(result.getId());

		return result;
	}

	public void delete(final Note note) {
		Assert.isTrue(note.equals(this.noteRepository.findOne(note.getId())));
		this.noteRepository.delete(note);
	}

	public Collection<Note> findByPrincipal() {
		Collection<Note> result;
		Customer customerPrincipal;

		customerPrincipal = this.customerService.findByPrincipal();
		Assert.notNull(customerPrincipal);
		result = this.noteRepository.findByCustomerId(customerPrincipal.getId());
		return result;
	}
	public Note findOneToEdit(final int noteId) {
		final Note result;
		Customer customerPrincipal;

		customerPrincipal = this.customerService.findByPrincipal();
		Assert.notNull(customerPrincipal);
		result = this.noteRepository.findOne(noteId);
		Assert.isTrue(customerPrincipal.getNotes().contains(result));
		return result;
	}
	public void checkPrincipal(final int noteId) {
		Customer customerPrincipal;
		final Note note;

		customerPrincipal = this.customerService.findByPrincipal();
		Assert.notNull(customerPrincipal);
		note = this.noteRepository.findOne(noteId);
		Assert.isTrue(customerPrincipal.getNotes().contains(note));

	}
}
