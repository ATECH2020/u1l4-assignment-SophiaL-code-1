import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();


        /*
         *  your code goes here
         */
        int bHr = hours1; //renaming to help me understand
        int aHr = hours2; //a stands for after b stands for before
        int diffHrs; //difference of hours
        int bMin = minutes1;
        int aMin = minutes2;
        int diffMin; //difference of minutes
        int bSec = seconds1;
        int aSec = seconds2:
        int diffSec; //difference of seconds

        

        // closing the scanner object
        scanner.close();
    }
}