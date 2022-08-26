package com.in30minutes.loans.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loans {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="loan_number")
private int loanNumber;

@Column(name="cust_Id",nullable=false)
private int customerId;

@Column(name="start_dt",nullable=false)
private LocalDate startDate;

@Column(name="create_dt",nullable=false)
private LocalDate createDt;

@Column(name="amount_paid",nullable=false)
private double  amountPaid;

@Column(name="total_loan",nullable=false)
private double totalLoan ;

@Column(name="loan_type")
private String loanType;

}
