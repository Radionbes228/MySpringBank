package com.radionbes.spring.RiverBank.models;

import com.radionbes.spring.RiverBank.Users.UserBank;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Mortgage")
@Data
public class Mortgage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "sum")
    private Integer sum;
    @Column(name = "interestRate")
    private Float interestRate;
    @Column(name = "duration")
    private Integer duration;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private UserBank owner;

}
