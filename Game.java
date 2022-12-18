import java.util.*;
public class Game {

    private static String playerTag;
    private int playerInput; 
    private int computerInput = 0;
    
    static Scanner scan = new Scanner(System.in);
    static Terminal t = new Terminal();
    static Random r = new Random();
    static Prize p = new Prize();
    static Game g = new Game();   
    static Card c = new Card();

    int cardUsed;

    public void setPlayerTag(String playerTag){
        Game.playerTag = playerTag;
    }

    public static String getPlayerTag(){
        return playerTag;
    }

    public void playerLog(){
        String name;
        System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
        System.out.print("Enter Name: ");
        name = scan.nextLine();
        g.setPlayerTag(name);
        System.out.println("Welcome " + getPlayerTag() + "!");
        System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
        t.menu();
    }

    public void cardChecker(){
        System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
        System.out.println("Play Game using a Card");
        System.out.println("1. Card 1\n2. Card 2");
        System.out.print("Use Card #: ");
        cardUsed = scan.nextInt();
        System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
        
        if (cardUsed == 1 && Terminal.c.getC1() > 0){
            Terminal.c.reduceCredit1(5);
            gameMechanics();
        } 
        else if (cardUsed == 2 && Terminal.c.getC2() > 0){
            Terminal.c.reduceCredit2(5);
            gameMechanics();
        }      
        else {
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            System.out.println("No Balance available! Please Top Up to continue.");
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            t.menu();
        }
    }

    public void gameMechanics(){
        System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
        System.out.println("Under, Equal or Over?");
        System.out.println("\nMechanics:\n");
        System.out.println("The game will ask player " + getPlayerTag() + " to prompt his number [1-10] \nbefore PC take its turn.");
        System.out.println("Once player " + getPlayerTag() + " gets the same value, he/she will recieve \ntickets for cool prizes!");
        System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
        gameStart();
    }

    public void gameStart(){
        int ticketWon = r.nextInt(11);
        computerInput = r.nextInt(11);
        System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
        System.out.print(getPlayerTag() + "'s turn: ");
        playerInput = scan.nextInt();    
        System.out.println("PC's turn: " + computerInput);
            
        if (cardUsed == 1){
            if (playerInput == computerInput){
                Prize.setTicket1(ticketWon);
                System.out.println("Result: You guessed it right! Congratulations");
                System.out.println("You won " + ticketWon + " tickets!");
                System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");   
            }
        else if (cardUsed == 2){
                Prize.setTicket2(ticketWon);
                System.out.println("Result: You guessed it right! Congratulations");
                System.out.println("You won " + ticketWon + " tickets!");
                System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            }   
            t.menu();
        }

        if (playerInput < computerInput){
            System.out.println("Result: You lose!");
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            t.menu();
        }
        if (playerInput > computerInput){
            System.out.println("Result: You Lose!");
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            t.menu();
        }        
    }

    public void gameSequence(){
        cardChecker();
    }
}
