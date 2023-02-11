public class ShipCostCalculator {
    public static void main(String[] args) {
        double itemCost = 110;
        double shippingCost = itemCost * .02;
        System.out.println("What is your item cost?");
        System.out.println(+itemCost);
        if (itemCost >= 100) {
            System.out.println("Your shipping is free for an item cost of $" +itemCost);
        } else {
            System.out.println("You shipping cost is $" +shippingCost+" for an item of $" +itemCost);
        }
    }
}