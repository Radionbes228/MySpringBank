package com.radionbes.spring.RiverBank.services;

import com.radionbes.spring.RiverBank.models.Credit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CreditService {
    private Long countId = 0L;
    List<Credit> creditList = new ArrayList<>();
    {
        creditList.add(new Credit(countId++,"Auto", "Logan"));
        creditList.add(new Credit(countId++,"Home", "Moriarti"));
        creditList.add(new Credit(countId++,"Ipoteka", "Moana"));
    }

    public Credit getCreditForId(Long id){
        for (Credit c: creditList) {
            if (c.getId() == id){
                return c;
            }
        }
        return null;
    }

    public void saveCredit(Credit credit){
        credit.setId(countId++);
        creditList.add(credit);
    }

    public List<Credit> getCrediteList() {
        return creditList;
    }

    public void setCrediteList(List<Credit> creditList) {
        this.creditList = creditList;
    }
}
