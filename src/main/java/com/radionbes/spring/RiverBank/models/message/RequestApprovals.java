package com.radionbes.spring.RiverBank.models.message;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Table(name = "MessageForUsers")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class RequestApprovals {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    @Column(name = "message")
    private String message;
    @Column(name = "dateForMessage")
    private Date dateForMessage = new Date();
    @Column(name = "creditID")
    private Long creditID;
    @Column(name = "isConsidered")
    private Boolean isConsidered = false;
}

