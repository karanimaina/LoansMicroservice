package com.example.loans.commons;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UniversalResponse {
    private  int status;
    private  Object data;
    private  String message;
}
