import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int n = scanner.nextInt();

        //Your code goes here
        int min;
        int hrs;
        min = n/60;
        hrs = min/60;
        System.out.print(hrs + " " + min);


        // closing the scanner object
        scanner.close();
    }
}