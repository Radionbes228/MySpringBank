package com.radionbes.spring.RiverBank.models;

import com.radionbes.spring.RiverBank.Users.User;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Table(name = "Cards")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Id;
    @Column(name = "sum")
    private Integer sum;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private User nameOwner;
}
