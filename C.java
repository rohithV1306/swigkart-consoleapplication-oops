import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Random;
public class C{
		
		
		public static final String[] COLORS = {
        "\u001B[35m", // Violet (Magenta)
        "\u001B[34m", // Indigo (Dark Blue)
        "\u001B[34m", // Blue
        "\u001B[32m", // Green
        "\u001B[33m", // Yellow
        "\u001B[38;5;202m", // Orange
        "\u001B[31m", // Red
        "\u001B[37m", // White
        "\u001B[30m", // Black
        "\u001B[36m", // Cyan
        "\u001B[95m", // Light Magenta
        "\u001B[96m", // Light Cyan
        "\u001B[91m", // Light Red
        "\u001B[92m", // Light Green
        "\u001B[93m", // Light Yellow
        "\u001B[94m", // Light Blue
        "\u001B[90m"  // Dark Gray
		};	// Red
	
	public static final String RESET = "\u001B[0m";
    public static final String BLINK = "\u001B[5m"; // ANSI escape code for blinking text
    public static final String NORMAL = "\u001B[25m"; // ANSI escape code to stop blinking
		
	public static String d = "\u001B[0m";//reset
    public static String b="\033[0;1m";//bold
    public static String bli ="\u001B[5m"; //blink
     public static String y ="\u001B[33m";
    public static String r = "\u001B[31m";
    public static String bl = "\u001B[34m";//blue
   public  static String g = "\u001B[32m";
   public static String o="\u001B[38;5;202m";
   public static String p = "\u001B[35m";
  public  static String s = "\u001B[36m";
		
		static void animateText(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Move to the next line after animation completes
        //System.out.println();
    }

    public static void startCountdownN(int countdownStart) throws InterruptedException {
        // Save the current cursor position and print countdown
        int width = 100; // Adjust to your console width
        StringBuilder countdownText = new StringBuilder();
        for (int i = countdownStart; i >= 0; i--) {
            countdownText.setLength(0); // Clear the builder
            countdownText.append(String.format("%" + width + "s", "    "+r+"    Countdown: " + i + " seconds"+d));
            System.out.print("\r" + countdownText);
            Thread.sleep(1000); // Wait for 1 second
        }
        // Print the final message after countdown completes
        System.out.print("\r" + String.format("%" + width + "s", "          "+g+"      Countdown complete!"+d)); // Overwrite the line with the final message
        System.out.println(); // Move to the next line after countdown completes
    }




 public static void animateTextA(String text, int delay) 
    {
        for (char c : text.toCharArray()) 
        {
        System.out.print(c);
        try 
        {
        Thread.sleep(delay);
        } 
        catch (InterruptedException e) 
        {
        e.printStackTrace();
        }
        }
    }
		
	static void clearConsole() 
    {
        try 
        {
        final String os = System.getProperty("os.name");
        if (os.contains("Windows")) 
        {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } 
        else 
        {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        }
        } 
        catch (final Exception e) 
        {
        e.printStackTrace();
        }
    }
	
	
		
		public static String formatDate2(LocalDate date) {
			DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
			return date.format(formatter2);
		}
		
    private static final int CONSOLE_WIDTH = 120; // console width

    // Method to center and print text on line
	public static void cto(String mess){
		System.out.print(centerText(mess));
	}
	//new line
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

        /*// Add additional space to the right if the console width is not evenly divisible
        if (CONSOLE_WIDTH - messageLength - padding > 0) {
            for (int i = 0; i < (CONSOLE_WIDTH - messageLength - padding); i++) {
                sb.append(' ');
            }
        }
*/
        return sb.toString();
    }
	
	public static final String[] COLORS2 = {
    "\u001B[35m", // Violet (Magenta)
    "\u001B[34m", // Indigo (Dark Blue)
    "\u001B[34m", // Blue
    "\u001B[32m", // Green
    "\u001B[33m", // Yellow
    "\u001B[38;5;202m", // Orange 
    "\u001B[31m"  // Red
};
	
	
	public static String asciiArt;
    public static void printAsciiArtWithDiscoColors() throws InterruptedException {
         String asciiArt =
            "                                                * * * * * * *                                                                                             \n"+
            "                                             *                 *                                                                                                    \n"+
            "                                           *                     *                                *                                                                   \n"+
            "                                        *                          *                               *                                                              \n"+
            "                                      *                             *                               *                                                            \n"+
            "                                    *                                *                               *                                                             \n"+
            "                                   *                                  *                               *                                                           \n"+
            "                                  *                                    *                               *                                                            \n"+
            "                                 *                                      *                               *                                                             \n"+
            "                                *                                        *                               *                                                             \n"+
            "                               *                                         *                                *                                                            \n"+
            "                              *                        ***               *                                 *                                                           \n"+
            "                              *                        * *               *                                  *                                                          \n"+
            "                              *                        * *               *                                   *                                                          \n"+
            "                              *                        * *               *                                    *                                                        \n"+
            "                              *                        * *****************    ***************************************                                                        \n"+
            "                              *                        *                            *                          *                                                          \n"+
            "                              *                        *******************          *                          *                                                         \n"+
            "            ***************    *                                         *          *                          *                                                       \n"+
            "            *************  *    *                                       *           *                          *                                                   \n"+
            "                         *  *    *                                     *            *                          *                                                        \n"+
            "                          *  *    *                                   *             *                          *                                                        \n"+
            "                           *  ******                                 ****************                          *****************                                          \n"+
            "                            *  *    *                               *               *                          *              *                                          \n"+
            "                             *  *    *                             *                *                          *             *                                         \n"+
            "                              *  *    ******************          *                 *                          *            *                                                    \n"+
            "                               *  *                    *         *                  *                          *           *                                     \n"+
            "                                *  *        ********** *        *                   *                          *          *                                                \n"+
            "                                 *  *        *       * *       *                    *                          *         *                                     \n"+
            "                                  *  *        *      * *      *                      *                         *        *                                          \n"+
            "                                   *  *        *     * *     *                         *                     * *       *                                           \n"+
            "                                    *  *        *    ***    *                             *               *    *      *                                         \n"+
            "                                     *  *        *         *                                 *  *   *  *       *     *                                                   \n"+
            "                                      *  *        *       *                                                    *    *                                                 \n"+
            "                                       *  *        *     *                                                     *   *                                                \n"+
            "                                        *  *        *   *                                                      *  *                                                  \n"+
            "                                         *  *        * *                                                         *                                              \n"+
            "                                          *  ********************************************************************                                                \n"+
            "                                           *  *                                                                                                               \n"+
            "                                            *  *                                                                                                             \n"+
            "                                             *  ***************************************************************************                                                              \n"+
            "                                              *****************************************************************************                                                             \n"+
            "                                                              *  *                              *  *                                                                   \n"+
            "                                                            *      *                          *      *                                                       \n"+
            "                                                            *      *                          *      *                                                 \n"+
            "                                                              *  *                              *  *                                                                \n";
	//System.out.println(asciiArt);


        String[] lines = asciiArt.split("\n");
        int colorIndex = 0;

        // Print the ASCII art once with a disco colors effect
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            // Colorize each line in a different color
            C.cto(COLORS2[colorIndex] + line + RESET + "\n");
            colorIndex = (colorIndex + 1) % COLORS2.length;
        }

        // Wait for a short period to display the final output
        Thread.sleep(2000); // Adjust the duration as needed
    }
	
	
	//displayDiscoMessage("Thank You Visit Again", 5000);
	
	public static final int DELAY_MS = 100;
	
	public static void displayDiscoMessage(String message, int durationMs) {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + durationMs;

        while (System.currentTimeMillis() < endTime) {
            printDiscoLightMessage(message);
            try {
                Thread.sleep(DELAY_MS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printDiscoLightMessage(String message) {
        // Get console width
        int width = 120; // Adjust as needed for your console

        // Calculate center position
        int x = (width - message.length()) / 2;

        // Print colored text
        String color = getRandomColor();
        System.out.print("\033[" + (x + 1) + "G" + color + message + RESET + "\r");
    }

    public static String getRandomColor() {
        Random rand = new Random();
        return COLORS[rand.nextInt(COLORS.length)];
    }
	//displayDiscoMessage("Thank You Visit Again", 5000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}		
