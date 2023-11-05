package com.radionbes.spring.RiverBank.services;

import com.radionbes.spring.RiverBank.models.Card;
import com.radionbes.spring.RiverBank.models.Credit;
import com.radionbes.spring.RiverBank.repozitories.CreditRepozitories;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
@RequiredArgsConstructor
public class CardsService {
    private Long countId = 0L;
    private final List<Card> cardList = new ArrayList<>();


    public Card getCardFoById(Long id) {
        for (Card card : cardList) {
            if (card.getId() == id) {
                return card;
            }
        }
        return null;
    }

    public void update(Long thisId, Long id, Integer sum){
        for (Card card : cardList) {
            if (card.getId().equals(thisId)) {
                card.setSum(card.getSum() - sum);
            }
        }
        for (Card card : cardList) {
            if (card.getId().equals(id)) {
                card.setSum(card.getSum() + sum);
            }
        }
    }
}
