package com.radionbes.spring.RiverBank.Users;

import com.radionbes.spring.RiverBank.models.Card;
import com.radionbes.spring.RiverBank.models.Contri;
import com.radionbes.spring.RiverBank.models.Credit;
import com.radionbes.spring.RiverBank.models.Mortgage;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.List;

@Table(name = "Users")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class UserBank {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "surname")
    private String surname;
    @Column(name = "name")
    private String name;
    @Column(name = "patronymic")
    private String patronymic;
    @Column(name = "dateOfBirth")
    private String dateOfBirth;
    @Column(name = "floor")
    private String floor;
    @Column(name = "passportSeries")
    private String passportSeries;
    @Column(name = "passportNumber")
    private String passportNumber;


    @OneToMany(cascade = CascadeType.ALL)
    private List<Card> cardList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Credit> creditList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Contri> contriList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Mortgage> mortgageList = new ArrayList<>();

    public void setFloor(Boolean floor) {
        if (floor) this.floor = "Man";
        else this.floor = "Woman";
    }
}
