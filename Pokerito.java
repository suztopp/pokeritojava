import java.util.Scanner;

import java.lang.Math;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Let's Play Pokerito! Type anything when you're ready: ");
        scan.nextLine();

        System.out.println("\nIt's like Poker, but a lot simpler.");
        System.out.println(" • There are two players, you and the computer."); 
        System.out.println(" • The dealer will give each player one card");
        System.out.println(" • Then, the dealer will draw five cards (the river)");
        System.out.println(" • The player with the most river matches wins!");
        System.out.println(" • If the matches are equal, everyone's a winner!");
        System.out.print(" • Ready? Type anything if you are...");

        scan.nextLine();
        
        System.out.println("Here's your card: ");
        String yourFirstCard = randomCard();
        System.out.println(yourFirstCard);
        System.out.println("Here's the computer's card: ");
        String compFirstCard = randomCard();
        System.out.println(compFirstCard);

        int yourMatches = 0;
        int computerMatches =0;

        System.out.println("\nNow, the dealer will draw five cards. Press enter to continue: ");
        scan.nextLine();
        System.out.println("\nYour set of cards: ");
        String card1 = randomCard();
        System.out.println("Your card 1: " + card1);
        String card2 = randomCard();
        System.out.println("Your card 3: " + card2);
        String card3 = randomCard();
        System.out.println("Your card 3: " + card3);
        String card4 = randomCard();
        System.out.println("Your card 4: " + card4);
        String card5 = randomCard();
        System.out.println("Your card 5: " + card5);

        System.out.println("\nThe Computer set of cards: ");
        String comp1 = randomCard();
        System.out.println("Computer Card 1: " + comp1);
        String comp2 = randomCard();
        System.out.println("Computer Card 2: " + comp2);
        String comp3 = randomCard();
        System.out.println("Computer Card 3: " + comp3);
        String comp4 = randomCard();
        System.out.println("Computer Card 4: " + comp4);
        String comp5 = randomCard();
        System.out.println("Computer Card 5: " + comp5);

            if (card1.equals(yourFirstCard)) {
                yourMatches += 1;
            }
            if (card2.equals(yourFirstCard)) {
                yourMatches += 1;
            }
            if (card3.equals(yourFirstCard)) {
                yourMatches += 1;
            }
            if (card4.equals(yourFirstCard)) {
                yourMatches += 1;
            }
            if (card5.equals(yourFirstCard)) {
                yourMatches += 1;
            } 

            if (comp1.equals(compFirstCard)) {
                computerMatches += 1;
            }
            if (comp2.equals(compFirstCard)) {
                computerMatches += 1;
            }
            if (comp3.equals(compFirstCard)) {
                computerMatches += 1;
            }
            if (comp4.equals(compFirstCard)) {
                computerMatches += 1;
            }
            if (comp5.equals(compFirstCard)) {
                computerMatches += 1;
            } 

        System.out.println("Your number of matches is: " + yourMatches);
        System.out.println("Computer's number of matches is: " + computerMatches);

        String winner = "";

        if (yourMatches > computerMatches) {
            winner = "YOU";
        } else if (yourMatches == computerMatches) {
            winner = "YOU TIED!!";
        } else {
            winner = "COMPUTER";
        }

        System.out.println("THE WINNER IS ----- " + winner);

        scan.close();
    }

    public static String randomCard() {
        int randNumber = ((int)(Math.random() * 13)) + 1;
        switch (randNumber) {
            case 1:
                return
                "   _____\n"+
                "  |A _  |\n"+ 
                "  | ( ) |\n"+
                "  |(_'_)|\n"+
                "  |  |  |\n"+
                "  |____V|\n";
            case 2:
                return 
                "   _____\n"+              
                "  |2    |\n"+ 
                "  |  o  |\n"+
                "  |     |\n"+
                "  |  o  |\n"+
                "  |____Z|\n";
            case 3:
                return
                "   _____\n" +
                "  |3    |\n"+
                "  | o o |\n"+
                "  |     |\n"+
                "  |  o  |\n"+
                "  |____E|\n";
            case 4:
                return
                "   _____\n" +
                "  |4    |\n"+
                "  | o o |\n"+
                "  |     |\n"+
                "  | o o |\n"+
                "  |____h|\n";
            case 5:
                return
                "   _____ \n" +
                "  |5    |\n" +
                "  | o o |\n" +
                "  |  o  |\n" +
                "  | o o |\n" +
                "  |____S|\n";
            case 6:
                return
                "   _____ \n" +
                "  |6    |\n" +
                "  | o o |\n" +
                "  | o o |\n" +
                "  | o o |\n" +
                "  |____6|\n";
            case 7:
                return
                "   _____ \n" +
                "  |7    |\n" +
                "  | o o |\n" +
                "  |o o o|\n" +
                "  | o o |\n" +
                "  |____7|\n";
            case 8:
                return
                "   _____ \n" +
                "  |8    |\n" +
                "  |o o o|\n" +
                "  | o o |\n" +
                "  |o o o|\n" +
                "  |____8|\n";
            case 9:
                return
                "   _____ \n" +
                "  |9    |\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |____9|\n";
            case 10:
                return
                "   _____ \n" +
                "  |10  o|\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |___10|\n";
            case 11:
                return
                "   _____\n" +
                "  |J  ww|\n"+ 
                "  | o {)|\n"+ 
                "  |o o% |\n"+ 
                "  | | % |\n"+ 
                "  |__%%[|\n";
            case 12:
                return
                "   _____\n" +
                "  |Q  ww|\n"+ 
                "  | o {(|\n"+ 
                "  |o o%%|\n"+ 
                "  | |%%%|\n"+ 
                "  |_%%%O|\n";
            case 13:
                return
                "   _____\n" +
                "  |K  WW|\n"+ 
                "  | o {)|\n"+ 
                "  |o o%%|\n"+ 
                "  | |%%%|\n"+ 
                "  |_%%%>|\n";
            default:
                return "NO CHOICE";
        }
    }

}
