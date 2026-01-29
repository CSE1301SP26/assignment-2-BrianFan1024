import java.util.Scanner;

public class Nim {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    System.out.print("Please enter the starting number.");
    int startingNumber = in.nextInt();

    int numberLeft = startingNumber;
    int numberStart = 0;
    int round = 0;
    String player = ("human");


    while (numberLeft>0) {
        System.out.print("How many sticks to take out?");
        int humanSticks = in.nextInt();
        if (humanSticks<1 || humanSticks>2) {
            System.out.print("Not valid, please enter again: ");
        }
        else {
            player = ("human");
            numberStart=numberLeft;
            numberLeft = (numberLeft - humanSticks);
            System.out.println("Round " + round + ": " + numberStart + " at start " + player + " takes " + humanSticks + ", so " + numberLeft + " remain.");
            if (numberLeft <= 0) {
                System.out.println ("You lose.");
                break;
            }
            else {
                round ++;
                player = ("computer");
                int computerSticks = (int)(Math.random() * 2) + 1;
                numberStart=numberLeft;
                numberLeft = (numberLeft - computerSticks);
                System.out.println("Round " + round + ": " + numberStart + " at start " + player + " takes " + computerSticks + ", so " + numberLeft + " remain.");
                if (numberLeft <= 0) {
                    System.out.println ("You win.");
                    break;                        
                }
                else {
                    round ++;
                }
            }


        }



    }



}
}
