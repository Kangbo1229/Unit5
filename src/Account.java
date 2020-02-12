public class Account {
    private String first;
    private String last;
    private int acctNum;
    private double balance;

    public Account (String first, String last, double balance){
        acctNum = (int)(Math.random()*999)+1;
        this.first=first;
        this.last=last;
        this.balance=balance;
    }
    public Account (Account acc) {
        this(acc.first, acc.last, acc.balance);
    }
    public Account (){
        this.first=" ";
        this.last=" ";
        this.balance=0;
    }
    public void setFirst(String first){
        this.first=first;
    }
    public void setLast(String last){
        this.last=last;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public int getAcctNum(){
        return acctNum;
    }
    public String getFirst(){
        return first;
    }
    public String getLast(){
        return last;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double a){
        balance+=a;
    }
    public boolean withdrawal(double a){
        if(balance-a>=0){
            balance-=a;
            return true;
        }
        else{
            return false;
        }
    }
    public String toString(){
        return "Consumer Name: "+first+" "+last+"\nAccount #:"+acctNum+"\nCurrent Balance: $"+balance;
    }





}
