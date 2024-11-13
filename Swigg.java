import java.util.Scanner;

public class Swigg implements Service {
    private static final Scanner scanner = new Scanner(System.in);
    public static double totalOrderAmount = 0.0; // Total amount for the current order
    private static int c = 0; // For tracking user state, if needed
    static int att = 0;
	public static int swigg =0;//for knowing histroy from swigg;
   

    @Override
    public void performService() {
        if (Au.w == 2) {
            C.ct("Hi Dear User " + Au.user.getFName2() + " " + Au.user.getSName2() + " Welcome to Swigg");
          //  Pay.balance = 10000;
            Pay.abf = -2;
            startSwiggy();
        } else if (Au.w == 3) {
            C.ct("Hi Dear User " + Au.user.getFName2() + " " + Au.user.getSName2() + " Welcome to Swigg");
            if (c == 0) {
                c++;
                C.ct("New User Login Found ");
                C.ct("Please create an account in Payments and proceed with payments.");
            }
            startSwiggy();
        } else {
            C.ct("Hi Dear User " + Au.user.getFName1() + " " + Au.user.getSName1() + " Welcome to Swigg");
            //Pay.balance = 50000;
            Pay.abf = -2;
            startSwiggy();
        }
    }

    private static void startSwiggy() {
        att = 0;

        while (att < 3) {
            try {
                C.ct("Welcome to Swiggy!");
                C.ct("1. Order from Swiggy");
                C.ct("2. Back to SKP Menu");
                C.cto("Enter your choice: ");
                int mainChoice = scanner.nextInt();

                switch (mainChoice) {
                    case 1:
                        handleOrder();
                        break;
                    case 2:
                        C.ct("Thank you for using Swiggy!");
                        return;
                    default:
                        C.ct("Invalid choice. Please try again.");
                        att++;
                }
            } catch (Exception e) {
                C.ct("Invalid Input. Please enter a valid number.");
                scanner.next(); // Clear invalid input
                att++;
            }
        }
    }

    private static void handleOrder() {
        int restaurantChoice = chooseRestaurant();
        switch (restaurantChoice) {
            case 1:
                totalOrderAmount = processOrderMEHFIL();
                break;
            case 2:
                totalOrderAmount = processOrderParadise();
                break;
            case 3:
                totalOrderAmount = processOrderBawarchi();
                break;
            case 4:
                totalOrderAmount = processOrderKrishnapatnam();
                break;
            case 5:
                totalOrderAmount = processOrderTelanganaSpiceKitchen();
                break;
            default:
                C.ct("Invalid restaurant choice. Returning to main menu.");
                return;
        }

        generateBill();
        handlePostBillChoice();
    }

    private static int chooseRestaurant() {
        C.ct("Choose a restaurant:");
        C.ct("1. MEHFIL                    ");
        C.ct("2. Paradise                  ");
        C.ct("3. Bawarchi                  ");
        C.ct("4. Krishnapatnam             ");
        C.ct("5. Telangana Spice Kitchen   ");

        C.cto("Enter your choice (1-5): ");
        return scanner.nextInt();
    }

    private static double processOrderMEHFIL() {
        return processOrder("MEHFIL", new FoodItem[]{
            new FoodItem("Chicken 65", 150.0),
            new FoodItem("Chicken Chilly", 150.0),
            new FoodItem("Chicken Biryani", 229.0),
            new FoodItem("Mutton Biryani", 249.0),
            new FoodItem("Chicken Family Pack", 609.0),
            new FoodItem("Mutton Family Pack", 679.0),
            new FoodItem("Veg Biryani", 199.0),
            new FoodItem("Paneer Biryani", 219.0),
            new FoodItem("Ice Cream", 69.0),
            new FoodItem("Gulab Jamun", 79.0)
                     });
    }

    private static double processOrderParadise() {
        return processOrder("Paradise", new FoodItem[]{
            new FoodItem("Chicken 65", 150.0),
            new FoodItem("Chicken Chilly", 150.0),
            new FoodItem("Chicken Biryani", 229.0),
            new FoodItem("Mutton Biryani", 249.0),
            new FoodItem("Chicken Family Pack", 609.0),
            new FoodItem("Mutton Family Pack", 679.0),
            new FoodItem("Veg Biryani", 199.0),
            new FoodItem("Paneer Biryani", 219.0),
            new FoodItem("Ice Cream", 69.0),
            new FoodItem("Gulab Jamun", 79.0)
        });
    }

    private static double processOrderBawarchi() {
        return processOrder("Bawarchi", new FoodItem[]{
            new FoodItem("Chicken 65", 150.0),
            new FoodItem("Chicken Chilly", 150.0),
            new FoodItem("Chicken Biryani", 229.0),
            new FoodItem("Mutton Biryani", 249.0),
            new FoodItem("Chicken Family Pack", 609.0),
            new FoodItem("Mutton Family Pack", 679.0),
            new FoodItem("Veg Biryani", 199.0),
            new FoodItem("Paneer Biryani", 219.0),
            new FoodItem("Ice Cream", 69.0),
            new FoodItem("Gulab Jamun", 79.0)
        });
    }

    private static double processOrderKrishnapatnam() {
        return processOrder("Krishnapatnam", new FoodItem[]{
            new FoodItem("Chicken 65", 150.0),
            new FoodItem("Chicken Chilly", 150.0),
            new FoodItem("Chicken Biryani", 229.0),
            new FoodItem("Mutton Biryani", 249.0),
            new FoodItem("Chicken Family Pack", 609.0),
            new FoodItem("Mutton Family Pack", 679.0),
            new FoodItem("Veg Biryani", 199.0),
            new FoodItem("Paneer Biryani", 219.0),
            new FoodItem("Ice Cream", 69.0),
            new FoodItem("Gulab Jamun", 79.0)
        });
    }

// private static double processOrderTelanganaSpiceKitchen() {
    // FoodItem item1 = new FoodItem("Chicken 65", 150.0);
    // FoodItem item2 = new FoodItem("Chicken Chilly", 150.0);
    // FoodItem item3 = new FoodItem("Chicken Biryani", 229.0);
    // FoodItem item4 = new FoodItem("Mutton Biryani", 249.0);
    // FoodItem item5 = new FoodItem("Chicken Family Pack", 609.0);
    // FoodItem item6 = new FoodItem("Mutton Family Pack", 679.0);
    // FoodItem item7 = new FoodItem("Veg Biryani", 199.0);
    // FoodItem item8 = new FoodItem("Paneer Biryani", 219.0);
    // FoodItem item9 = new FoodItem("Ice Cream", 69.0);
    // FoodItem item10 = new FoodItem("Gulab Jamun", 79.0);

    // FoodItem[] items = new FoodItem[] { item1, item2, item3, item4, item5, item6, item7, item8, item9, item10 };

    // return processOrder("Telangana Spice Kitchen", items);
// }

//Anonymous Array Initialization: here we create and initialize 
//an array of FoodItem objects directly in one statement. insted of all thiss



    private static double processOrderTelanganaSpiceKitchen() {
        return processOrder("Telangana Spice Kitchen", new FoodItem[]{
            new FoodItem("Chicken 65", 150.0),
            new FoodItem("Chicken Chilly", 150.0),
            new FoodItem("Chicken Biryani", 229.0),
            new FoodItem("Mutton Biryani", 249.0),
            new FoodItem("Chicken Family Pack", 609.0),
            new FoodItem("Mutton Family Pack", 679.0),
            new FoodItem("Veg Biryani", 199.0),
            new FoodItem("Paneer Biryani", 219.0),
            new FoodItem("Ice Cream", 69.0),
            new FoodItem("Gulab Jamun", 79.0)
        });
    }

    private static double processOrder(String restaurantName, FoodItem[] menuItems) {
        double totalOrderAmount = 0.0;
		String space ="                                          ";
        while (true) {
            C.ct("--- Menu for " + restaurantName + " ---");
            for (int i = 0; i < menuItems.length; i++) {
                FoodItem item = menuItems[i];
                System.out.printf(space+"%d. %s - Rupees %.2f%n", (i + 1), item.getName(), item.getPrice());
            }
            C.ct("------------------------------");

            C.cto("Enter the food item number and quantity (e.g., 1 2 for two Chicken 65). Enter 0 to finish: ");
            //scanner.nextLine(); // Consume newline
            int itemNumber = scanner.nextInt();
            if (itemNumber == 0) break;

            int quantity = scanner.nextInt();
            if (itemNumber >= 1 && itemNumber <= menuItems.length) {
                FoodItem selectedItem = menuItems[itemNumber - 1];
                double itemTotal = selectedItem.getPrice() * quantity;
                totalOrderAmount += itemTotal;
                System.out.printf(space+"Added: %s x%d - Rupees %.1f%n", selectedItem.getName(), quantity, itemTotal);
            } else {
                C.ct("Invalid item number. Please try again.");
            }

            C.cto("Do you wish to order anything else (Y/N)? ");
            String again = scanner.next();
            if (again.equalsIgnoreCase("N")) break;
        }
        return totalOrderAmount;
    }

    private static void generateBill() {
        C.ct("***************** Thank You for Ordering *****************");
        C.ct("**************** Your Total Bill is: " + totalOrderAmount + " *****************");
        C.ct(" ");
		C.ct("1. Proceed to Payment ");
        C.ct("2. Go Back            ");
    }

    private static void handlePostBillChoice() {
        while (true) {
            C.cto("Enter Your Choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
					swigg =-1;			// Proceed to payment
                Pay.processPayment(totalOrderAmount);
                C.ct("Thank you for your purchase!");
				C.ct(" ");
                totalOrderAmount = 0.0; // Reset total for a new order
                return;
            } else if (choice == 2) { // Go back to main menu
                totalOrderAmount = 0.0; // Reseting total for a new order
                return;
            } else {
                C.ct("Invalid choice. Please try again.");
            }
        }
    }

    // Inner class for FoodItem
    private static class FoodItem {
        private String name;
        private double price;

        public FoodItem(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }
}
