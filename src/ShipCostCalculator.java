public class ShipCostCalculator {
    public static void main(String[] args) {
        //Declare Variables
        double itemCost = 110;
        double shippingCost = itemCost * .02;
        //Prompt
        System.out.println("What is your item cost?");
        //Input
        System.out.println(+itemCost);
        //Output For Free Shipping
        if (itemCost >= 100) {
            System.out.println("Your shipping is free for an item cost of $" +itemCost);
        }
        //Output For Shipping Cost
        else {
            System.out.println("You shipping cost is $" +shippingCost+" for an item of $" +itemCost);
        }
    }
}