package com.radionbes.spring.RiverBank.services;

import com.radionbes.spring.RiverBank.models.Contribution;
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
public class ContributionService {
    Logger logger = Logger.getLogger("log");
    private Long countId = 0L;
    @Getter
    private final List<Contribution> list = new ArrayList<>();
    {
        list.add(new Contribution(++countId, "Auto", 100_000, 6.8f));
        list.add(new Contribution(++countId, "Home", 1_500_000, 6.8f));
        list.add(new Contribution(++countId, "Ipoteka", 15_000_000, 6.8f));
    }

    public void saveContribution(Contribution contribution) {
        contribution.setId(++countId);
        list.add(contribution);
    }

    public Contribution getForId(Long id){
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
