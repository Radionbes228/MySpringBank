package com.radionbes.spring.RiverBank.services;

import com.radionbes.spring.RiverBank.models.Contri;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContriService {
    private Long id = 0L;
    @Getter
    private List<Contri> contriList = new ArrayList<>();
    public void save(Contri contri){
        contri.setId(++id);
        contriList.add(contri);
    }
    public Contri findById(Long id){
        for (int i = 0; i < contriList.size(); i++) {
            if (contriList.get(i).getId().equals(id)){
                return contriList.get(i);
            }
        }
        return null;
    }
}
