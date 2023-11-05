package com.radionbes.spring.RiverBank.models;

import com.radionbes.spring.RiverBank.Users.UserBank;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Credit")
@Data
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "creditName")
    private String creditName;
    @Column(name = "loanAmount")
    private Integer loanAmount;
    @Column(name = "interestRate")
    private Float interestRate;
    @Column(name = "duration")
    private Integer duration;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private UserBank owner;

}
