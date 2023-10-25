package com.radionbes.spring.RiverBank.models;

import lombok.Data;

@Data
public class Credit {
    private Long id;
    private String creditName;
    private Integer loanAmount;
    private Integer duration;
    private String loanOwner;
    private Float interestRate;
    public Credit(Long id, String creditName, Integer loanAmount, String loanOwner, Float interestRate) {
        this.id = id;
        this.creditName = creditName;
        this.loanAmount = loanAmount;
        this.loanOwner = loanOwner;
        this.interestRate = interestRate;
    }
}
