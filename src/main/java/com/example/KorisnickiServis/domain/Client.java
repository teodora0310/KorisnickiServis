package com.example.KorisnickiServis.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Client {

    private String cardId;
    private String NumberScheduledTrainings;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getNumberScheduledTrainings() {
        return NumberScheduledTrainings;
    }

    public void setNumberScheduledTrainings(String numberScheduledTrainings) {
        NumberScheduledTrainings = numberScheduledTrainings;
    }
}
