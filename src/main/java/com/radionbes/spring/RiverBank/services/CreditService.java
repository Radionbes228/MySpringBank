package com.radionbes.spring.RiverBank.services;

import com.radionbes.spring.RiverBank.models.Credit;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CreditService {
    private Long countId = 0L;
    List<Credit> creditList = new ArrayList<>();
    {
        creditList.add(new Credit(++countId,"Auto",100_000, "Logan",9.8f));
        creditList.add(new Credit(++countId,"Home",1_500_000, "Moriarti",5.0f));
        creditList.add(new Credit(++countId,"Ipoteka",15_000_000,"Moana",2.0f));
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
    public void deleteCredit(Long id){
        for (int i = 0; i < creditList.size(); i++) {
            if (creditList.get(i).getId().equals(id)) {
                creditList.remove(i);
            }
        }
    }
    public List<Credit> getCrediteList() {
        return creditList;
    }
}
