package com.radionbes.spring.RiverBank.services;

import com.radionbes.spring.RiverBank.models.Card;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
@RequiredArgsConstructor
public class CardsService {
    private Long countId = 0L;
    private final List<Card> cardList = new ArrayList<>();

    {
        cardList.add(new Card(++countId, 4650));
        cardList.add(new Card(++countId, 1000));
        cardList.add(new Card(++countId, 50));
    }

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
