package com.radionbes.spring.RiverBank.Users;

import com.radionbes.spring.RiverBank.models.Card;
import com.radionbes.spring.RiverBank.models.Contri;
import com.radionbes.spring.RiverBank.models.Credit;
import com.radionbes.spring.RiverBank.models.Mortgage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.*;

@Table(name = "Users")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User implements UserDetails {
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
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "dateOfBirth")
    private String dateOfBirth;
    @Column(name = "floor")
    private String floor;
    @Column(name = "passportSeries")
    private String passportSeries;
    @Column(name = "passportNumber")
    private String passportNumber;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles = new HashSet<>();

    @OneToMany
    private List<Card> cardList = new ArrayList<>();

    @OneToMany()
    private List<Credit> creditList = new ArrayList<>();

    @OneToMany
    private List<Contri> contriList = new ArrayList<>();

    @OneToMany
    private List<Mortgage> mortgageList = new ArrayList<>();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    @Override
    public String getUsername() {
        return getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
