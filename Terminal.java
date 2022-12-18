import java.util.*;

public class Terminal {
    
    public int cardPick, val,val2;
    private String C1 = "Card 1";
    private String C2 = "Card 2";
    private int userPick;

    static Scanner scan = new Scanner(System.in);
    static Terminal t = new Terminal();
    static Prize p =new Prize();
    static Card c = new Card();
    static Game g = new Game();
    
    public void menu(){
        System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
        System.out.println("Main Menu");
        System.out.println("1. Add Credits\n2. Play Games\n3. Transfer Balance\n4. Redeem Prize\n5. My Account\n6. Exit");
        System.out.print("Go To: ");
        t.userPick = scan.nextInt();
        System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
        respond(t.userPick);
    }

    public void TopUp(){   
        System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
        System.out.println("Add Credits");
        System.out.println("1. Card1\n2. Card2");
        System.out.print("Pick Card: ");
        cardPick = scan.nextInt();
        System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
        card(t.cardPick);

    }

    public void card(int cpick){
        switch (cpick){
            case 1: 
            System.out.println("Card 1 is selected!");
            System.out.print("Top Up: $");
            val = scan.nextInt();
            c.setC1(val);
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            break;
            case 2:
            System.out.println("Card 2 is selected!");
            System.out.print("Top Up: $");
            val2 = scan.nextInt();
            c.setC2(val2);
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            break;
        }
    }

    public void Account(){
        System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
        System.out.println("My Account");
        System.out.println("1. " + C1 + ": " + c.getC1());
        System.out.println("2. " + C2 + ": " + c.getC2());
        System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
        menu();
    }

    public void NewBalance(){
        System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
        System.out.println("New Balance");
        System.out.println("1. " + C1 + ": " + c.getC1());
        System.out.println("2. " + C2 + ": " + c.getC2());
        System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
        menu();
    }

    public void steps(){
        TopUp();
        card(cardPick);
        menu();
    } 

    public void transferBalance(){
        int transferTo;
        int amountTransfer;
        System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
        System.out.println("Transfer Balance");
        System.out.println("1. Card 1 to Card 2\n2. Card 2 to Card 1");
        System.out.print("Pick mode: ");
        transferTo = scan.nextInt();

        switch (transferTo){
            case 1:
            System.out.println("\n" + C1 + " Balance: $" + c.getC1());
            if (c.getC1() == 0){
                System.out.println("Insufficient Balance.");
                System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
                menu();
            }
            else{
            System.out.print("Amount to transfer to " + C2 +": $" );
            amountTransfer = scan.nextInt();
            if(amountTransfer > c.getC1()){
                System.out.println("\nTransaction failed.");
                menu();
                System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            }
            else{
            c.setC2(amountTransfer);
            c.reduceCredit1(amountTransfer);
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            NewBalance();
            menu();
            break;
            }
            }
            case 2:
            System.out.println("\n"+ C2 + " Balance: $" + c.getC2());
            if (c.getC2() == 0){
                System.out.println("Insufficient Balance.");
                System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
                menu();
            }
            else{
            System.out.print("Amount to transfer to " + C1 +": $" );
            amountTransfer = scan.nextInt();
            if(amountTransfer > c.getC1()){
                System.out.println("\nTransaction failed.");
                menu();
                System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            }
            else {
            c.setC1(amountTransfer);
            c.reduceCredit2(amountTransfer);
            System.out.println("\noooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n");
            NewBalance();
            menu();
            break;
            }
            }
            default: menu();
            break;
        }
    }

    public void respond(int pick){
        switch (pick) {          
            case 1: steps();
            break;
            case 2: g.gameSequence();
            break;
            case 3: transferBalance();
            break;
            case 4: p.cardPicker();
            break;
            case 5: Account();
            break;
            case 6: System.exit(0);
            break;
            default: t.menu();
            break;
        }
    }

    
}
