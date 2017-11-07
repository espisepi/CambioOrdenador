/*
 * NoteServiceTest.java
 * 
 * Copyright (C) 2017 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the
 * TDG Licence, a copy of which you may download from
 * http://www.tdg-seville.info/License.html
 */

package services;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import utilities.AbstractTest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"classpath:spring/datasource.xml", "classpath:spring/config/packages.xml"
})
@Transactional
public class NoteServiceTest extends AbstractTest {

	public void testCreate() {
		super.authenticate("customer1");
	}

	public void testSave() {
		// TODO Auto-generated method stub
	}

	public void testDelete() {
		// TODO Auto-generated method stub
	}

	public void testFindByPrincipal() {
		// TODO Auto-generated method stub
	}

	public void testfindOneToEditPositive() {
		// TODO Auto-generated method stub
	}

	public void testfindOneToEditNegative() {
		// TODO Auto-generated method stub
	}

}
