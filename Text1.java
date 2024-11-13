import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Text1 {
    // ANSI escape codes for colors
    public static final String[] COLORS = {
    "\u001B[35m", // Violet (Magenta)
    "\u001B[34m", // Indigo (Dark Blue)
    "\u001B[34m", // Blue
    "\u001B[32m", // Green
    "\u001B[33m", // Yellow
    "\u001B[38;5;202m", // Orange 
    "\u001B[31m"  // Red
};

    public static final String RESET = "\u001B[0m";
    public static final String BLINK = "\u001B[5m"; // ANSI escape code for blinking text
    public static final String NORMAL = "\u001B[25m"; // ANSI escape code to stop blinking

    public static void main(String[] args) {
        try {
            // Print the ASCII art with disco colors effect
            printAsciiArtWithDiscoColors();
        } catch (InterruptedException e) {
            System.err.println("Animation interrupted.");
            Thread.currentThread().interrupt(); // Preserve the interrupt status
        }
    }
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
            C.cto(COLORS[colorIndex] + line + RESET + "\n");
            colorIndex = (colorIndex + 1) % COLORS.length;
        }

        // Wait for a short period to display the final output
        Thread.sleep(2000); // Adjust the duration as needed
    }
}
