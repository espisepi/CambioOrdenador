/*
 * NoteRepository.java
 * 
 * Copyright (C) 2017 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the
 * TDG Licence, a copy of which you may download from
 * http://www.tdg-seville.info/License.html
 */

package repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer> {

	//Se deja el findOne porque se utiliza en la clase StringToNoteConverter, no se pondria si solo se utilizase en tiempo de ejecución
	@Override
	Note findOne(Integer id);

	@Query("select n from Customer c join c.notes n where c.id=?1")
	Collection<Note> findByCustomerId(int customerId);

}
