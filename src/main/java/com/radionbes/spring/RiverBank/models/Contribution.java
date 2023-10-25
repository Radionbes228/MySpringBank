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

    public Contribution(Long id, String name, Integer sum, Float interestRate, Float resultSum) {
        this.id = id;
        this.name = name;
        this.sum = sum;
        this.interestRate = interestRate;
    }
}
