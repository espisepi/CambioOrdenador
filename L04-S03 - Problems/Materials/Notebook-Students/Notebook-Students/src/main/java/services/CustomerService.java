/*
 * CustomerService.java
 * 
 * Copyright (C) 2017 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the
 * TDG Licence, a copy of which you may download from
 * http://www.tdg-seville.info/License.html
 */

package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import repositories.CustomerRepository;
import security.LoginService;
import security.UserAccount;
import domain.Customer;

@Service
@Transactional
public class CustomerService {

	//managed repository-----------
	@Autowired
	private CustomerRepository	customerRepository;


	public Customer findByPrincipal() {
		Customer result;
		UserAccount userAccount;

		userAccount = LoginService.getPrincipal();
		Assert.notNull(userAccount.getId());
		result = this.customerRepository.findByUserAccountId(userAccount.getId());
		Assert.notNull(result);

		return result;
	}
	public Customer findByUserAccount(final UserAccount userAccount) {
		Customer result;

		Assert.notNull(userAccount);
		result = this.customerRepository.findByUserAccountId(userAccount.getId());
		Assert.notNull(result);

		return result;
	}

}
