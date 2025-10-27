
// This is the Concrete Observer
// Shows a people who wants to bid in the auction

public class AuctionParticipatns implements Bidder{
    private String name;


    public AuctionParticipatns(String name) {
        this.name = name;
    }

    // This method is called when an item gets a new bid
    @Override
    public void update(String itemName, double newBid) {
        System.out.println(name + " got notification " + itemName + " new bid is " + newBid);
    }

    @Override
    public String toString() {
        return name;
    }

}
