package com.example.auctionservice.model;

import java.time.LocalDateTime;

public class Bid {

    private String bidderName;
    private double amount;
    private LocalDateTime timestamp;

    // Getters and Setters
    public String getBidderName() {
        return bidderName;
    }

    public void setBidderName(String bidderName) {
        this.bidderName = bidderName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

}