package com.radionbes.spring.RiverBank.models;

import lombok.Data;
import lombok.Getter;

@Data
public class Cards {
    private Integer Id;
    private Integer sum;

    public Cards(Integer id, Integer sum) {
        Id = id;
        this.sum = sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getId() {
        return Id;
    }

    public Integer getSum() {
        return sum;
    }
}
