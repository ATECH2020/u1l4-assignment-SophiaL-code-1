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
        int aSec = seconds2;
        int diffSec; //difference of seconds

        int hrSec;
        int minSec;
        int sec;

        diffHrs = bHr - aHr;
        diffMin = bMin - aMin;
        diffSec = bSec - aSec;

        hrSec = diffHrs * 60 * 60;
        minSec = diffMin * 60;
        sec = diffSec;

        System.out.print(hrSec + minSec + sec);


        // closing the scanner object
        scanner.close();
    }
}