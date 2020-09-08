import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hrHand = scanner.nextInt();

        /*
         *  your code goes here
         */
          int hours = hrHand / 30; //hours past without remainder
          int degPast = hours * 30; //deg of integer hours
          int minPast = hrHand - degPast; //original - integer hr deg
          int finalDeg = minPast * 2;
          finalDeg = finalDeg * 6;
          System.out.print(finalDeg);

        // closing the scanner object
        scanner.close();
    }
}