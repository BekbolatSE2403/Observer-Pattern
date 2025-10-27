
// This is the Subject interface
// All auction item should implement this interface

public interface Auction {
    // add a bidder to notification list
    void registerBidder(Bidder bidder);
    // remove a bidder from list
    void removeBid(Bidder bidder);
    // notifies all the members from the list
    void notifyBidders();
}
