package com.example.auctionservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "auctionItems")
public class AuctionItem {
    @Id
    private String id;
    private String name;
    private String description;
    private double startingPrice;
    private List<Bid> bids = new ArrayList<>();

    public void addBid(Bid bid) {
        this.bids.add(bid);
    }

    public List<Bid> getBids() {
        return bids;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(double startingPrice) {
        this.startingPrice = startingPrice;
    }
}