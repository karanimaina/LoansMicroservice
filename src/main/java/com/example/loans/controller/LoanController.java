package com.example.loans.controller;

import com.example.commons.controller.UniversalResponse;
import com.example.loans.commons.UniversalResponse;
import com.example.loans.services.LoanService;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api")
public class LoanController{
    private final LoanService  loanService;
 ResponseEntity<UniversalResponse>
}
