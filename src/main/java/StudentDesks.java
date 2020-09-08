import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int StuNumA = scanner.nextInt();
        int StuNumB = scanner.nextInt();
        int StuNumC = scanner.nextInt();

        int Adesks;
        int Bdesks;
        int Cdesks;

        /*
         *  your code goes here
         */
        
        if (StuNumA % 2 == 0)
        {
          Adesks = StuNumA/2;
        } else {
          Adesks = (StuNumA/2) + 1;
        }

        if (StuNumB % 2 == 0)
        {
          Bdesks = StuNumB/2;
        } else {
          Bdesks = (StuNumB/2) + 1;
        }

        if (StuNumC % 2 == 0)
        {
          Cdesks = StuNumC/2;
        } else {
          Cdesks = (StuNumC/2) + 1;
        }

        System.out.print(Adesks + Bdesks + Cdesks);
        
        // closing the scanner object
        scanner.close();
    }
}