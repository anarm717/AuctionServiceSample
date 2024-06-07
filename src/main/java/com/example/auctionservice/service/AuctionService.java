package com.example.auctionservice.service;

import com.example.auctionservice.model.AuctionItem;
import com.example.auctionservice.model.Bid;
import com.example.auctionservice.repository.AuctionItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuctionService {

    @Autowired
    private AuctionItemRepository auctionItemRepository;

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    private static final String TOPIC = "auction_topic";

    public AuctionItem addItem(AuctionItem item) {
        auctionItemRepository.save(item);
        kafkaTemplate.send(TOPIC, item);
        return item;
    }

    public List<AuctionItem> getAllItems() {
        return auctionItemRepository.findAll();
    }

    public AuctionItem getItemById(String id) {
        return auctionItemRepository.findById(id).orElse(null);
    }

    public AuctionItem placeBid(String itemId, Bid bid) {
        Optional<AuctionItem> auctionItemOptional = auctionItemRepository.findById(itemId);
        if (auctionItemOptional.isPresent()) {
            AuctionItem auctionItem = auctionItemOptional.get();
            auctionItem.addBid(bid);
            return auctionItemRepository.save(auctionItem);
        } else {
            throw new RuntimeException("Auction item not found");
        }
    }
}