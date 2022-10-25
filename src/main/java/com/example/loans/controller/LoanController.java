package com.example.loans.controller;

import com.example.loans.commons.UniversalResponse;
import com.example.loans.model.Loan;
import com.example.loans.services.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api")
public class LoanController{
    private final LoanService  loanService;
@GetMapping("/get/loans")
    ResponseEntity<UniversalResponse>getLoans(){
     List<Loan>loans =loanService.getLoans();
     return ResponseEntity.ok().body(UniversalResponse.builder().status(200).data(loans).message("dataretrieved successfull").build());
 }
   @GetMapping("/get/{id}")
    ResponseEntity<UniversalResponse>getLoan(@PathVariable("id") long id){
        Loan loans =loanService.getLoan(id);
        return ResponseEntity.ok().body(UniversalResponse.builder().status(200).data(loans).message("dataretrieved successfull").build());
    }
    @PostMapping("/add/loan ")
    ResponseEntity<UniversalResponse>addLoan(@RequestBody Loan loan){
        Loan loan1 =loanService.addLoan(loan);
        return ResponseEntity.ok().body(UniversalResponse.builder().status(200).data(loan1).message("loan added successfull").build());
    }
    @DeleteMapping("/delete/{id}")
    ResponseEntity<UniversalResponse>DeleteLoan( @PathVariable("id") Long loanId){
        loanService.deleteLoan(loanId);
       return ResponseEntity.ok().body(UniversalResponse.builder().status(200).message("loan deleted successfull").build());
    }
}
