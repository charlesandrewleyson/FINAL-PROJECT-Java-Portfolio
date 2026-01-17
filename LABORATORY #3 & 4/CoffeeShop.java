public class CoffeeShop {

    public static Customer customer1 = new Customer("Joseph", 200);
    public static Customer customer2 = new Customer("Peter", 0);
    public static Customer customer3 = new Customer();
    public static Customer customer4 = new Customer("Diane", 0);

    public static void main(String[] args) {
        addPoints();
        redeemReward();
        displayCustomerInfo();
        customer4.points += 50;
        System.out.println("\n" + customer4.name + " earned 50 points. Total points: " + customer4.points + "\n");
        Customer.totalCustomers++;
        System.out.println("Customer: " + customer4.name);
        System.out.println("Points: " + customer4.points);
        System.out.println("...........................");
        System.out.println("Total Registered Customer: " + Customer.totalCustomers);
        Customer.getAllowedRewardsRedemption();

    }

    public static void addPoints() {
        customer2.points += 200;
        System.out.println(customer2.name + " earned 200 points. Total points: " + customer2.points + "\n");
        Customer.totalCustomers++;
        customer2.points += 20;
        System.out.println(customer2.name + " earned 20 points. Total points: " + customer2.points);
        Customer.totalCustomers++;

    }

    public static void redeemReward() {
        System.out.println("\nCongratulations " + customer1.name + "! You redeemed a free drink!");
        customer1.points -= 100;
        System.out.println("Remaining points: " + customer1.points);
        System.out.println("\nCongratulations " + customer2.name + "! You redeemed a free drink!");
        customer2.points -= 100;
        System.out.println("Remaining points: " + customer2.points);
        System.out.println("\n" + customer3.name + " does not have enough points to redeem a drink\n");
    }

    public static void displayCustomerInfo() {
        System.out.println("--- Customer Information ---");
        System.out.println("Customer: " + customer1.name);
        System.out.println("Points: " + customer1.points);
        System.out.println("...........................");
        System.out.println("Customer: " + customer2.name);
        System.out.println("Points: " + customer2.points);
        System.out.println("...........................");
        System.out.println("Customer: " + customer3.name);
        System.out.println("Points: " + customer3.points);
        System.out.println("...........................");
        System.out.println("Total Registered Customer: " + Customer.totalCustomers);
    }
}