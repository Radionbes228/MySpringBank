package com.radionbes.spring.RiverBank.models;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class Contribution {
    private Long id;
    private String name;
    private Integer sum;
    private Float interestRate;
    private Float resultSum;

    public Contribution(Long id, String name, Integer sum, Float interestRate, Float resultSum) {
        this.id = id;
        this.name = name;
        this.sum = sum;
        this.interestRate = interestRate;
        this.resultSum = resultSum;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public void setInterestRate(Float interestRate) {
        this.interestRate = interestRate;
    }

    public void setResultSum(Float resultSum) {
        this.resultSum = resultSum;
    }
}
