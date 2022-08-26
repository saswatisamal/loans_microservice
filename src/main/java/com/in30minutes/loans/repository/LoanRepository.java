package com.in30minutes.loans.repository;

import org.springframework.data.repository.CrudRepository;

import com.in30minutes.loans.model.Loans;
import java.util.List;

public interface LoanRepository  extends CrudRepository<Loans,Integer>{
  List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);
}
