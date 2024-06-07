package com.example.auctionservice.repository;

import com.example.auctionservice.model.AuctionItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuctionItemRepository extends MongoRepository<AuctionItem, String> {
}