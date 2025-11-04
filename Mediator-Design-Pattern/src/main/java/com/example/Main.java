package com.example;

import com.example.Auction.AuctionHouse;
import com.example.Auction.AuctionMediator;
import com.example.Auction.Bidder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Design Patterns!");
        AuctionMediator auctionMediator = new AuctionHouse();
        Bidder bidder1 = new Bidder("Alice", auctionMediator);
        Bidder bidder2 = new Bidder("Bob", auctionMediator);
        auctionMediator.registerBidder(bidder1);
        auctionMediator.registerBidder(bidder2);
        bidder1.placeBid(100);
        bidder2.placeBid(150);

    }
}