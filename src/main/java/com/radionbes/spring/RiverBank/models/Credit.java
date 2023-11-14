package com.radionbes.spring.RiverBank.models;

import com.radionbes.spring.RiverBank.Users.User;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Credit")
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    @Column(name = "activated")
    private Boolean activated = true;

    @ManyToOne(targetEntity = Credit.class)
    private Long owner;

}
