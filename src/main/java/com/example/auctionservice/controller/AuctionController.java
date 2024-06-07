package com.example.auctionservice.controller;

import com.example.auctionservice.model.AuctionItem;
import com.example.auctionservice.model.Bid;
import com.example.auctionservice.service.AuctionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Auction Controller", description = "API for managing auction items and bids")
@RequestMapping("/auction")
public class AuctionController {

    @Autowired
    private AuctionService auctionService;

    @PostMapping("/item")
    @Operation(summary = "add item", description = "add item")
    public AuctionItem addItem(@RequestBody AuctionItem item) {
        return auctionService.addItem(item);
    }

    @GetMapping("/items")
    @Operation(summary = "get all items", description = "get all items")
    public List<AuctionItem> getAllItems() {
        return auctionService.getAllItems();
    }

    @GetMapping("/item/{id}")
    @Operation(summary = "get auction item", description = "get auction item")
    public AuctionItem getItemById(@PathVariable String id) {
        return auctionService.getItemById(id);
    }

    @PostMapping("/item/{id}/bid")
    @Operation(summary = "add bid for item", description = "add bid for item")
    public AuctionItem placeBid(@PathVariable String id, @RequestBody Bid bid) {
        return auctionService.placeBid(id, bid);
    }
}