package com.example.loans.repo;

import com.example.loans.model.Loan;
import com.example.loans.model.Loans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoansRepo  extends JpaRepository<Loan,Long> {
}
