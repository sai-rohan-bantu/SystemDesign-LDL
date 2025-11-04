package com.example.Auction;

import java.util.ArrayList;
import java.util.List;

public class AuctionHouse implements AuctionMediator {

    public List<Bidder> bidders = new ArrayList<>();
    @Override
    public void registerBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    @Override
    public void placeBid(Bidder bidder, double amount) {
        for(Bidder b : bidders) {
            if(b != bidder) {
                System.out.println(bidder.getName() + " placed a bid of $" + amount);
            }
        }
    }
}
