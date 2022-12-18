public class Card {

    Terminal t = new Terminal();
    
    private int card1Balance = 0;
    private int card2Balance = 0;

    public void setC1(int val){
        this.card1Balance += val;
    }
    public void setC2(int val2){
        this.card2Balance += val2;
    }
    public int getC1(){
        return this.card1Balance;
    }
    public int getC2(){
        return this.card2Balance;
    }
    public void reduceCredit1(int amount){
        this.card1Balance -= amount;
    }
    public void reduceCredit2(int amount){
        this.card2Balance -= amount;
    }
}

