package com.radionbes.spring.RiverBank.models;

import com.radionbes.spring.RiverBank.Users.UserBank;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Cards")

@Data
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Id;
    @Column(name = "sum", columnDefinition = "number")
    private Integer sum;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private UserBank nameOwner;
}
