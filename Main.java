import java.util.Scanner;
import java.time.LocalDate;
import java.time.*;

public class Main {
static int c = 0;
static Au a = new Au();
static User cu;
static int attempts1;
static Scanner sc1 = new Scanner(System.in);
static A obj = new A();
static LocalDate today = LocalDate.now();



static{
	Au.user.setFName1("Dileep");
	Au.user.setSName1("K");

	Au.user.setFName2("Madhav");
	Au.user.setSName2("P");

	Au.user.setEmail1("dileep@gmail.com");
	Au.user.setPassword1("p1234");

	Au.user.setEmail2("mln@gmail.com");
	Au.user.setPassword2("p12345");
}


public static void sLogin(){
	
	showWelcomeMessage();
	

	while (c == 0) {
		a.showLoginMenu();
		int choice = a.getValidIntInput("Select the above Options: ");
		switch (choice) {
			case 1:
				c++;
				cu = a.login();
				
					
				
				break;
			case 2:
				a.signup();
				break;
			
			case 3:
				C.ct("Thank You! Visit Again ");
				c=-1;
				return;
			default:
				C.ct("Enter a valid option (1-3)");
		}
	}
}



public static void startMain(){
	
	 c = 0;
	
	while (c == 0) {
		showServiceMenu();
		int chS = getValidIntInputS("Select the above Options: ");
		switch (chS) {
			case 1:
				C.ct(" ");
				Swigg swg = new Swigg();
				
				swg.performService(); // Assuming you want to perform the service
				break;
			case 2:
				C.ct(" ");
				Kart kart = new Kart();
				kart.performService(); // Assuming you want to perform the service
				break;
			case 3:
				C.ct(" ");
				Pay pay = new Pay();
				
				pay.performService(); // Assuming you want to perform the service
				break;
			
			case 4:
				C.clearConsole();
				C.ct(" ");
				C.ct(" ");
				C.ct(" ");
				C.displayDiscoMessage("Thank You Visit Again <- Swig-Kart-Pay -> THE END  ", 20000);
				//logout();
				
				
				return;
				
			//case 5:
				//sLogin();
				
				//break;
			default:
				C.ct("Invalid choice. Please try again.");
				continue;
		}
	}
	
}	
/*
public static void logout() {
        C.ct("Logging out...");
        // Reset static state if needed
        Pay.b = 0;
        Au.w = 0;
        cu = null; // Clear current user
        C.ct("You have been logged out successfully.");
        // Redirect to login screen
		
        
    }

*/
public static void showWelcomeMessage() {
	C.ct(" ");
	C.ct("***************************************");
	C.ct("*                                     *");
	C.ct("*          Welcome to Swig-Kart-Pay       *");
	C.ct("*                                     *");
	C.ct("***************************************");
	C.ct("Please log in to continue...");
}
	

public static void showServiceMenu() {
	C.ct(" ");
	String formattedDate2 = C.formatDate2(today);
	
	C.ct("Select a service to perform: ");
	C.ct("                   Date:" + formattedDate2);
	C.ct("1. Swigg       ->");
	C.ct("2. Kart        ->");
	C.ct("3. Pay         ->");
	C.ct("4. Logout      ->");
	
	//C.ct("5. Back to Login	<-");
	//C.ct("6. Back to Login");
	//C.ct("Enter your choice: ");
}

public static int getValidIntInputS(String prompt) {
	attempts1 = 0;
	while (attempts1 < 3) {
		//C.cto(prompt);
		C.animateText(C.p+"                                               "+prompt+" "+C.d,20);
		try {
			int a1 = sc1.nextInt();  
			if (a1 >= 1 && a1 <= 4) {
				return a1;
			} else {
				C.ct("Please enter a number between 1 and 3");
				attempts1++;
			}
		} catch (Exception e) {
			C.ct("Invalid input. Please enter a number.");
			sc1.next(); // Clear invalid input
			attempts1++;
		}
	}
	C.ct("Number of Attempts Exceeds");
	return 6;
}


public static void main(String[] args)throws InterruptedException {
	//C.ct(" ");
	//C.ct(" ");
	C.ct(" ");
	String w=C.y+"                                                            Welcome to my Application Swigg-Kart-Pay(SKP) "+C.d;
			C.animateText(w,20);
			
		C.ct(" ");
	
	try {
            // Print the ASCII art with disco colors effect
			
			
			C.startCountdownN(2);
            Text1.printAsciiArtWithDiscoColors();
        } catch (InterruptedException e) {
            System.err.println("Animation interrupted.");
            Thread.currentThread().interrupt(); // Preserve the interrupt status
        }
	
	
	// C.cto("Logo Will Clear in :");
	C.startCountdownN(5);
	C.ct(" ");
	//C.clearConsole();
	C.ct(" ");
	C.ct(" ");
	sLogin();
	
	
	//C.ct("1111111111111111111111111111111111111-------");
	/*if(Pay.b==-1){
		Au.w=0;
	}*/
	
	
	
		
	if(Au.w>=1 && Au.w<=3){
		
		startMain();
	
	}
	//C.ct("@@@@@@@@@@@@");
	
}
}
