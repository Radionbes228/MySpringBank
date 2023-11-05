package com.radionbes.spring.RiverBank.services;

import com.radionbes.spring.RiverBank.models.Mortgage;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
@Slf4j
@RequiredArgsConstructor
public class MortgageService {
    Logger logger = Logger.getLogger("log");
    private Long countId = 0L;
    @Getter
    private final List<Mortgage> list = new ArrayList<>();


    public void saveContribution(Mortgage mortgage) {
        mortgage.setId(++countId);
        list.add(mortgage);
    }

    public Mortgage getForId(Long id){
        logger.log(Level.ALL, "Pizdec");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)){
                return list.get(i);
            }
        }
        return null;
    }
     public void deleteContribution(Long id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                list.remove(i);
            }
        }
    }

}
