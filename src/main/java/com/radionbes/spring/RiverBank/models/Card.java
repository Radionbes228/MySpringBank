package com.radionbes.spring.RiverBank.models;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class Card {
    private Long Id;
    private Integer sum;

    public Card(Long id, Integer sum) {
        Id = id;
        this.sum = sum;
    }
}
