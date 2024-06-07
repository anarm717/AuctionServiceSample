package com.example.auctionservice.consumer;

import com.example.auctionservice.model.AuctionItem;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class AuctionConsumer {

    @KafkaListener(topics = "auction_topic", groupId = "auction_group")
    public void consume(AuctionItem item) {
        System.out.println("Consumed message: " + item);
        // Add additional logic to process the consumed item
    }
}