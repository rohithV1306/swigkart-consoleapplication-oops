import java.util.Scanner;
import java.util.Random;

public class Au{
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    static int loginAttempts = 0;
    static int signupAttempts = 0;
    static User user = new User();
	static String fName;
	static String sName;
	static int attempts;
	static String enteredEmail ;
	static int w=0;
	static int s=0;
	static int pf=0;
	//static String num;


   

    public static void showLoginMenu() {
        //C.ct----------->   Login1 Form  <--------------- \n");
        C.ct("1. Login        ->");
        C.ct("2. Signup       ->");
		//C.ct(" 3. Forgot Password	->");
        C.ct("3. Exit         ->");
    }

    public static User login() {
		
				//loginAttempts = 0; // Reset attempt counter for each login attempt
				while (loginAttempts < 3) {
					C.cto("Enter E-mail      : ");
					String enteredEmail = sc.next();
					C.cto("Enter Password    : ");
					String enteredPassword = sc.next();

					if (enteredEmail.equals(user.getEmail1()) && enteredPassword.equals(user.getPassword1())) {
						C.ct(" ");
						C.ct(user.getFName1()+" "+user.getSName1()+" Login Successful");
						w=1;
						return user;
						
						// Successful login, exit method
					} else if (enteredEmail.equals(user.getEmail2()) && enteredPassword.equals(user.getPassword2())) {
						C.ct(" ");
						C.ct(user.getFName2()+" "+user.getSName2()+" Login Successful");
						if(s==1){
							//C.ct("s111");
							w=3;
						}
						else{
							
							// C.ct("s0000");
							w=2;
						}
						
						return user; // Successful login, exit method
					} else {
						
						
						
						
						C.ct("Incorrect credentials. Try again. Attempt " + (loginAttempts+1));
						
							
								
								
								if (loginAttempts >= 3) {
									C.ct("Number of attempts exceeded. Account temporarily locked.");
									C.ct("Try again after some time");
									loginAttempts=-1;
									return user;
								}
								
								
								
								while(true){
									if(pf==-1){break;}
									
									if (loginAttempts >= 3) {
										
									C.ct("Number of attempts exceeded.Account temporarily locked.");
									C.ct("Try again after some time ");
									loginAttempts=-1;
									return user;
								 }	
								
								C.ct("1. Forgot Password");
								C.ct("2. Try Again      ");
								//C.ct("2. Exit");
								
							
								
								C.cto("Enter 1 for to Change Password : ");
											
								
								try{
									int choice = sc.nextInt();
									switch(choice){
										
										
										
										case 1:
												
												
												forgotPassword();
												
												break;
										//case 2:
										//		break;
										default:C.ct("Invalid Option Plz Enter a number 1:");
										loginAttempts++;
									}
								}
								catch(Exception e){
									C.ct("Invalid PLZ Enter Valid Input Number : ");
									sc.next();
									loginAttempts++;
								}
								}
								
							
						
								
						
								
						
						
						
						
						
						
						
					}
				}
				
		
		return user;
    }


	public static void forgotPassword() {
        C.cto("Enter registered mobile number: ");
        String enteredMobileNumber = sc.next();
		
						if (loginAttempts >= 3) {
							C.ct("Number of attempts exceeded. Account temporarily locked.");
							C.ct("Try again after some time");
									pf=-1;;
									return ;
								}		
		
		

        if (enteredMobileNumber.equals(user.getMM())|| enteredMobileNumber.equals(user.getMD())) {
            C.ct("Mobile number verified. You can now change your password.");
            String newPassword = getPasswordFromUser();
            if (newPassword != null) {
                user.setPassword2(newPassword); 
				user.setPassword1(newPassword);				// Update password
                C.ct("Password successfully changed. \n");
				C.ct("LOGIN");
				C.ct(" ");
				pf=-1;
            } else {
                C.ct("Password change failed. Please try again later.");
				loginAttempts++;
            }
        } else {
            
			C.ct("Plz Enter a valid Registered Mobile Number :");
			loginAttempts++;
			
			forgotPassword();
			
			
        }
    }


    public static void signup() {
        signupAttempts = 0; // Reset signup attempt counter
		
		sc.nextLine();
		C.cto("Enter First Name:");
		String fName = sc.nextLine();
		
		
		C.cto("Enter Last Name:");
		String sName = sc.nextLine();
		
        C.cto("Enter E-mail        : ");
         enteredEmail = sc.next();

        String enteredPassword = getPasswordFromUser();
        if (enteredPassword == null) {
            C.ct("Signup failed! please try again later.");
            
        }
		else{

			user.setEmail2(enteredEmail);
			user.setPassword2(enteredPassword);
			user.setFName2(fName);
			user.setSName2(sName);
			
			
			
			 user.noM = getMobileNumber();
			if(user.noM==null){
				C.ct("Number of Attempts exceeded Signup Process terminated ");
			}
			else{
				int otp = generateOTP();
				C.ct("Your 6-digit OTP : "+ otp);
				C.ct("Sent to Your Mobile Number +91-"+user.noM);
				C.ct("It will be valid for the next 24 hours.");
				
				user.setDN(user.noM);
				user.setMN(user.noM);
				verifyOTP(otp);	
				
					
				
			}
			
			
		}
		
		
    }

    public static String getPasswordFromUser() {
		
        while (signupAttempts < 3) {
			
            C.cto("Enter Password: ");
            String enteredPassword = sc.next();
            C.cto("Re-enter Password: ");
            String reEnteredPassword = sc.next();

            if (enteredPassword.equals(reEnteredPassword)) {
                return enteredPassword;
            } else {
                signupAttempts++;
                if (signupAttempts >= 3) {
                    return null; // Terminate signup if max attempts reached
                }
                C.ct("Passwords do not match. Try again. Attempt " + signupAttempts + "/3");
            }
        }
        return null ; // Failed after max attempts
    }
		
	public static String getMobileNumber(){
		int attempts =0;
		while(attempts<3){
			C.cto("Enter your mobile number +91- :");
			String input = sc.next();
			
			if (input.length() == 10 && input.chars().allMatch(Character::isDigit)) {
				return input;
			} else {
				attempts++;
				if(attempts>=3){
					return null; // Terminate signup if max attempts reached
				}
				C.ct("Invalid mobile number. Please enter exactly 10 digits.");
			}
		}
		return null;
			
	}
	
    public static int generateOTP() {
        return 100000 + rd.nextInt(900000);
    }

    public static void verifyOTP(int otp) {
        attempts = 0;
        while (attempts < 3) {
            C.cto("Enter OTP to proceed: ");
            int enteredOTP = sc.nextInt();
            if (otp == enteredOTP) {
				s=s+1;
                C.ct(user.getFName2()+" "+user.getSName2()+" Signup Successful\n");
				
                return;
            } else {
                attempts++;
                if (attempts >= 3) {
                    C.ct("Number of attempts exceeded. Signup terminated.");
                    return;
                }
                C.ct("Incorrect OTP. Try again. Attempt " + attempts + "/3");
            }
        }
    }

    public static int getValidIntInput (String prompt) {
        attempts=0;
        while (attempts<3) {
           // C.cto(prompt);
			C.animateText(C.s+"                                               "+prompt+" "+C.d,20);
           try{
                int input = sc.nextInt();  
				
                if (input >= 1 && input <= 3) {
                    return input;
                } else {
                    C.ct("Please enter a number between 1 and 3 ");
					attempts++;
                }
			} catch (Exception e) {
			C.ct("Invalid input. Please enter a number.");
			sc.next(); // Clear invalid input  sc.flush();
			attempts++;
		}
            
                
            
        }
		C.ct("Number of Attempts Exceeds");
		return 3;
		
		
    }
	// public static int getValidIntInput () {
		// w=0;
		// return 3;
	// }
	
	
	
	
	
	
	
	
	
	
	
	
}




/*
In this code structure, various functionalities are separated into distinct methods:

1. **showLoginMenu**: 
   - **Purpose**: Displays the menu options for login, signup, and exit.
   - **Usage**: Called in the main loop to present choices to the user.

2. **login**:
   - **Purpose**: Manages the user login process by verifying entered credentials.
   - **Usage**: Called when the user selects the login option. Handles multiple login attempts and locks the account after too many failures.

3. **handleLoginAttempt**:
   - **Purpose**: Manages incorrect login attempts by providing feedback and tracking the number of failed attempts.
   - **Usage**: Used within the login method to handle and count login failures.

4. **signup**:
   - **Purpose**: Manages the user signup process by collecting user details, validating passwords, generating an OTP, and verifying it.
   - **Usage**: Called when the user selects the signup option. Handles the entire signup flow including password and OTP validation.

5. **getPasswordFromUser**:
   - **Purpose**: Prompts the user to enter and confirm their password, ensuring both entries match.
   - **Usage**: Used within the signup method to collect and validate the user’s password.

6. **generateOTP**:
   - **Purpose**: Generates a random 6-digit OTP (One-Time Password) for verification during signup.
   - **Usage**: Called during the signup process to create a unique OTP.

7. **verifyOTP**:
   - **Purpose**: Verifies the OTP entered by the user against the generated OTP. Allows limited attempts for verification.
   - **Usage**: Used within the signup method to confirm the OTP and complete the registration process.

8. **getValidIntInput**:
   - **Purpose**: Prompts the user for an integer input within a specified range and ensures the input is valid.
   - **Usage**: Used to validate and get a user’s choice from the menu, handling invalid inputs and ensuring the number is within the allowed range.

This modular approach enhances code readability and maintainability by clearly separating different functionalities into their respective methods.
*/
