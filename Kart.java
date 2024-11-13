import java.util.Scanner;

public class Kart implements Service {
    static Scanner sc = new Scanner(System.in);
    static int c = 0;
    public static int kart = 0; // for knowing balance history from kart.
    static Kart shop = new Kart();
    private static final double FLORAL_SUMMER_DRESS_PRICE = 100.0;
    private static final double ELEGANT_EVENING_GOWN_PRICE = 150.0;
    private static final double CASUAL_DAY_DRESS_PRICE = 200.0;
    private static final double LEATHER_HAND_BAG_PRICE = 50.0;
    private static final double DENIM_BLUE_JEANS_PRICE = 180.0;
    private static final double SILK_SCARF_PRICE = 70.0;
    private static final double LEATHER_BOOTS_PRICE = 250.0;
    private static final double COTTON_SUMMER_SHIRT_PRICE = 80.0;
    private static final double STYLISH_SUNGLASSES_PRICE = 90.0;
    private static final double SUMMER_HAT_PRICE = 60.0;
    private static final double COZY_FLEECE_JACKET_PRICE = 140.0;
    private static final double CASUAL_SNEAKERS_PRICE = 110.0;
    private static final double DESIGNER_WRIST_WATCH_PRICE = 300.0;
    private static final double ELEGANT_NECKLACE_PRICE = 220.0;
    private static final double PREMIUM_LEATHER_BELT_PRICE = 100.0;
    private static final double WOOLEN_MITTENS_PRICE = 50.0;
    private static final double TRENDY_BACKPACK_PRICE = 150.0;
    private static final double EVENING_CLUTCH_PRICE = 130.0;
    private static final double CLASSIC_CARDIGAN_PRICE = 160.0;

    public static double total = 0.0; // Instance total for each session

    @Override
    public void performService() {
        if (Au.w == 2) {
            C.ct("Hi Dear User " + Au.user.getFName2() + " " + Au.user.getSName2() + " Welcome to Kart");
            Pay.abf = -2;
            shop.order();
            return;
        } else if (Au.w == 3) {
            C.ct("Hi Dear User " + Au.user.getFName2() + " " + Au.user.getSName2() + " Welcome to Kart ");

            if (c == 0) {
                c++;
                C.ct("New User Login Found ");
                C.ct("Plz Create Account in Payments and Proceed Payments");
            }

            shop.order();
        } else {
            C.ct("Hi Dear User " + Au.user.getFName1() + " " + Au.user.getSName1() + " Welcome to Kart");
            Pay.abf = -2;
            shop.order();
            return;
        }
    }

    // Display the product menu
    public void displayMenu() {
    C.ct("**************** Welcome To Flipkart ****************");
    C.ct("==============================================================");
    C.ct("           1. Chameli Floral Dress           100/-");
    C.ct("           2. Rani Evening Gown              150/-");
    C.ct("           3. Masti Day Dress                200/-");
    C.ct("           4. Moti Leather Bag                50/-");
    C.ct("           5. Desi Denim Jeans               180/-");
    C.ct("           6. Chanderi Silk Scarf             70/-");
    C.ct("           7. Rajasthani Leather Boots       250/-");
    C.ct("           8. Cotton Kurti Shirt              80/-");
    C.ct("           9. Bollywood Sunglasses            90/-");
    C.ct("           10. Mango Summer Hat               60/-");
    C.ct("           11. Cozy Woolen Jacket            140/-");
    C.ct("           12. Casual Sports Shoes           110/-");
    C.ct("           13. Royal Wrist Watch             300/-");
    C.ct("           14. Elegant Necklace Set          220/-");
    C.ct("           15. Premium Leather Waist Belt    100/-");
    C.ct("           16. Woolen Hand Warmers            50/-");
    C.ct("           17. Trendy Jhola Bag              150/-");
    C.ct("           18. Evening Clutch Bag            130/-");
    C.ct("           19. Classic Cardigan Sweater      160/-");
    C.ct("           20. Back ---------------------------->");
    C.ct("=============================================================");
    C.ct("          What Do You Want to Order Today?");
}


    // Generate and print the bill
    public void generateBill() {
        C.ct("***************** Thank You for Shopping *****************");
        C.ct("**************** Your Total Bill is: " + total + " *****************");
        C.ct(" ");
		C.ct("1. Proceed to Payment");
        C.ct("2. Go Back           ");
    }

    // Handle the user choice after generating the bill
    public void handlePostBillChoice() {
        while (true) {
            C.cto("Enter Your Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                kart = -1; // for history purpose;
                Pay.processPayment(total);
                C.ct("Thank you for your purchase!");
                return;
            } else if (choice == 2) { // Go back to main menu
                total = 0.0; // Reset total for a new order
                return; // Return to the main menu
            } else {
                C.ct("Invalid choice. Please try again.");
            }
        }
    }

    // Process the order
    public void order() {
        while (true) {
            displayMenu(); // Show the menu
            C.cto("Enter Your Choice: ");
            int choice = sc.nextInt();

            if (choice == 20) { // Back option
                return; // Exit
            }

            // Validate choice
            if (choice < 1 || choice > 19) {
                C.ct("Invalid choice. Please try again.");
                continue;
            }

            C.ct("You have selected item number " + choice);
            C.cto("Enter the desired quantity: ");
            int quantity = sc.nextInt();

            // Calculate total based on choice
            switch (choice) {
                case 1:
                    total += quantity * FLORAL_SUMMER_DRESS_PRICE;
                    break;
                case 2:
                    total += quantity * ELEGANT_EVENING_GOWN_PRICE;
                    break;
                case 3:
                    total += quantity * CASUAL_DAY_DRESS_PRICE;
                    break;
                case 4:
                    total += quantity * LEATHER_HAND_BAG_PRICE;
                    break;
                case 5:
                    total += quantity * DENIM_BLUE_JEANS_PRICE;
                    break;
                case 6:
                    total += quantity * SILK_SCARF_PRICE;
                    break;
                case 7:
                    total += quantity * LEATHER_BOOTS_PRICE;
                    break;
                case 8:
                    total += quantity * COTTON_SUMMER_SHIRT_PRICE;
                    break;
                case 9:
                    total += quantity * STYLISH_SUNGLASSES_PRICE;
                    break;
                case 10:
                    total += quantity * SUMMER_HAT_PRICE;
                    break;
                case 11:
                    total += quantity * COZY_FLEECE_JACKET_PRICE;
                    break;
                case 12:
                    total += quantity * CASUAL_SNEAKERS_PRICE;
                    break;
                case 13:
                    total += quantity * DESIGNER_WRIST_WATCH_PRICE;
                    break;
                case 14:
                    total += quantity * ELEGANT_NECKLACE_PRICE;
                    break;
                case 15:
                    total += quantity * PREMIUM_LEATHER_BELT_PRICE;
                    break;
                case 16:
                    total += quantity * WOOLEN_MITTENS_PRICE;
                    break;
                case 17:
                    total += quantity * TRENDY_BACKPACK_PRICE;
                    break;
                case 18:
                    total += quantity * EVENING_CLUTCH_PRICE;
                    break;
                case 19:
                    total += quantity * CLASSIC_CARDIGAN_PRICE;
                    break;
            }

            // Ask if the user wants to order more
			C.ct(" ");
            C.cto("Do you wish to order anything else (Y/N)? ");
            String again = sc.next();

            if (again.equalsIgnoreCase("N")) {
                generateBill();
                handlePostBillChoice(); // Handles the options after generating the bill
                return; // Return to prevent infinite loop
            } else if (again.equalsIgnoreCase("Y")) {
                // Continue ordering (i.e., loop back to ordering process)
            } else {
                C.ct("Invalid choice. Please enter 'Y' for Yes or 'N' for No.");
                // Optionally, you can prompt the user again instead of exiting
            }
        }
    }
}
