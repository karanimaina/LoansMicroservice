package com.example.loans.services;

import com.example.loans.model.Loan;
import com.example.loans.repo.LoansRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoanService {
    private final LoansRepo loansRepo;

    public List<Loan> getLoans(){
       return loansRepo.findAll();
    }
    public Loan getLoan(long id){
        return loansRepo.findById(id).orElse(null);
    }
    public Loan addLoan(Loan loan){
        return loansRepo.save(loan);
    }
    public Loan addLoan(long loanId){
       loansRepo.deleteById(loanId);
    }




}
