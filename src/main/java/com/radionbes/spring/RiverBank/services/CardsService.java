package com.radionbes.spring.RiverBank.services;

import com.radionbes.spring.RiverBank.models.Cards;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
@RequiredArgsConstructor
public class CardsService {
    private Integer countId = 0;
    private final List<Cards> cardsList = new ArrayList<>(2);
    {
        cardsList.add(new Cards(++countId, 4650));
        cardsList.add(new Cards(++countId, 1000));
        cardsList.add(new Cards(++countId, 50));
    }
}
