package com.radionbes.spring.RiverBank.services;

import com.radionbes.spring.RiverBank.models.Credit;
import com.radionbes.spring.RiverBank.repozitories.CreditRepozitories;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CreditService {
    private final CreditRepozitories creditRepozitories;

    public List<Credit> creditList (Long idUser){
        if (creditRepozitories.findCreditsByOwnerId(idUser) != null){
            List<Credit> returnList = new ArrayList<>();
            for (Credit o: creditRepozitories.findCreditsByOwnerId(idUser)) {
                if (o.getActivated()) returnList.add(o);
            }
            return returnList;
        }
        return null;
    }

    public void saveCredit(Credit credit){
        log.info("Saving new credit{}", credit);
        creditRepozitories.save(credit);
    }

    public void deleteCredit(Long id){
        creditRepozitories.deleteById(id);
    }

    public Credit getCredit(Long id) {
        return creditRepozitories.findById(id).orElse(null);
    }
}
