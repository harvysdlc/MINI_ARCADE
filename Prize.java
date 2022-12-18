import java.util.*;

public class Prize {

    static Scanner scan = new Scanner(System.in); 
    static Terminal t = new Terminal();
    static Random r = new Random();
    static Prize p = new Prize();
    static Card c = new Card();
    static Game g = new Game();
    static int prize[] = {10, 25, 50, 75, 100};
    static int reduce[] = {5, 10, 25, 50, 75};
    
    public static int pickPrize, usedCard;
    private static int ticketBalance1 = 0;
    private static int ticketBalance2 = 0;

    public static void setTicket1(int ticketWon){
        Prize.ticketBalance1 += ticketWon;
    }
    public static void setTicket2(int ticketWon){
        Prize.ticketBalance2 += ticketWon;
    }
    public int getTicket1(){
        return Prize.ticketBalance1;
    }
    public int getTicket2(){
        return Prize.ticketBalance2;
    }
    public void reduceTicket1(int amount){
        Prize.ticketBalance1 -= amount;
    }
    public void reduceTicket2(int amount){
        Prize.ticketBalance2 -= amount;
    }

    public void cardPicker(){
        System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
        System.out.println("Redeem Prize using a Card");
        System.out.println("1. Card 1: "+ getTicket1() +" tickets" + "\n2. Card 2: " + getTicket2() +" tickets");
        System.out.print("Use Card #: ");
        usedCard = scan.nextInt();
        System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
        prizeList();
    }

    public void prizeList(){
        System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
        System.out.println("Prize List");
        System.out.println("1. " + prize[0] +"  Credits for  5 tickets");
        System.out.println("2. " + prize[1] +"  Credits for 10 tickets");
        System.out.println("3. " + prize[2] +"  Credits for 25 tickets");
        System.out.println("4. " + prize[3] +"  Credits for 50 tickets");
        System.out.println("5. " + prize[4] +" Credits for 75 tickets");
        System.out.print("Redeem: ");
        pickPrize = scan.nextInt();
        System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
        redeemPrize();
    }

    public void redeemPrize(){

        if(usedCard == 1 && getTicket1() == 0){
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            System.out.println("No Tickets available. Play a game to get tickets!");
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            t.menu();
        }
        else if(usedCard ==1 && getTicket1() >=5 && pickPrize == 1){
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            System.out.println("Thankyou for redeeming! You succesfully get " + prize[0] + " Credits");
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            Terminal.c.setC1(prize[0]);
            p.reduceTicket1(Prize.reduce[0]);
            t.menu();
        }
        else if(usedCard ==1 && getTicket1() >=5 && pickPrize == 2){
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            System.out.println("Thankyou for redeeming! You succesfully get " + prize[1] + " Credits");
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            Terminal.c.setC1(prize[1]);
            p.reduceTicket1(Prize.reduce[1]);
            t.menu();
        }
        else if(usedCard ==1 && getTicket1() >=5 && pickPrize == 3){
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            System.out.println("Thankyou for redeeming! You succesfully get " + prize[2] + " Credits");
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            Terminal.c.setC1(prize[2]);
            p.reduceTicket1(Prize.reduce[2]);
            t.menu();
        }
        else if(usedCard ==1 && getTicket1() >=5 && pickPrize == 4){
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            System.out.println("Thankyou for redeeming! You succesfully get " + prize[3] + " Credits");
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            Terminal.c.setC1(prize[3]);
            p.reduceTicket1(Prize.reduce[3]);
            t.menu();
        }
        else if(usedCard ==1 && getTicket1() >=5 && pickPrize == 5){
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            System.out.println("Thankyou for redeeming! You succesfully get " + prize[4] + " Credits");
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            Terminal.c.setC1(prize[4]);
            p.reduceTicket1(Prize.reduce[4]);
            t.menu();
        }

        else if(usedCard == 2 && getTicket2()  == 0){
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            System.out.println("No Tickets available. Play a game to get tickets!");
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            t.menu();
        }
        else if(usedCard ==2 && getTicket2() >=5 && pickPrize == 1){
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            System.out.println("Thankyou for redeeming! You succesfully get " + prize[0] + " Credits");
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            Terminal.c.setC2(prize[0]);
            p.reduceTicket2(Prize.reduce[0]);
            t.menu();
        }
        else if(usedCard ==2 && getTicket2() >=5 && pickPrize == 2){
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            System.out.println("Thankyou for redeeming! You succesfully get " + prize[1] + " Credits");
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            Terminal.c.setC2(prize[1]);
            p.reduceTicket2(Prize.reduce[1]);
            t.menu();
        }
        else if(usedCard ==2 && getTicket2() >=5 && pickPrize == 3){
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            System.out.println("Thankyou for redeeming! You succesfully get " + prize[2] + " Credits");
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            Terminal.c.setC2(prize[2]);
            p.reduceTicket2(Prize.reduce[2]);
            t.menu();
        }
        else if(usedCard ==2 && getTicket2() >=5 && pickPrize == 4){
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            System.out.println("Thankyou for redeeming! You succesfully get " + prize[3] + " Credits");
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            Terminal.c.setC2(prize[3]);
            p.reduceTicket2(Prize.reduce[3]);
            t.menu();
        }
        else if(usedCard ==2 && getTicket2() >=5 && pickPrize == 5){
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            System.out.println("Thankyou for redeeming! You succesfully get " + prize[4] + " Credits");
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            Terminal.c.setC2(prize[4]);
            p.reduceTicket2(Prize.reduce[4]);
            t.menu();
        }
        else if(usedCard ==1 || usedCard ==2 && getTicket1() >=5 || getTicket2() >=5 && pickPrize > 5){
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            System.out.println("Wrong Input!");
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            prizeList();
        }
        else if (usedCard > 2){
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            System.out.println("Wrong Input!");
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            cardPicker();
        }
    }
}
