package com.example.Auction;

public interface AuctionMediator {
    void registerBidder(Bidder bidder);
    void placeBid(Bidder bidder, double amount);
}
