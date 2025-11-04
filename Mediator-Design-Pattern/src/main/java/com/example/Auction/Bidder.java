package com.example.Auction;

public class Bidder {
    private String name;
    private AuctionMediator mediator;

    public Bidder(String name, AuctionMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void placeBid(double amount) {
        mediator.placeBid(this, amount);
    }
}
