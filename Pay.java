import java.util.Map;
import java.util.HashMap;

import java.util.Scanner;
public class Pay implements Service {
	static int k=0;//ot used 
	static int c=0;
	static Map<Double,String> historyy = new HashMap<>(); 
	//static Pay obj = new Pay();
	static String mobileNumber;  //edit it with user details 
	static  double balance = 0.0;
	static{
		if(Au.w==2)
			balance=50000;
		else if(Au.w==3)
			balance=0.0;
		else
			balance=100000;
	}
	static double amount;
	static int b=0;
	static Scanner sc = new Scanner(System.in);
	static int attempts=0;
	static int s=0;
	static int abf=0;//for  add bank details first
	static Buser obj = new Buser();
	
	public void performService() {

		if(Au.w==2){
			//C.ct(" ");
			C.ct("Hi Dear User "+Au.user.getFName2()+" "+Au.user.getSName2()+" Welcome to PhonePay ");
			b=-1;
			abf=-2;
			
			startPay();
			
			return;
			
			
		}
		else if(Au.w==3){
			//C.ct(" ");
			b=-1;
			C.ct("Hi Dear User "+Au.user.getFName2()+" "+Au.user.getSName2()+" Welcome to PhonePay  ");
			
			
			if(c==0){
				c++;
				C.ct("New User Login Found ");
				C.ct("Plz Create Account and Proceed Payments");
				
			}
			
				startPay();
			
			
		}
		else{
			//C.ct(" ");
			b=-1;
			abf=-2;
			C.ct("Hi Dear User "+Au.user.getFName1()+" "+Au.user.getSName1()+" Welcome to PhonePay ");
			//	balance=10000;
			startPay();
			
			return;
			
			
		}	
	}
	
	public static void payMenu() {
		//C.ct("\nSelect a Option to perform:\n");
		C.ct(" ");
        C.ct("1. Create Account ->");
        C.ct("2. Home           ->");
        C.ct("3. Settings       ->");
        C.ct("4. Histroy        ->");
        C.ct("5. Back           ->");
		C.ct("6. Wallet         ->");
		C.ct("7. Show Balance   ->");
		
		
        //C.ct("Enter your choice: ");
	}
	
	public static void startPay() {
		
		
		while(true){
			payMenu();
			int ch= getValidinput("Select the above Options :");
			switch(ch){
				case 1:
					C.ct("1.Crete Account :");
					//C.ct(" ");
					createAccount();
					
					break;
				case 2:
					if(abf==-2){
						C.ct("2.Home ");
						//C.ct(" ");
						home();
					}else{
						C.ct(" ");
						C.ct("Add Bank Details First and  SET UPI PIN :");
					}
					break;
				
				case 3:
					if(abf==-2){
						C.ct("3.Settings ");
						//C.ct(" ");
						settings();
					}else{
						C.ct(" ");
						C.ct("Add Bank Details First and  SET UPI PIN :");
					}
					break;
				case 4:
					if(abf==-2){
						C.ct("4.History ");
						C.ct(" ");
						history();
					}else{
						C.ct(" ");
						C.ct("Add Bank Details First and  SET UPI PIN :");
					}
					break;
				case 5:
					k=-1;
					
					C.ct("Back to Service Menu");
					
					
					//back to service menu 
					
					return;
					
				case 6:
					if(abf==-2){
						C.ct("6. Wallet ");
						C.ct(" ");
						topUpWallet();
					}
					else{
						C.ct("Add Bank Details First and  SET UPI PIN :");
					}
					break;
				case 7:
					if(abf==-2){
						C.ct("7. Show Balance ");
						C.ct(" ");
						showBalance();
					}else{
						C.ct(" ");
						C.ct("Add Bank Details First and  SET UPI PIN :");
					}
                    break;
				
				default :
					C.ct("Invalid Choice .plz try again ");
					break;
					
			}
		}
	}
	
	public static void settings() {
		while(true){
			settingsMenu();
			int ch =getValidinputS("Select the Below Options :");
			switch(ch){
				case 1:
						C.ct("1.Profile :");
						C.ct(" ");
						profile();
						break;
				case 2:
						C.ct("2.Pin Change :");
						C.ct(" ");
						pinChange();
						break;
				case 3:
						C.ct("3.Help $ Support :");
						//C.ct(" ");
						showHelpSupport();
						break;
				case 4:
						C.ct("4.Privacy Security :");
						//C.ct(" ");
						showPrivacySecurity();
						break;
				case 5:
						C.ct("5.Back :");
						
						return;
				default :
						C.ct("Invalid Choice .plz try again");
						break;
			}	
		
		}
		
	}
	
	private static void showHelpSupport() {
		C.ct(" ");
        C.ct("--- Help & Support ---");
    C.ct("Need help? We’re here for you!");
    C.ct("Email Support: supportskp@example.com");
    C.ct("Phone Support: 1800-123-456");
    C.ct("For immediate assistance, please reach out to our support team.");
	}
	
	private static void showPrivacySecurity() {
		C.ct(" ");
    C.ct("--- Privacy & Security ---");
    C.ct("1. **Privacy:** We are committed to protecting your personal data. Our practices adhere to industry standards.");
    C.ct("2. **Security:** Your information is safeguarded using the latest encryption technologies and security protocols.");
    C.ct("3. **Concerns?** If you have any questions or issues related to privacy or security:");
    C.ct("   - Email: privacy.securityskp@example.com");
    C.ct("   - Security Hotline: 1800-456-789");
    C.ct("Our team is dedicated to addressing your concerns promptly.");
	}
	
	public static void pinChange() {
		if(Au.w==2){
			
			attempts=0;
			
			while(attempts<3){
				
				C.cto("Enter the Mobile Number :");
				long ln=sc.nextLong();
				C.ct("Plz Enter the 4 Digit OTP sent to Your Mobile Number :+91-"+ln);
				int g =generateOTP();
				C.ct(g+" It will be valid for the next 24 hours. ");
				C.cto("OTP :");
				int n=sc.nextInt();
				if( g == n){
					C.cto("Set New UPI PIN :");
					int x1=sc.nextInt();
					C.cto("Re-Enter the UPI PIN :");
					int x2=sc.nextInt();
				
					if(x1 == x2){
						obj.piM=x1;
						C.ct("UPI PIN SET Successful");
						return;
					}
					else{
						C.ct("UPI PINs do not match. Please try again.");
						
					}
				}else{
					attempts++;
					C.ct("Incorrect OTP. Please try again. Attempt " + attempts + "/3");
				}
				
				//C.ct("Maximum attempts exceeded. Setting UPI PIN failed.");	
			}
			if(attempts>=3){
			C.ct("Maximum attempts exceeded. Setting UPI PIN failed.");return;	}
			
			
		}else if(Au.w==1){
			
			attempts=0;
			while(attempts<3){
				
				C.ct("Enter the Mobile Number :");
				long ln=sc.nextLong();
				C.ct("Plz Enter the 4 Digit OTP sent to Your Mobile Number :+91-"+ln);
				int g =generateOTP();
				C.ct(g+" It will be valid for the next 24 hours. ");
				int n=sc.nextInt();
				if( g == n){
					C.ct("Set New UPI PIN :");
					int x1=sc.nextInt();
					C.ct("Re-Enter the UPI PIN :");
					int x2=sc.nextInt();
				
					if(x1 == x2){
						obj.piD=x1;
						C.ct("UPI PIN SET Successful");
						return;
					}
					else{
						C.ct("UPI PINs do not match. Please try again.");
						
					}
					
				}else{
					attempts++;
					C.ct("Incorrect OTP. Please try again. Attempt " + attempts + "/3");
				}
				
				//C.ct("Maximum attempts exceeded. Setting UPI PIN failed.");	
			}
			if(attempts>=3){
			C.ct("Maximum attempts exceeded. Setting UPI PIN failed.");return;	}
			
		}else{
			attempts=0;
			
			while(attempts<3){
				
				C.ct("Enter the Mobile Number :");
				long ln=sc.nextLong();
				C.ct("Plz Enter the 4 Digit OTP sent to Your Mobile Number :+91-"+ln);
				int g =generateOTP();
				C.ct(g+" It will be valid for the next 24 hours. ");
				int n=sc.nextInt();
				if( g == n){
					C.ct("Set New UPI PIN :");
					int x1=sc.nextInt();
					C.ct("Re-Enter the UPI PIN :");
					int x2=sc.nextInt();
				
					if(x1 == x2){
						obj.pin1=x1;
						C.ct("UPI PIN SET Successful");
						return;
					}
					else{
						C.ct("UPI PINs do not match. Please try again.");
						
					}
				}else{
					attempts++;
					C.ct("Incorrect OTP. Please try again. Attempt " + attempts + "/3");
				}
				
			}
			if(attempts>=3){
			C.ct("Maximum attempts exceeded. Setting UPI PIN failed.");return;	}
			
			
		}
	}		
	
	public static int generateOTP() {
        // Generate a 4-digit OTP
        return 1000 + Au.rd.nextInt(9000);
    }
	
	public static void profile() {
		if(Au.w==2){
			C.ct("Full Name :"+Au.user.getFName2()+" "+Au.user.getSName2());
			C.ct("User Name :"+Au.user.getEmail2());
			C.ct("Password :"+Au.user.getPassword2());
			C.ct("Mobile Number :"+Buser.noM);
			C.ct("Bank :"+obj.bNM+"-"+obj.bANM.substring(obj.bANM.length()-4));
			C.ct("UPI ID :"+obj.upIidM);
		}else if(Au.w==1){
			C.ct("Full Name :"+Au.user.getFName1()+" "+Au.user.getSName1());
			C.ct("User Name :"+Au.user.getEmail1());
			C.ct("Password :"+Au.user.getPassword1());
			C.ct("Mobile Number :"+Buser.noD);
			C.ct("Bank :"+obj.bND+"-"+obj.bAND.substring(obj.bAND.length()-4));
			C.ct("UPI ID :"+obj.upIidD);
		}
		else{
			C.ct("Full Name :"+Au.user.getFName2()+" "+Au.user.getSName2());
			C.ct("User Name :"+Au.user.getEmail2());
			C.ct("Password :"+Au.user.getPassword2());
			C.ct("Mobile Number :"+User.noM);
			C.ct("Bank :"+obj.bankAccountName+"-"+obj.bankAccountNumber.substring(obj.bankAccountNumber.length()-4));
			C.ct("UPI ID :" +User.noM+"@ybl");
		}
	}
			
	public static void settingsMenu() {
		C.ct(" ");
		C.ct("1. Profile            ->");
        C.ct("2. Pin Change         ->");
        C.ct("3. Help $ Support     ->");
        C.ct("4. Privacy Security   ->");
		C.ct("5. Back               <-");
	}
	
	public static void home() {
	
		while(true){
			homeMenu();
			int ch = getValidinputH("Select the above Options :");
			switch(ch){
				case 1: 
						C.ct("1.Send Money");
						C.ct(" ");
						sendMoney();
						break;
				case 2: 
						C.ct("2.Mobile Recharge");
						C.ct(" ");
						mobileRecharge();
						break;
				case 3: 
						C.ct("3.Travel");
						C.ct(" ");
						bookBusTicket();
						break;
				case 4: 
						C.ct("4.BookMyShow");
						C.ct(" ");
						bookMovieTicket();
						break;
				case 5: 
						C.ct("5.Back");
						//startPay();
						return	;	 
				default :
						C.ct("Enter Number is Invalid .Plz Enter a Valid Number (1-5)");
						break;
			}
		
		}
		//C.ct("HOME");
	}
	
	public static void bookMovieTicket() {
    try {
        // Prompt user for booking details
        C.cto("Enter movie name: ");
        sc.nextLine(); // Consume newline
        String movieName = sc.nextLine();

        C.cto("Enter the number of tickets to book: ");
        int numberOfTickets = sc.nextInt();

        C.cto("Enter the cost per ticket: $");
        double costPerTicket = sc.nextDouble();

        double totalCost = numberOfTickets * costPerTicket;

        // Validate the UPI PIN
        int attempts = 0;
        while (attempts < 3) {
            C.cto("Enter UPI PIN: ");
            int pin = sc.nextInt();

            if (pin == obj.piM || pin == obj.piD || pin == obj.pin1) {
                if (totalCost <= balance) {
                    // Deduct amount from balance and add to history
                    balance -= totalCost;
                    historyy.put(totalCost, "Booked " + numberOfTickets + " tickets for movie " + movieName);
                    C.ct("Successfully booked "+numberOfTickets+" Movie tickets.");
                    //C.ct("Remaining balance: $" + balance);
                } else {
                    C.ct("Insufficient balance.");
                }
                return;
            } else {
                attempts++;
                C.ct("Incorrect PIN. Please try again. Attempt " + attempts + "/3");
            }
        }
        C.ct("Maximum attempts exceeded. Transaction failed.");
    } catch (Exception e) {
        C.ct("An error occurred: " + e.getMessage());
    }
}
	
	public static void bookBusTicket() {
    try {
        // Prompt user for booking details
        C.cto("Enter bus route (e.g., 'Route A to Route B'): ");
        sc.nextLine(); // Consume newline
        String busRoute = sc.nextLine();

        C.cto("Enter the number of tickets to book: ");
        int numberOfTickets = sc.nextInt();

        C.cto("Enter the cost per ticket: $");
        double costPerTicket = sc.nextDouble();

        double totalCost = numberOfTickets * costPerTicket;

        // Validate the UPI PIN
        int attempts = 0;
        while (attempts < 3) {
            C.cto("Enter UPI PIN: ");
            int pin = sc.nextInt();

            if (pin == obj.piM || pin == obj.piD || pin == obj.pin1) {
                if (totalCost <= balance) {
                    // Deduct amount from balance and add to history
                    balance -= totalCost;
                    historyy.put(totalCost, "Booked " + numberOfTickets + " tickets for bus route " + busRoute);
                    C.ct("Successfully booked "+numberOfTickets+" bus tickets.");
                    //C.ct("Remaining balance: $" + balance);
                } else {
                    C.ct("Insufficient balance.");
                }
                return;
            } else {
                attempts++;
                C.ct("Incorrect PIN. Please try again. Attempt " + attempts + "/3");
            }
        }
        C.ct("Maximum attempts exceeded. Transaction failed.");
    } catch (Exception e) {
        C.ct("An error occurred: " + e.getMessage());
    }
}

	public static void sendMoney() {
		C.cto("Enter recipient's mobile number : +91-");
        String mobileNumber = sc.next();
		sc.nextLine();
        C.cto("Enter recipient's name: ");
        String name = sc.nextLine();
		C.cto("Enter amount to send: $");
		double amount = sc.nextDouble();
		
		 int attempts = 0;
        while (attempts < 3) {
            C.cto("Enter UPI PIN: ");
			try{
				int pi = sc.nextInt();
				if (pi== obj.piM || pi==  obj.piD || pi== obj.pin1) {
					
					if (amount <= balance) {
						historyy.put(amount," Send to"+name);
						balance -= amount;
						historyy.put(amount, "Sent to " + name + " (" + mobileNumber + ")");
						C.ct("Money "+amount+" sent successfully.");
						//C.ct("Remaining balance: $" + balance);
					} else {
						C.ct("Insufficient balance.");
					}
					return;
				
				} 
				else {
					attempts++;
					C.ct("Incorrect PIN. Please try again. Attempt " + attempts + "/3");
				}
			}
			catch(Exception e){
				C.ct("Invalid input. Please enter Valid Pin number.");
				sc.next(); // Clear invalid input
				attempts++;
			}
        }
        C.ct("Maximum attempts exceeded. Transaction failed.");
    }
	
	public static void mobileRecharge() {
    // Prompt user for mobile number and recharge amount
    C.cto("Enter recipient's mobile number for recharge (+91-): ");
    String mobileNumber = sc.next();
    sc.nextLine(); // Consume newline
    

    // Validate the UPI PIN
    int attempts = 0;
    while (attempts < 3) {
		
		try{
			C.cto("Enter amount to recharge: $");
	

			double rechargeAmount = sc.nextDouble();
		
			C.cto("Enter UPI PIN: ");
			int pin = sc.nextInt();
			if (pin == obj.piM || pin == obj.piD || pin == obj.pin1) {
				if (rechargeAmount <= balance) {
					// Deduct amount from balance and add to history
					balance -= rechargeAmount;
					historyy.put(rechargeAmount, "Recharged mobile number " + mobileNumber);
					C.ct("Mobile recharge "+rechargeAmount+" successful.");
					//C.ct("Remaining balance: $" + balance);
				} else {
					C.ct("Insufficient balance.");
				}
				return;
			} else {
				attempts++;
				C.ct("Incorrect PIN. Please try again. Attempt " + attempts + "/3");
			}
		}
		catch(Exception e){
				C.ct("Invalid input. Please enter Valid  number.");
				sc.next(); // Clear invalid input
				attempts++;
			}
		
    }
    C.ct("Maximum attempts exceeded. Transaction failed.");
}
		
	public static void homeMenu() {
		C.ct(" ");
		C.ct("1. Send Money            ->");
        C.ct("2. Mobile Recharge       ->");
        C.ct("3. Bus Ticket Booking    ->");
        C.ct("4. BookMyShow            ->");
        C.ct("5. Back                  <-");
	}
	
	public static void createAccount() {
		
		if(Au.w==3){
			if(s==-1)
			{C.ct(" ");
				C.ct("Your Account Details:");
				//C.ct(" Your Account Details ");
				if(Au.w==2){
					C.ct(obj.bNM+"-"+obj.bANM.substring(obj.bANM.length()-4));
				}
				else if(Au.w==1){
					C.ct(obj.bND+"-"+obj.bAND.substring(obj.bAND.length()-4));
				}
				else{
					C.ct(obj.bankAccountName+"-"+obj.bankAccountNumber.substring(obj.bankAccountNumber.length()-4));
				}
				
				
				System.out.println();
				
				
				C.ct("Bank Name :"+obj.bankAccountName);
				C.ct("Account Number :"+obj.bankAccountNumber);
				C.ct("Branch :"+obj.bankBranch);
				C.ct("Mobile Number: " + User.noM);
				C.ct("UPI ID :" +User.noM+"@ybl");
				C.ct("UPI PIN: "+obj.pin1);
				abf=-2;
			}
			else{
				
				
				C.ct(" ");

				// Step 1: Enter and validate mobile number
				C.ct("1. Add Bank Details.   ->");
				C.ct("2. Set UPI Pin         ->");
				C.ct("3. Back                <-");
				
				
				int choice = getValidInputC("Enter your choice: ");
				
				switch (choice) {
					case 1:
						addBankDetails();
						createAccount();
						
						break;
					case 2:
						
						if(abf==-2){
							setUPIPin();
							createAccount();
						
						}
						else{
							C.ct("Add Bank Details First and then SET UPI PIN :");
							createAccount();
						}
						break;
					case 3:
						startPay();
						return;
					default:
						C.ct("Invalid choice. Please try again.");
						break;
				}
				
			}
			
		}
		else if(Au.w==2){
			
			//M
			C.ct(" Your Account Details ");
				
				if(Au.w==2){
					C.ct(obj.bNM+"-"+obj.bANM.substring(obj.bANM.length()-4));
				}
				else if(Au.w==1){
					C.ct(obj.bND+"-"+obj.bAND.substring(obj.bAND.length()-4));
				}
				else{
					C.ct(obj.bankAccountName+"-"+obj.bankAccountNumber.substring(obj.bankAccountNumber.length()-4));
				}
				
				
				//C.ct("Your Account Details:");
				C.ct("Bank Name :"+obj.bNM);
				C.ct("Account Number :"+obj.bANM);
				C.ct("Branch :"+obj.brM);
				C.ct("Mobile Number: " + obj.noM);
				C.ct("UPI ID :" +obj.upIidM);
				C.ct("UPI PIN: "+obj.piM);
			
			
		}
		else{
			C.ct(" Your Account Details ");
					if(Au.w==2){
						C.ct(obj.bNM+"-"+obj.bANM.substring(obj.bANM.length()-4));
					}
					else if(Au.w==1){
						C.ct(obj.bND+"-"+obj.bAND.substring(obj.bAND.length()-4));
					}
					else{
						C.ct(obj.bankAccountName+"-"+obj.bankAccountNumber.substring(obj.bankAccountNumber.length()-4));
					}
			
				//C.ct("Your Account Details:");
				C.ct("Bank Name :"+obj.bND);
				C.ct("Account Number :"+obj.bAND);
				C.ct("Branch :"+obj.brD);
				C.ct("Mobile Number: " + obj.noD);
				C.ct("UPI ID :" +obj.upIidD);
				C.ct("UPI PIN: "+obj.piD);// Assuming UPI PIN 
		}
        // Step 5: Top-up wallet
    }

    public static void history() {
		
		if(Au.w==2){
			C.ct(obj.bNM+"-"+obj.bANM.substring(obj.bANM.length()-4));
		}
		else if(Au.w==1){
			C.ct(obj.bND+"-"+obj.bAND.substring(obj.bAND.length()-4));
		}
		else{
			C.ct(obj.bankAccountName+"-"+obj.bankAccountNumber.substring(obj.bankAccountNumber.length()-4));
		}
		
		
		C.ct("Transaction History:");
		for(Map.Entry<Double,String> h:historyy.entrySet()){
			C.ct(h.getKey()+" "+h.getValue());
		}
	}

    public static String getValidStringInput(String prompt) {
        C.cto(prompt);
		    

        return sc.nextLine();
    }

    public static String createUPI(String mobileNumber) { // it is no need delet ones after checking
        return mobileNumber + "@ybl";
    }

    public static boolean setUPIPin() {
        int attempts = 0;

        while (attempts < 3) {
			
			C.ct(obj.bankAccountName+"-"+obj.bankAccountNumber.substring(obj.bankAccountNumber.length()-4));
            C.cto("Enter 4 Digit ATM PIN: ");
			
            int enteredOTP = sc.nextInt();
            // Simulate OTP validation (always return true for demo)
            if (enteredOTP == 1234) { // Simulated OTP (change as needed)
                C.cto("Set 4 Digit UPI PIN: ");
                obj.pin1 = sc.nextInt();
                C.cto("Re-enter UPI PIN: ");
                int pin2 = sc.nextInt();
				
                if (obj.pin1 == pin2) {
                    C.ct("UPI PIN set successfully.");
					s=-1;// new user set the pin shows the details when next time.
                    return true;
                } else {
                    C.ct("UPI PINs do not match. Please try again.");
                }
				
            } else {
                attempts++;
                C.ct("Incorrect OTP. Please try again. Attempt " + attempts + "/3");
            }
        }
		
        C.ct("Maximum attempts exceeded. Setting UPI PIN failed.");
        return false;
    }

    public static void addBankDetails() {
		C.ct("Enter the Bank Details Linked with Mobile Number +91 "+User.noM);
		
		
		
		sc.nextLine();
        obj.bankAccountName = getValidStringInput("Enter Bank  Name: ");
		while(true){
			obj. bankAccountNumber = getValidStringInput("Enter Bank Account Number: "); //getMobileNumber() it must have 4 digit value. or we get index out of bound exceptions
			if(obj.bankAccountNumber.length()>=4){
				break;
			}
			else{
				C.ct("Plz Enter valid input .Account Number greater than or equals to 4 digits");
			}
		}
			obj. bankBranch = getValidStringInput("Enter Bank Branch: ");
		
        C.ct("Bank details added successfully.");
		C.ct("Created UPI id :"+User.noM+"@ybl");
		abf=-2;
		
		
    }
	
	public static int getValidInputC(String prompt) {
        int attempts = 0;
        while (attempts < 3) {
            C.cto(prompt);
            try {
                int input = sc.nextInt();
                if (input >= 1 && input <= 3) { // Adjusted based on the choices available
                    return input;
                } else {
                    C.ct("Please enter a number between 1 and 2.");
                    attempts++;
                }
            } catch (Exception e) {
                C.ct("Invalid input. Please enter a number.");
                sc.next(); // Clear invalid input
                attempts++;
            }
        }
        C.ct("Number of attempts exceeds. Returning to main menu.");
        return 0; // Default return value, handle as needed
    }
	
    public static void topUpWallet() {
		if(Au.w==2){
			C.ct(obj.bNM+"-"+obj.bANM.substring(obj.bANM.length()-4));
		}
		else if(Au.w==1){
			C.ct(obj.bND+"-"+obj.bAND.substring(obj.bAND.length()-4));
		}
		else{
			C.ct(obj.bankAccountName+"-"+obj.bankAccountNumber.substring(obj.bankAccountNumber.length()-4));
		}
        C.cto("Top-up Wallet");
		C.ct(" ");
		int attempts=0;
		while(attempts<3){
			C.cto("Enter UPI PIN :");
			int pi=sc.nextInt();
			C.ct(" ");
			if(pi== obj.piM || pi==  obj.piD || pi== obj.pin1){
				C.cto("Enter amount to top-up $: ");
				amount = Au.sc.nextDouble();
				historyy.put(amount," Amount TopUp");
				C.cto("Wallet top-up successful. Amount: " + amount);
				C.ct(" ");
				balance+=amount;
				return;
			}
			else{
				attempts++;
				C.ct("You've entered the wrong UPI PIN. Please check and try again.");
			}
			
		}
		C.ct("Number of Attempts Exceeds");
			
    }
	
	public static void showBalance() {
		
		if(Au.w==2){
			C.ct(obj.bNM+"-"+obj.bANM.substring(obj.bANM.length()-4));
		}
		else if(Au.w==1){
			C.ct(obj.bND+"-"+obj.bAND.substring(obj.bAND.length()-4));
		}
		else{
			C.ct(obj.bankAccountName+"-"+obj.bankAccountNumber.substring(obj.bankAccountNumber.length()-4));
		}
		
        C.ct("Your current balance is: $" + balance);
    }
	
	public static int getValidinput(String prompt) {
        int attempts=0;
        while (attempts<3) {
            C.cto(prompt);
            try{
                int input = Au.sc.nextInt();  
				
                if (input >= 1 && input <= 7) {
                    return input;
                } else {
                    C.ct("Please enter a number between 1 and 7 ");
					attempts++;
                }
			} catch (Exception e) {
			C.ct("Invalid input. Please enter a number.");
			Au.sc.next(); // Clear invalid input
			attempts++;
			}
            
        }
		C.ct("Number of Attempts Exceeds");
		return 8;
		
		
    }
	
	public static int getValidinputH(String prompt) {
        int attempts=0;
        while (attempts<3) {
            C.cto(prompt);
            try{
                int input = Au.sc.nextInt();  
				
                if (input >= 1 && input <= 5) {
                    return input;
                } else {
                    C.ct("Please enter a number between 1 and 5 ");
					attempts++;
                }
			} catch (Exception e) {
			C.ct("Invalid input. Please enter a number.(1-5) ");
			Au.sc.next(); // Clear invalid input
			attempts++;
			}
            
        }
		C.ct("Number of Attempts Exceeds");
		return 8;
		
		
    }
	
	
	
	
	public static int getValidinputS(String prompt) {
		
		int attempts=0;
        while (attempts<3) {
            C.cto(prompt);
            try{
                int input = Au.sc.nextInt();  
				
                if (input >= 1 && input <= 5) {
                    return input;
                } else {
                    C.ct("Please enter a number between 1 and 5 ");
					attempts++;
                }
			} catch (Exception e) {
			C.ct("Invalid input. Please enter a number.(1-5) ");
			Au.sc.next(); // Clear invalid input
			attempts++;
			}
            
        }
		C.ct("Number of Attempts Exceeds");
		return 0;
	
	}
	
	
	
	public static void processPayment(double amount) {
		if(abf==-2){
			if (amount <= 0) {
				C.ct("Invalid amount. Please enter a positive value.");
				Kart.total=0;
				Swigg.totalOrderAmount=0;
				return;
			}

			if (amount > balance) {
				C.ct("Insufficient balance.");
				Kart.total=0;
				Swigg.totalOrderAmount=0;
				return;
			}

			C.cto("Enter UPI PIN to confirm payment: ");
			int enteredPin = sc.nextInt();
			if (enteredPin == obj.pin1 || enteredPin == obj.piM||enteredPin == obj.piD ) {
				balance -= amount;
				if(Kart.kart==-1){
				historyy.put(amount," Amount Paid to Flipkart");
				}// add check point if it is from Swiggy.
				else if(Swigg.swigg==-1){
				historyy.put(amount," Amount Paid to Swiggy");
				}
				
				//balance-=amount;
				
				C.ct("Payment successful. Amount paid: $" + amount);
				
				//C.ct("Remaining balance: $" + balance);
			} else {
				C.ct("Incorrect UPI PIN. Payment failed.");
			}
		}
		else{
				C.ct("Add Bank Details First and  SET UPI PIN :");
		}
			
		
		
		
    }
}
	
	
	
