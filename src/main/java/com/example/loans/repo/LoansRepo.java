package com.example.loans.repo;

import com.example.loans.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoansRepo  extends JpaRepository<Loan,Long> {
}
