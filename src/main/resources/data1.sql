DROP TABLE IF EXISTS loans;

  CREATE TABLE loans (
  customer_id bigint NOT NULL,
  loan_number bigint AUTO_INCREMENT,
  create_dt date DEFAULT NULL,
  start_dt date DEFAULT NULL,
  amount_paid int NOT NULL, 
  total_loan int NOT NULL,
  loan_type varchar(100) NOT NULL,
  PRIMARY KEY (loan_number)
 
);

 INSERT INTO loans (customer_id,account_number,account_type, branch_address, create_dt)
 VALUES (1,18976056411,'2022-01-12','2022-03-13',222000,300000'Home');
 
 INSERT INTO accounts (customer_id,account_number,account_type, branch_address, create_dt)
 VALUES (1,18976056412,'Loan','123 Main Street, New York', CURDATE());
 
 INSERT INTO accounts (customer_id,account_number,account_type, branch_address, create_dt)
 VALUES (2,18976056431,'Savings','123 Main Street, New York', CURDATE());
 
 INSERT INTO accounts (customer_id,account_number,account_type, branch_address, create_dt)
 VALUES (2,18976056432,'Loan','123 Main Street, New York', CURDATE());
 
 
 INSERT INTO accounts (customer_id,account_number,account_type, branch_address, create_dt)
 VALUES (3,18976056415,'Savings','123 Main Street, New York', '2022-07-12');




