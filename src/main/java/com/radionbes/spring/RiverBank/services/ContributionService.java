package com.radionbes.spring.RiverBank.services;

import com.radionbes.spring.RiverBank.models.Contribution;
import com.radionbes.spring.RiverBank.models.Credit;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContributionService {
    private Long countId = 0L;
    @Getter
    private final List<Contribution> list = new ArrayList<>();
    {
        list.add(new Contribution(countId++, "Auto", 100_000, 6.8f, null));
        list.add(new Contribution(countId++, "Home", 1_500_000, 6.8f, null));
        list.add(new Contribution(countId++, "Ipoteka", 15_000_000, 6.8f, null));
    }

    public void saveContribution(Contribution contribution) {
        contribution.setId(countId++);
        list.add(contribution);
    }

    public Contribution getForId(Long id){
        for (Contribution c: list) {
            if (c.getId() == id){
                return c;
            }
        }
        return null;
    }

   /* public void deleteContribution(Long id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                list.remove(i);
            }
        }
    }*/

}
