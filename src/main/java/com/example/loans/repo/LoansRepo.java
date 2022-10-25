package com.example.loans.repo;

import com.example.loans.model.Loans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoansRepo  extends JpaRepository<Loans,Long> {
}
