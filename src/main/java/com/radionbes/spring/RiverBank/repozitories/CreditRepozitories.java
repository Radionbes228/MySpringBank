package com.radionbes.spring.RiverBank.repozitories;

import com.radionbes.spring.RiverBank.Users.User;
import com.radionbes.spring.RiverBank.models.Credit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CreditRepozitories extends JpaRepository<Credit, Long> {
    List<Credit> findCreditsByOwnerId(Long isOwner);
    List<Credit> findCreditsBy();
}
