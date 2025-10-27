


public class Main {
    public static void main(String[] args) {

        System.out.println("-----Auction started-----");

        // creating items for auction
        AuctionItem phone = new AuctionItem("Apple Iphone 18", 250);
        AuctionItem glasses = new AuctionItem("Apple Vision Pro 3", 1500);
        AuctionItem macbook = new AuctionItem("MacBook M4", 4000);

        // creating people who will bid
        Bidder person1 = new AuctionParticipatns("Marat");
        Bidder person2 = new AuctionParticipatns("Aigul");
        Bidder person3 = new AuctionParticipatns("Kaisar");
        Bidder person4 = new AuctionParticipatns("Merey");

        System.out.println("\n ---People registering for items---");
        phone.registerBidder(person4);

        glasses.registerBidder(person3);

        macbook.registerBidder(person2);
        macbook.registerBidder(person1);

        // starting bidding, all the participants will be notified
        System.out.println("\n---Bidding starts---");
        phone.placeBid(300);
        glasses.placeBid(2000);
        macbook.placeBid(4100);

        System.out.println("Kaisar leaves the glasses auction");
        glasses.removeBid(person3);


        System.out.println("\n---Auction Ended---");
    }
}
