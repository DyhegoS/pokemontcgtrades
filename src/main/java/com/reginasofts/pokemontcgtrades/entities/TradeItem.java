package com.reginasofts.pokemontcgtrades.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_trade_item")
public class TradeItem {
    private Card card;

    public TradeItem(Card card) {
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    
    
}
