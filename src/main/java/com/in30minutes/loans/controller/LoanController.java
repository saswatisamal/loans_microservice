package com.in30minutes.loans.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in30minutes.loans.model.Loans;
import com.in30minutes.loans.repository.LoanRepository;

@RestController
public class LoanController {
	
	@Autowired
	private LoanRepository loanRepo;
	
	@GetMapping(path="/myLoans/{customerId}")
	public List<Loans> LoansList(@PathVariable String customerId){
		return loanRepo.findByCustomerIdOrderByStartDtDesc(Integer.parseInt(customerId));
		
	}

}
