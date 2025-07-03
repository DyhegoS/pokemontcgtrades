package com.reginasofts.pokemontcgtrades.entities;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_trades")
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private User proposer;
    private User receiver;

    private TradeItem cardProposer;
    private TradeItem cardReceiver;

    private Instant createAt;
    private Instant finishAt;
    
    public Trade(Long id, User proposer, User receiver, TradeItem cardProposer, TradeItem cardReceiver) {
        this.id = id;
        this.proposer = proposer;
        this.receiver = receiver;
        this.cardProposer = cardProposer;
        this.cardReceiver = cardReceiver;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getProposer() {
        return proposer;
    }

    public void setProposer(User proposer) {
        this.proposer = proposer;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public TradeItem getCardProposer() {
        return cardProposer;
    }

    public void setCardProposer(TradeItem cardProposer) {
        this.cardProposer = cardProposer;
    }

    public TradeItem getCardReceiver() {
        return cardReceiver;
    }

    public void setCardReceiver(TradeItem cardReceiver) {
        this.cardReceiver = cardReceiver;
    }

    public Instant getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Instant createAt) {
        this.createAt = createAt;
    }

    public Instant getFinishAt() {
        return finishAt;
    }

    public void setFinishAt(Instant finishAt) {
        this.finishAt = finishAt;
    }

    
}
