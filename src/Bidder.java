
// Observer interface
// All bidders must implement this method

public interface Bidder  {
    //This method is called when new bid is placed
    void update(String itemName, double newBid);
}
