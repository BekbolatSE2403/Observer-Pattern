

//This is the Concrete subject
//Shows an item that is on auction current time

import java.util.ArrayList;
import java.util.List;

public class AuctionItem implements Auction{
    private String itemName;
    private List<Bidder> bidders = new ArrayList<>();
    private double currentBid;


    public AuctionItem(String itemName, double startingBid) {
        this.itemName = itemName;
        this.currentBid = startingBid;
    }

    @Override
    public void registerBidder(Bidder bidder) {
        bidders.add(bidder);
        System.out.println(bidder + " is now watching " + itemName);
    }

    @Override
    public void removeBid(Bidder bidder) {
        bidders.remove(bidder);
        System.out.println(bidder + " stopped watching " + itemName);
    }

    //Loops through all the bidders and notifies them by showing new bid
    @Override
    public void notifyBidders() {
        for(Bidder bidder : bidders) {
            bidder.update(itemName, currentBid);
        }
    }

    // when someone places a new bid
    public void placeBid(double bidAmount) {
        // accepts only higher bid from current
        if(bidAmount > currentBid) {
            currentBid = bidAmount;
            System.out.println("New highest bid for item: " + itemName + ": $" + currentBid);
            notifyBidders();
        }
    }

    public String getItemName() {
        return itemName;
    }

}
