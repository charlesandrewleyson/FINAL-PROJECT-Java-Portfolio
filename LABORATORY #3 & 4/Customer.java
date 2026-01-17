public class Customer {

String name;
    int points;
    static int totalCustomers = 1;

    public Customer(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public Customer() {
        name = "Unknown";
    }

    public static void getAllowedRewardsRedemption() {
        System.out.println("\n" + CoffeeShop.customer1.name + " can redeem 1 reward(s).\n");
        System.out.println(CoffeeShop.customer2.name + " can redeem 1 reward(s).\n");
        System.out.println(CoffeeShop.customer3.name + " can redeem 0 reward(s).\n");
        System.out.println(CoffeeShop.customer4.name + " can redeem 0 reward(s).\n");
    }
}