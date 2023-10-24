package com.radionbes.spring.RiverBank.models;

import lombok.Data;

import java.time.Instant;
@Data
public class Credit {
    private Long id;
    private String creditName;
    private Integer loanAmount;
    private Integer duration;
    private String loanOwner;
    private Double interestRate;
    private Instant instant;
    public Credit(Long id, String creditName, Integer loanAmount, String loanOwner, Double interestRate, Instant instant) {
        this.id = id;
        this.creditName = creditName;
        this.loanAmount = loanAmount;
        this.loanOwner = loanOwner;
        this.interestRate = interestRate;
        this.instant = instant;
    }
}
