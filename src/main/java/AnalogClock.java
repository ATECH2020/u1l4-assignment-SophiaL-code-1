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
          int hours = hrHand / 30;
          int degPast = hours * 30;
          int minPast = hrHand - degPast;
          int minHandDeg = (30 - minPast) * 6;
          System.out.print(minHandDeg);
      

        // closing the scanner object
        scanner.close();
    }
}