/*
In this refactored code, I've separated the logic into different methods:

showLoginMenu - Displays the login menu.
login - Handles the login process.
handleLoginAttempt - Handles incorrect login attempts.
signup - Handles the signup process.
getPasswordFromUser - Gets and validates the password during signup.
generateOTP - Generates a 6-digit OTP.
verifyOTP - Verifies the OTP entered by the user.
This structure makes the code more modular and easier to read and maintain.

*/
/*
public class C{
    //public  static  int CONSOLE_WIDTH = 2000; // Assumed console width, adjust as necessary

    // Method to center and print text
    public static void ct(String message) {
        System.out.println(centerText(message));
    }

    // Method to center text and return it as a string
    public static String centerText(String message) {
        int messageLength = message.length();
        int padding = (CONSOLE_WIDTH - messageLength) / 2;

        if (padding < 0) {
            // If the message is longer than the console width, return it as is
            return message;
        }

        // Build the centered text with padding
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < padding; i++) {
            sb.append(' ');
        }
        sb.append(message);

        // Add additional space to the right if the console width is not evenly divisible
        if (CONSOLE_WIDTH - messageLength - padding > 0) {
            for (int i = 0; i < (CONSOLE_WIDTH - messageLength - padding); i++) {
                sb.append(' ');
            }
        }

        return sb.toString();
    }
}	

*/	

/*
class ch {
    static final int CONSOLE_WIDTH = 100; // Assumed console width, adjust as necessary
	
	public static int m1(int a){
		System.out.print("HIMLN BAPATLA");
		return 20;
	}
    public static void main(String[] args) {
        String text = "Welcome to PhonePay"; // The text you want to center
        System.out.println(centerText(text));
		int a=10;
		ct("HI Madhav "+a); // except void methods 
		
		//ct(m1(20));
		ct("asdfghjk");
    }
	public static void ct( String message) {
		
        System.out.println(centerText(message));
		
    }

    public static String centerText(String message) {
        int messageLength = message.length();
        int padding = (CONSOLE_WIDTH - messageLength) / 2;
        // Use String.format to pad with spaces
        return String.format("%" + (padding + messageLength) + "s", message);
		
		
		
    }
}

*/
/*
import java.util.Scanner;

public class TextBoxExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your mobile number:");
        System.out.print("+-------------------------+\n");
        System.out.print("| ");
        String mobileNumber = scanner.nextLine();
        System.out.print("+-------------------------+\n");

        System.out.println("You entered: " + mobileNumber);

        scanner.close();
    }
}
*/

/*

// it works for clear console 
import java.io.IOException;

class ClearConsoleExample {
    public static void main(String[] args) {
        // Print some text to show the effect of clearing the console
        System.out.println("This is some text.");
        System.out.println("This text will be cleared.");

        // Pause to allow you to see the text
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Clear the console
        clearScreen();

        // Print new text after clearing the console
        System.out.println("The console has been cleared.");
        System.out.println("This is new text after clearing.");
    }

    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}

*/

/* // same above 
import java.io.IOException;

class ClearConsoleExample {
    public static void main(String[] args) {
        // Print some text to show the effect of clearing the console
        System.out.println("This is some text.");
        System.out.println("This text will be cleared.");

        // Pause to allow you to see the text
        try {
            Thread.sleep(1000);  // Pause for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Clear the console
        clearScreen();

        // Print new text after clearing the console
        System.out.println("11111111111111111111111111.");
		
        System.out.println("This is new text after clearing.");
		clearScreen();
		   System.out.println("2222222222222222222222222.");
		
        System.out.println("This is new text after clearing.");
    }

    private static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
*/

/*
// works 
import java.io.IOException;
import java.util.Scanner;

class StylishCLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            clearScreen();
            printMainMenu();
            int choice = getChoice(scanner, 1, 3);

            switch (choice) {
                case 1:
                    clearScreen();
                    signup(scanner);
                    break;
                case 2:
                    clearScreen();
                    login(scanner);
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Thank you for using our system. Goodbye!");
        scanner.close();
    }

    private static void printMainMenu() {
        System.out.println("*************************************");
        System.out.println("*                                   *");
        System.out.println("*        Welcome to Our CLI         *");
        System.out.println("*                                   *");
        System.out.println("*************************************");
        System.out.println("*                                   *");
        System.out.println("* 1. Sign Up                        *");
        System.out.println("* 2. Log In                         *");
        System.out.println("* 3. Exit                           *");
        System.out.println("*                                   *");
        System.out.println("*************************************");
        System.out.print("Please choose an option: ");
    }

    private static void signup(Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Clear the console before showing the success message
        clearScreen();

        System.out.println("*************************************");
        System.out.println("*   You have successfully signed up!*");
        System.out.println("*************************************");

        pause(scanner);
    }

    private static void login(Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Clear the console before showing the success message
        clearScreen();

        System.out.println("*************************************");
        System.out.println("*    You have successfully logged in!*");
        System.out.println("*************************************");

        pause(scanner);
    }

    private static int getChoice(Scanner scanner, int min, int max) {
        int choice = 0;
        while (true) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= min && choice <= max) {
                    break;
                } else {
                    System.out.print("Invalid choice. Please try again: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
        return choice;
    }

    private static void pause(Scanner scanner) {
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }

    private static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}

*/

/* // every thing sets.
	import java.io.PrintStream;

class CenteredOutputExample {
    public static void main(String[] args) {
        // Create a centered print stream
        PrintStream centeredOut = new PrintStream(System.out) {
            @Override
            public void println(String x) {
                String centeredText = centerText(x);
                super.println(centeredText);
            }
        };

        // Redirect System.out to centeredOut
        System.setOut(centeredOut);

        // Example usage
        System.out.println("Welcome to the centered output example!");
        System.out.println("This text is automatically centered.");
        System.out.println("You can extend this for all your application output.");

        // Reset System.out to default
        System.setOut(new PrintStream(System.out));

        // Example usage after resetting
        System.out.println("Back to normal output.");
    }

    // Method to center text within a console width
    private static String centerText(String text) {
        int consoleWidth = 80; // Adjust according to your console width
        int spaces = (consoleWidth - text.length()) / 2;
        StringBuilder centeredText = new StringBuilder();
        for (int i = 0; i < spaces; i++) {
            centeredText.append(" ");
        }
        centeredText.append(text);
        return centeredText.toString();
    }
}
*/
/*

import java.util.Scanner;
import java.util.Random;

 class PhonePay {

    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();

    public static void main(String[] args) {
        while (true) {
            showMainMenu();
            int choice = getValidIntInput("Enter your choice: ");
            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    System.out.println("Feature coming soon...");
                    break;
                case 3:
                    System.out.println("Feature coming soon...");
                    break;
                case 4:
                    System.out.println("Exiting PhonePay...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void showMainMenu() {
        System.out.println("\nPhonePay - Main Menu");
        System.out.println("1. Create Account");
        System.out.println("2. Send Money");
        System.out.println("3. Pay Bill");
        System.out.println("4. Exit");
    }

    public static void createAccount() {
        System.out.println("\nCreate Account");

        // Check if user is new or existing (simulated check for demo)
        boolean isNewUser = isNewUser();

        if (isNewUser) {
            // New user flow
            System.out.println("New User Registration:");

            // Step 1: Enter and validate mobile number
            String mobileNumber = enterMobileNumber();
            if (mobileNumber == null) {
                System.out.println("Account creation failed. Invalid mobile number.");
                return;
            }

            // Step 2: Generate and validate OTP
            int otp = generateOTP();
            if (!validateOTP(otp)) {
                System.out.println("Account creation failed. OTP validation unsuccessful.");
                return;
            }

            // Step 3: Enter bank details and create UPI
            System.out.println("Enter Bank Details:");
            String accountName = getValidStringInput("Account Name: ");
            String accountNumber = getValidStringInput("Account Number: ");
            String branch = getValidStringInput("Branch: ");

            // Create UPI
            String upi = mobileNumber + "@ybl";

            // Display success message
            System.out.println("Account created successfully.");
            System.out.println("UPI created: " + upi);

            // Step 4: Set UPI PIN using OTP
            if (!setUPIPin()) {
                System.out.println("Setting UPI PIN failed. Maximum attempts reached.");
                return;
            }

            // Step 5: Top-up wallet
            topUpWallet();

        } else {
            // Existing user flow (not implemented in this basic outline)
            System.out.println("Existing User Flow: Feature coming soon...");
        }
    }

    public static boolean isNewUser() {
        // Simulated logic to determine if user is new or existing
        // For simplicity, always return true for demo purposes (new user)
        return true;
    }

    public static String enterMobileNumber() {
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter your mobile number (10 digits): ");
            String mobileNumber = sc.next();
            if (mobileNumber.length() == 10 && mobileNumber.matches("\\d+")) {
                return mobileNumber;
            } else {
                attempts++;
                System.out.println("Invalid mobile number format. Please enter exactly 10 digits.");
            }
        }
        System.out.println("Maximum attempts exceeded. Account creation failed.");
        return null;
    }

    public static int generateOTP() {
        return 100000 + rd.nextInt(900000); // Random 6-digit OTP
    }

    public static boolean validateOTP(int otp) {
        int attempts = 0;
        while (attempts < 3) {
			System.out.println(otp);
            System.out.print("Enter OTP received on your mobile: ");
            int enteredOTP = sc.nextInt();
            if (enteredOTP == otp) {
                return true;
            } else {
                attempts++;
                System.out.println("Incorrect OTP. Please try again. Attempt " + attempts + "/3");
            }
        }
        System.out.println("Maximum attempts exceeded. OTP validation failed.");
        return false;
    }

    public static boolean setUPIPin() {
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter OTP received on your registered mobile for setting UPI PIN: ");
            int enteredOTP = sc.nextInt();
            // Simulate OTP validation (always return true for demo)
            if (enteredOTP == 123456) { // Simulated OTP (change as needed)
                System.out.print("Enter new UPI PIN: ");
                int pin1 = sc.nextInt();
                System.out.print("Re-enter UPI PIN: ");
                int pin2 = sc.nextInt();
                if (pin1 == pin2) {
                    System.out.println("UPI PIN set successfully.");
                    return true;
                } else {
                    System.out.println("UPI PINs do not match. Please try again.");
                }
            } else {
                attempts++;
                System.out.println("Incorrect OTP. Please try again. Attempt " + attempts + "/3");
            }
        }
        System.out.println("Maximum attempts exceeded. Setting UPI PIN failed.");
        return false;
    }

    public static void topUpWallet() {
        System.out.println("\nTop-up Wallet");
        System.out.print("Enter amount to top-up: ");
        double amount = sc.nextDouble();
        System.out.print("Enter UPI PIN: ");
        int pin = sc.nextInt();
        System.out.println("Wallet top-up successful. Amount: " + amount);
    }

    public static int getValidIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int input = sc.nextInt();
                return input;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Clear invalid input
            }
        }
    }

    public static String getValidStringInput(String prompt) {
        System.out.print(prompt);
        return sc.next();
    }
}
*/

//////////////////////////////////////////////
/*
public static String enterMobileNumber() {
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter your mobile number +91 - ");
             mobileNumber = Au.sc.next();
            if (mobileNumber.length() == 10 && mobileNumber.matches("\\d+")) {
                return mobileNumber;
            } else {
                attempts++;
                System.out.println("Invalid mobile number format. Please enter exactly 10 digits.");
            }
        }
        System.out.println("Maximum attempts exceeded. Account creation failed.");
        return null;
    }

    public static int generateOTP() {
        return 100000 + Au.rd.nextInt(900000); // Random 6-digit OTP
    }

    public static boolean validateOTP(int otp) {
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter the 5 digit OTP sent to "+mobileNumber);
				System.out.println("\nOTP -> "+otp);
            int enteredOTP = Au.sc.nextInt();
            if (enteredOTP == otp) {
                return true;
            } else {
                attempts++;
                System.out.println("Incorrect OTP. Please try again. Attempt " + attempts + "/3");
            }
        }
        System.out.println("Maximum attempts exceeded. OTP validation failed.");
        return false;
    }

    public static String getValidStringInput(String prompt) {
        System.out.print(prompt);
        return Au.sc.nextLine();
    }

    public static String createUPI(String mobileNumber) {
        return mobileNumber + "@ybl";
    }

    public static boolean setUPIPin() {
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter OTP received on your registered mobile for setting UPI PIN: ");
            int enteredOTP = Au.sc.nextInt();
            // Simulate OTP validation (always return true for demo)
            if ( enteredOTP == 123456 ) { // Simulated OTP (change as needed)
                System.out.print("Enter new UPI PIN: ");
                int pin1 = Au.sc.nextInt();
                System.out.print("Re-enter UPI PIN: ");
                int pin2 = Au.sc.nextInt();
                if (pin1 == pin2) {
                    System.out.println("UPI PIN set successfully.");
                    return true;
                } else {
                    System.out.println("UPI PINs do not match. Please try again.");
                }
            } else {
                attempts++;
                System.out.println("Incorrect OTP. Please try again. Attempt " + attempts + "/3");
            }
        }
        System.out.println("Maximum attempts exceeded. Setting UPI PIN failed.");
        return false;
    }
	
	
	System.out.println("\nCreate Account");

			// Step 1: Enter and validate mobile number
			String mobileNumber = enterMobileNumber();
			if (mobileNumber == null) {
				System.out.println("Account creation failed. Invalid mobile number format.");
				return;
			}

			// Step 2: Generate and validate OTP
			int otp = generateOTP();
			
			if (!validateOTP(otp)) {
				System.out.println("Account creation failed. OTP validation unsuccessful.");
				return;
			}
				
			// Step 3: Enter bank details and create UPI
			String bankAccountName = getValidStringInput("Enter Bank Account Name: ");
			String bankAccountNumber = getValidStringInput("Enter Bank Account Number: ");
			String bankBranch = getValidStringInput("Enter Bank Branch: ");
			String upi = createUPI(mobileNumber);

			// Display success message
			System.out.println("\nAccount created successfully!");
			System.out.println("UPI created: " + upi);

			// Step 4: Set UPI PIN using OTP
			if (!setUPIPin()) {
				System.out.println("Setting UPI PIN failed. Maximum attempts reached.");
				return;
			}
			
			*/

/*
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class DynamicASCIIClock {
    public static void main(String[] args) throws InterruptedException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        while (true) {
            LocalTime now = LocalTime.now();
            System.out.print("\r" + "Current Time: " + now.format(formatter) + " ");
            Thread.sleep(1000);
        }
    }
}

*/
/*
// calling from main method.

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeUtility {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");

    // Method to get the current time as a formatted string
    public static String getCurrentTime() {
        LocalTime now = LocalTime.now();
        return now.format(FORMATTER);
    }
}
public class MainApp {
    public static void main(String[] args) {
        // Example usage
        System.out.println("Current Time: " + TimeUtility.getCurrentTime());

        // Other code
        someMethod();
    }

    public static void someMethod() {
        System.out.println("Current Time in someMethod: " + TimeUtility.getCurrentTime());
    }
}

// date 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        
        // Example format: "Day Month Year" (e.g., "03 August 2024")
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formattedDate1 = today.format(formatter1);
        System.out.println("Formatted Date 1: " + formattedDate1);
        
        // Example format: "Day-Month-Year" (e.g., "03-August-2024")
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        String formattedDate2 = today.format(formatter2);
        System.out.println("Formatted Date 2: " + formattedDate2);
        
        // Example format: "Day/Month/Year" (e.g., "03/08/2024")
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate3 = today.format(formatter3);
        System.out.println("Formatted Date 3: " + formattedDate3);
    }
}

*/
// 
 class ColorCycling {
    private static final String RESET = "\033[0m";
    private static final String[] COLORS = {
        "\033[0;31m", // Red
        "\033[0;33m", // Yellow
        "\033[0;32m", // Green
        "\033[0;36m", // Cyan
        "\033[0;34m", // Blue
        "\033[0;35m"  // Magenta
    };

    // Method to cycle through colors and print text
    public static void cycleColors(String text, int delayMillis) throws InterruptedException {
        int index = 0;

        while (true) {
            C.ct("\r" + COLORS[index] + text + RESET);
            index = (index + 1) % COLORS.length;
            Thread.sleep(delayMillis);
        }
    }
}

class MainApp {
    public static void main(String[] args) {
        try {
            // Example usage of the ColorCycling class
            ColorCycling.cycleColors("Color Cycling Text!", 500);
        } catch (InterruptedException e) {
            System.err.println("The color cycling was interrupted.");
            e.printStackTrace();
        }
    }
}





/*
import java.util.Scanner;

public class Swigg implements Service {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Restaurant[] restaurants = new Restaurant[5];
    private static double totalOrderAmount = 0.0; // Total amount for the current order
    private static int c = 0; // For tracking user state, if needed
    static int att = 0;

    static {
        // Initialize restaurants once, when the class is first loaded
        initializeRestaurants();
    }

    @Override
    public void performService() {
        if (Au.w == 2) {
            C.ct("Hi Dear User " + Au.user.getFName2() + " " + Au.user.getSName2() + " Welcome to PhonePay M");
            Pay.balance = 10000;
            Pay.abf = -2;
            startSwiggy();
        } else if (Au.w == 3) {
            C.ct("Hi Dear User " + Au.user.getFName2() + " " + Au.user.getSName2() + " Welcome to PhonePay N");
            if (c == 0) {
                c++;
                C.ct("New User Login Found ");
                C.ct("Please create an account in Payments and proceed with payments.");
            }
            startSwiggy();
        } else {
            C.ct("Hi Dear User " + Au.user.getFName1() + " " + Au.user.getSName1() + " Welcome to PhonePay D");
            Pay.balance = 50000;
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
                C.ct("Enter your choice: ");
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

    private static void initializeRestaurants() {
        addRestaurant(0, "MEHFIL");
        addRestaurant(1, "Paradise");
        addRestaurant(2, "Bawarchi");
        addRestaurant(3, "Krishnapatnam");
        addRestaurant(4, "Telangana Spice Kitchen");
    }

    private static void addRestaurant(int index, String name) {
        Restaurant restaurant = new Restaurant(name);
        restaurant.addFoodItem(new FoodItem("Chicken 65", 150.0));
        restaurant.addFoodItem(new FoodItem("Chicken Chilly", 150.0));
        restaurant.addFoodItem(new FoodItem("Chicken Biryani", 229.0));
        restaurant.addFoodItem(new FoodItem("Mutton Biryani", 249.0));
        restaurant.addFoodItem(new FoodItem("Chicken Family Pack", 609.0));
        restaurant.addFoodItem(new FoodItem("Mutton Family Pack", 679.0));
        restaurant.addFoodItem(new FoodItem("Veg Biryani", 199.0));
        restaurant.addFoodItem(new FoodItem("Paneer Biryani", 219.0));
        restaurant.addFoodItem(new FoodItem("Ice Cream", 69.0));
        restaurant.addFoodItem(new FoodItem("Gulab Jamun", 79.0));
        restaurants[index] = restaurant;
    }

    private static void handleOrder() {
        Restaurant selectedRestaurant = chooseRestaurant();
        if (selectedRestaurant == null) {
            C.ct("Invalid restaurant choice. Returning to main menu.");
            return;
        }

        totalOrderAmount = processOrder(selectedRestaurant);
        generateBill();
        handlePostBillChoice();
    }

    private static Restaurant chooseRestaurant() {
        C.ct("Choose a restaurant:");
        for (int i = 0; i < restaurants.length; i++) {
            if (restaurants[i] != null) {
                C.ct((i + 1) + ". " + restaurants[i].getName());
            }
        }

        C.ct("Enter your choice (1-" + restaurants.length + "): ");
        int choice = scanner.nextInt();
        if (choice < 1 || choice > restaurants.length || restaurants[choice - 1] == null) {
            return null;
        }
        return restaurants[choice - 1];
    }

    private static double processOrder(Restaurant restaurant) {
        double totalOrderAmount = 0.0;
        while (true) {
            restaurant.displayMenu();
            C.ct("Enter the food item number and quantity (e.g., 1 2 for two Chicken 65). Enter 0 to finish: ");
            scanner.nextLine(); // Consume newline
            int itemNumber = scanner.nextInt();
            if (itemNumber == 0) break;

            int quantity = scanner.nextInt();
            FoodItem selectedItem = restaurant.getFoodItemByNumber(itemNumber);
            if (selectedItem != null) {
                double itemTotal = selectedItem.getPrice() * quantity;
                totalOrderAmount += itemTotal;
                System.out.printf("Added: %s x%d - Rupees %.1f%n", selectedItem.getName(), quantity, itemTotal);
            } else {
                C.ct("Invalid item number. Please try again.");
            }

            C.ct("Do you wish to order anything else (Y/N)? ");
            String again = scanner.next();
            if (again.equalsIgnoreCase("N")) break;
        }
        return totalOrderAmount;
    }

    private static void generateBill() {
        C.ct("***************** Thank You for Ordering *****************");
        C.ct("**************** Your Total Bill is: " + totalOrderAmount + " *****************");
        C.ct("1. Proceed to Payment");
        C.ct("2. Go Back");
    }

    private static void handlePostBillChoice() {
        while (true) {
            C.ct("Enter Your Choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) { // Proceed to payment
                Pay.processPayment(totalOrderAmount);
                C.ct("Thank you for your purchase!");
                totalOrderAmount = 0.0; // Reset total for a new order
                return;
            } else if (choice == 2) { // Go back to main menu
                totalOrderAmount = 0.0; // Reset total for a new order
                return;
            } else {
                C.ct("Invalid choice. Please try again.");
            }
        }
    }

    // Inner class for Restaurant
    private static class Restaurant {
        private String name;
        private FoodItem[] menu;
        private int menuSize;

        public Restaurant(String name) {
            this.name = name;
            this.menu = new FoodItem[10]; // Assuming a maximum of 10 items
            this.menuSize = 0;
        }

        public String getName() {
            return name;
        }

        public void addFoodItem(FoodItem item) {
            if (menuSize < menu.length) {
                menu[menuSize++] = item;
            } else {
                C.ct("Menu is full. Cannot add more items.");
            }
        }

        public void displayMenu() {
            C.ct("\n--- Menu for " + name + " ---");
            for (int i = 0; i < menuSize; i++) {
                FoodItem item = menu[i];
                System.out.printf("%d. %s - Rupees %.2f%n", (i + 1), item.getName(), item.getPrice());
            }
            C.ct("------------------------------");
        }

        public FoodItem getFoodItemByNumber(int number) {
            if (number < 1 || number > menuSize) {
                return null;
            }
            return menu[number - 1];
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
*/