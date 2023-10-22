package com.radionbes.spring.RiverBank.models;


import lombok.Data;
@Data
public class Credit {
    private Long id;
    private String creditName;
    private String loanOwner;

    public Credit(Long id, String creditName, String loanOwner) {
        this.id = id;
        this.creditName = creditName;
        this.loanOwner = loanOwner;
    }

}
